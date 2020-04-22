package unused_failed;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.impl.Java8FactoryImpl;
import de.uni_koblenz.jgralab.Vertex;

public class Parser { 
	
	private Java8 astGraph;

	private Mapping mapping;
	private Visitor visitor;
	private LinkedList<CompilationUnit> units;
	
	private BindingManager bindings;

	private boolean reducedMode = false;
	
	public Parser() {
		this.astGraph = Java8Schema.instance().createJava8(new Java8FactoryImpl());
		
		this.mapping = new Mapping();
		this.units = new LinkedList<CompilationUnit>();

		// Extras
		this.bindings = new BindingManager(astGraph);
	}

	public Java8 getGraph() {
		return astGraph;
	}
	
	public void parseProject(IJavaProject project) {
		de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProject node = astGraph.createIJavaProject();
		node.setAttribute("name", project.getProject().getName());
		try {
			IPackageFragment[] frags = project.getPackageFragments();
			for (IPackageFragment frag : frags) {
				if (frag.getKind() == IPackageFragmentRoot.K_SOURCE && frag.getChildren().length > 0) {
					de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment root = astGraph.createIPackageFragment();
					root.setAttribute("name", frag.getElementName());
					astGraph.createIJavaProjectFragements(node, root);
					parse(frag, root);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		bindings.finish();
	}
	
	private void parse(IPackageFragment frag, Vertex parent) {
		try {
			ICompilationUnit[] units = frag.getCompilationUnits();
			for (ICompilationUnit unit : units) {
				parse(unit, parent);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	private void parse(ICompilationUnit unit, Vertex parent) {
		try {
			ASTParser parser = ASTParser.newParser(AST.JLS8);//JLS8);
			parser.setKind(ASTParser.K_COMPILATION_UNIT);
			parser.setResolveBindings(true);
			parser.setBindingsRecovery(true);
			parser.setSource(unit);
			CompilationUnit ast = (CompilationUnit)parser.createAST(null);
			visitor = new Visitor(astGraph, parent, mapping, ast);
			visitor.addExtra(bindings);
			visitor.setReducedMode(reducedMode);
			ast.accept(visitor);
			ast.recordModifications();
			units.add(ast);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void parseFiles(List<char[]> sources) {
		try {
			for(char[] s : sources) {
				ASTParser parser = ASTParser.newParser(AST.JLS8);
				parser.setKind(ASTParser.K_COMPILATION_UNIT);
				parser.setResolveBindings(true);
				parser.setBindingsRecovery(true);
				parser.setSource(s);
				Map options = JavaCore.getOptions();
				JavaCore.setComplianceOptions(JavaCore.VERSION_1_8, options); 
				parser.setCompilerOptions(options);
				CompilationUnit ast = (CompilationUnit)parser.createAST(null);
				//System.out.println(ast.getCommentList().size());
				//System.out.println(((LineComment)ast.getCommentList().get(0)).getLength());
				visitor = new Visitor(astGraph, null, mapping, ast);
				visitor.addExtra(bindings);
				visitor.setReducedMode(reducedMode);
				ast.accept(visitor);
				//ast.recordModifications();
				units.add(ast);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		bindings.finish();
	}

	public void parseFile(File f) {
		final String PATHSEPARATOR = File.separator;
		try {
			String s = new String(Files.readAllBytes(Paths.get(f.toURI())));
			ASTParser parser = ASTParser.newParser(AST.JLS8);
			parser.setKind(ASTParser.K_COMPILATION_UNIT);
			parser.setResolveBindings(true);
			parser.setBindingsRecovery(true);

			Map options = JavaCore.getOptions();
			JavaCore.setComplianceOptions(JavaCore.VERSION_1_8, options);
			parser.setCompilerOptions(options);

			parser.setUnitName(f.getName());

			String sourcePath = f.getAbsolutePath();
			// getSrcPath
			if (s.startsWith("package")) {
				// cut package
				String packageName = s.substring(new String("package").length(), s.length()).trim();
				packageName = packageName.substring(0, packageName.indexOf(";"));
				packageName = packageName.replace(".", PATHSEPARATOR);

				sourcePath = sourcePath.substring(0, sourcePath.lastIndexOf(packageName) + packageName.length());
				System.out.println(sourcePath);
			} else {
				sourcePath = sourcePath.substring(0, sourcePath.length() - f.getName().length());
			}
			String pathToRtJar = System.getProperty("java.home") + PATHSEPARATOR + "lib" + PATHSEPARATOR + "rt.jar";
			String[] sources = { sourcePath };
			String[] classPath = { pathToRtJar };

			parser.setEnvironment(classPath, sources, new String[] { "UTF-8" }, true);
			parser.setSource(s.toCharArray());

			CompilationUnit ast = (CompilationUnit) parser.createAST(null);
			// System.out.println(ast.getCommentList().size());
			// System.out.println(((LineComment)ast.getCommentList().get(0)).getLength());
			visitor = new Visitor(astGraph, null, mapping, ast);
			visitor.addExtra(bindings);
			visitor.setReducedMode(reducedMode);
			ast.accept(visitor);
			// ast.recordModifications();
			units.add(ast);
		} catch (Exception e) {
			e.printStackTrace();
		}

		bindings.finish();
	}

	public int getUnitCount() {
		return units.size();
	}
	
	public Mapping getMapping() {
		return mapping;
	}
	
	public LinkedList<CompilationUnit> getUnits() {
		return units;
	}
	
	public void setReducedMode(boolean reducedMode) {
		this.reducedMode = reducedMode;
	}
}
