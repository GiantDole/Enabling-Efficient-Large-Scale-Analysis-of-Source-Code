package code.parser;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;

import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.parser.BindingManager;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.parser.Mapping;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.parser.Visitor;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.impl.Java8FactoryImpl;

public class JavaParser extends Parser{
	
	private Java8 astGraph;
	private Visitor visitor;
	private LinkedList<CompilationUnit> units;
	private Mapping mapping;
	private BindingManager bindings;
	private boolean reducedMode = false;
	
	public JavaParser() {
		this.astGraph = Java8Schema.instance().createJava8(new Java8FactoryImpl());
		
		this.mapping = new Mapping();
		this.units = new LinkedList<CompilationUnit>();

		// Extras
		this.bindings = new BindingManager(astGraph);
	}
	
	@Override
	public Java8 getGraph() {
		return astGraph;
	}
	
	@Override
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

}
