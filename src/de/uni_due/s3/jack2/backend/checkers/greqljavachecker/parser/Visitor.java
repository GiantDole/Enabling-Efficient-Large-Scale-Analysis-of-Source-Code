package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.parser;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.apache.log4j.Logger;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;
import org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration;
import org.eclipse.jdt.core.dom.AnonymousClassDeclaration;
import org.eclipse.jdt.core.dom.ArrayAccess;
import org.eclipse.jdt.core.dom.ArrayCreation;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.ArrayType;
import org.eclipse.jdt.core.dom.AssertStatement;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BlockComment;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.BreakStatement;
import org.eclipse.jdt.core.dom.CastExpression;
import org.eclipse.jdt.core.dom.CatchClause;
import org.eclipse.jdt.core.dom.CharacterLiteral;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.ConstructorInvocation;
import org.eclipse.jdt.core.dom.ContinueStatement;
import org.eclipse.jdt.core.dom.CreationReference;
import org.eclipse.jdt.core.dom.DoStatement;
import org.eclipse.jdt.core.dom.EmptyStatement;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.ExpressionMethodReference;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.InstanceofExpression;
import org.eclipse.jdt.core.dom.IntersectionType;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.LabeledStatement;
import org.eclipse.jdt.core.dom.LambdaExpression;
import org.eclipse.jdt.core.dom.LineComment;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberRef;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.MethodRef;
import org.eclipse.jdt.core.dom.MethodRefParameter;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NameQualifiedType;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.PackageDeclaration;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.PostfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.QualifiedType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.StructuralPropertyDescriptor;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.SuperFieldAccess;
import org.eclipse.jdt.core.dom.SuperMethodInvocation;
import org.eclipse.jdt.core.dom.SuperMethodReference;
import org.eclipse.jdt.core.dom.SwitchCase;
import org.eclipse.jdt.core.dom.SwitchStatement;
import org.eclipse.jdt.core.dom.SynchronizedStatement;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TextElement;
import org.eclipse.jdt.core.dom.ThisExpression;
import org.eclipse.jdt.core.dom.ThrowStatement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclarationStatement;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.TypeMethodReference;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.jdt.core.dom.UnionType;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.eclipse.jdt.core.dom.WildcardType;

import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8;
import de.uni_koblenz.jgralab.Edge;
import de.uni_koblenz.jgralab.Vertex;
import de.uni_koblenz.jgralab.schema.EdgeClass;
import de.uni_koblenz.jgralab.schema.VertexClass;

public class Visitor extends ASTVisitor {

	private Vertex astGraphNode;
	private Stack<MethodDeclaration> currentMethodStack = new Stack<MethodDeclaration>();
	private Stack<TypeDeclaration> currentTypeStack = new Stack<TypeDeclaration>();

	private LinkedList<IVisitorExtra> extras = new LinkedList<IVisitorExtra>();
	private Java8 graph;

	private Mapping mapping;

	private Stack<Vertex> oldAggNodes = new Stack<Vertex>();
	private Stack<Vertex> oldParentAggNodes = new Stack<Vertex>();

	private Vertex parentAstGraphNode;
	private boolean reducedMode = false;

	private Vertex rootAstGraphNode;
	private CompilationUnit unit;

	public Visitor(Java8 astGraph, Vertex parentNode, Mapping mapping, CompilationUnit unit) {
		this.rootAstGraphNode = parentNode;
		this.parentAstGraphNode = parentNode;
		this.graph = astGraph;
		this.mapping = mapping;
		this.unit = unit;
	}

	public void addExtra(IVisitorExtra extra) {
		if (!extras.contains(extra)) extras.add(extra);
	}

	private int checkProperty(StructuralPropertyDescriptor descriptor, ASTNode node) {
		Object property = node.getParent().getStructuralProperty(descriptor);
		if (property instanceof List) {
			if (((List<?>)property).contains(node)) {
				return ((List<?>)property).indexOf(node);
			}
		}
		return -1;
	}

	private void createParentArc(ASTNode node, Vertex source, Vertex target) {
		StructuralPropertyDescriptor descriptor = node.getLocationInParent();
		String label = "";
		int position = -1;
		if (descriptor != null) {
			label = descriptor.getId();
			position = checkProperty(descriptor, node);
		}

		Edge edge = null;

		for (EdgeClass e : graph.getSchema().getGraphClass().getEdgeClasses()) { //graph.getSchema().getEdgeClassesInTopologicalOrder()
			if (!e.getSimpleName().equals("Edge") && !e.getSimpleName().equals("Child") && !e.getSimpleName().equals("Access")) {
				VertexClass from = e.getFrom().getVertexClass();
				VertexClass to = e.getTo().getVertexClass();
				//				System.out.println("from " + from + " to " + to);

				if (matchRolename(e.getTo().getRolename(), label) && (source.getAttributedElementClass().equals(from) || source.getAttributedElementClass().isSubClassOf(from)) && (target.getAttributedElementClass().equals(to) || target.getAttributedElementClass().isSubClassOf(to))) {
					if (edge != null)
						Logger.getRootLogger().warn("Found more than one candidate from " + from.getSimpleName() + " to " + to.getSimpleName() + "! Label is '" + label + "'");
					//edge = graph.createEdge(e.getGraphClass().getDefaultEdgeClass(), source, target); //getM1Class()
					edge = graph.createEdge(e.getGraphClass().getEdgeClass(e.getSimpleName()),source, target);
				}
			}
		}

		if (edge != null && position > -1)
			edge.setAttribute("position", position);
	}

	public void endVisit(AnnotationTypeDeclaration node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}


	public void endVisit(AnnotationTypeMemberDeclaration node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(AnonymousClassDeclaration node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ArrayAccess node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ArrayCreation node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ArrayInitializer node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ArrayType node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(AssertStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(Assignment node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(Block node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(BlockComment node) {
	}

	public void endVisit(BooleanLiteral node) {
	}

	public void endVisit(BreakStatement node) {
	}

	public void endVisit(CastExpression node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(CatchClause node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(CharacterLiteral node) {
	}

	public void endVisit(ClassInstanceCreation node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(CompilationUnit node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ConditionalExpression node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ConstructorInvocation node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ContinueStatement node) {
	}

	public void endVisit(CreationReference node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(DoStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(EmptyStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(EnhancedForStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(EnumConstantDeclaration node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(EnumDeclaration node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ExpressionMethodReference node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ExpressionStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(FieldAccess node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(FieldDeclaration node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ForStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(IfStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ImportDeclaration node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(InfixExpression node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(Initializer node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(InstanceofExpression node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(IntersectionType node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(Javadoc node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(LabeledStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(LambdaExpression node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(LineComment node) {
	}

	public void endVisit(MarkerAnnotation node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(MemberRef node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(MemberValuePair node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(MethodDeclaration node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
		//currentMethodStack.pop();
	}

	public void endVisit(MethodInvocation node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(MethodRef node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(MethodRefParameter node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(Modifier node) {
	}

	public void endVisit(NameQualifiedType node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(NormalAnnotation node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(NullLiteral node) {
	}

	public void endVisit(NumberLiteral node) {
	}

	public void endVisit(PackageDeclaration node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ParameterizedType node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ParenthesizedExpression node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(PostfixExpression node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(PrefixExpression node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(PrimitiveType node) {
	}

	public void endVisit(QualifiedName node) {
		if (node.getParent() instanceof ImportDeclaration && node.getLocationInParent().equals(ImportDeclaration.NAME_PROPERTY)) return;
		if (node.getParent() instanceof PackageDeclaration && node.getLocationInParent().equals(PackageDeclaration.NAME_PROPERTY)) return;
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(QualifiedType node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ReturnStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(SimpleName node) {
	}

	public void endVisit(SimpleType node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(SingleMemberAnnotation node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(SingleVariableDeclaration node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(StringLiteral node) {
	}

	public void endVisit(SuperConstructorInvocation node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(SuperFieldAccess node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(SuperMethodInvocation node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(SuperMethodReference node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(SwitchCase node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(SwitchStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(SynchronizedStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(TagElement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(TextElement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ThisExpression node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(ThrowStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(TryStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(TypeDeclaration node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
		currentTypeStack.pop();
	}

	public void endVisit(TypeDeclarationStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(TypeLiteral node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(TypeMethodReference node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(TypeParameter node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(UnionType node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(VariableDeclarationExpression node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(VariableDeclarationFragment node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(VariableDeclarationStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(WhileStatement node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	public void endVisit(WildcardType node) {
		parentAstGraphNode = oldParentAggNodes.pop();
		astGraphNode = oldAggNodes.pop();
	}

	private boolean matchRolename(String role, String label) {
		if (role.equals(label))
			return true;
		if (role.startsWith(label) && role.substring(label.length()).matches("\\d+"))
			return true;
		return false;
	}

	public void postVisit(ASTNode node) {
	}

	public void preVisit(ASTNode node) {

	}

	public void removeExtra(IVisitorExtra extra) {
		if (extras.contains(extra)) extras.remove(extra);
	}

	private void runExtras(ASTNode node) {
		for (IVisitorExtra extra : extras) {
			MethodDeclaration currentMethod = null;
			TypeDeclaration currentType = null;
			if (!currentMethodStack.isEmpty())
				currentMethod = currentMethodStack.peek();
			if (!currentTypeStack.isEmpty())
				currentType = currentTypeStack.peek();
			extra.handle(mapping, node, astGraphNode, parentAstGraphNode, currentMethod, currentType, rootAstGraphNode);
		}
	}

	public void setReducedMode(boolean reducedMode) {
		this.reducedMode = reducedMode;
	}

	private void standardVisit(ASTNode node) {
		if (parentAstGraphNode != null) createParentArc(node, parentAstGraphNode, astGraphNode);

		if (!reducedMode)
			astGraphNode.setAttribute("line", unit.getLineNumber(node.getStartPosition()));

		mapping.put(astGraphNode, node);

		runExtras(node);

		if (astGraphNode == null)
			astGraphNode = parentAstGraphNode;

		oldAggNodes.push(astGraphNode);
		oldParentAggNodes.push(parentAstGraphNode);
		parentAstGraphNode = astGraphNode;
	}

	public boolean visit(AnnotationTypeDeclaration node) {
		astGraphNode = graph.createAnnotationTypeDeclaration();
		standardVisit(node);
		return true;
	}

	public boolean visit(AnnotationTypeMemberDeclaration node) {
		astGraphNode = graph.createAnnotationTypeMemberDeclaration();
		standardVisit(node);
		return true;
	}

	public boolean visit(AnonymousClassDeclaration node) {
		astGraphNode = graph.createAnonymousClassDeclaration();
		standardVisit(node);
		return true;
	}

	public boolean visit(ArrayAccess node) {
		astGraphNode = graph.createArrayAccess();
		standardVisit(node);
		return true;
	}

	public boolean visit(ArrayCreation node) {
		astGraphNode = graph.createArrayCreation();
		standardVisit(node);
		return true;
	}

	public boolean visit(ArrayInitializer node) {
		astGraphNode = graph.createArrayInitializer();
		standardVisit(node);
		return true;
	}

	public boolean visit(ArrayType node) {
		astGraphNode = graph.createArrayType();
		standardVisit(node);
		if (!reducedMode)
			astGraphNode.setAttribute("dimensions", node.getDimensions());
		return true;
	}

	public boolean visit(AssertStatement node) {
		astGraphNode = graph.createAssertStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(Assignment node) {
		astGraphNode = graph.createAssignment();
		standardVisit(node);
		if (!reducedMode)
			astGraphNode.setAttribute("name", node.getStructuralProperty(Assignment.OPERATOR_PROPERTY).toString());
		return true;
	}

	public boolean visit(Block node) {
		astGraphNode = graph.createBlock();
		standardVisit(node);
		return true;
	}

	public boolean visit(BlockComment node) {
		//standardVisit(node);
		return false;
	}

	public boolean visit(BooleanLiteral node) {
		astGraphNode = graph.createBooleanLiteral();
		if (!reducedMode) {
			astGraphNode.setAttribute("line", unit.getLineNumber(node.getStartPosition()));
			astGraphNode.setAttribute("content", node.getStructuralProperty(BooleanLiteral.BOOLEAN_VALUE_PROPERTY).toString());
			createParentArc(node, parentAstGraphNode, astGraphNode);

			runExtras(node);
			mapping.put(astGraphNode, node);
		}

		return false;
	}

	public boolean visit(BreakStatement node) {
		astGraphNode = graph.createBreakStatement();
		if (!reducedMode) {
			astGraphNode.setAttribute("line", unit.getLineNumber(node.getStartPosition()));
			createParentArc(node, parentAstGraphNode, astGraphNode);
			Object label = node.getStructuralProperty(BreakStatement.LABEL_PROPERTY);
			if (label != null) {
				astGraphNode.setAttribute("name", label.toString());
			} else {
				astGraphNode.setAttribute("name", "");
			}

			runExtras(node);
			mapping.put(astGraphNode, node);
		}

		return false;
	}

	public boolean visit(CastExpression node) {
		astGraphNode = graph.createCastExpression();
		standardVisit(node);
		return true;
	}

	public boolean visit(CatchClause node) {
		astGraphNode = graph.createCatchClause();
		standardVisit(node);
		return true;
	}

	public boolean visit(CharacterLiteral node) {
		astGraphNode = graph.createCharacterLiteral();
		if (!reducedMode) {
			astGraphNode.setAttribute("line", unit.getLineNumber(node.getStartPosition()));
			astGraphNode.setAttribute("content", node.getStructuralProperty(CharacterLiteral.ESCAPED_VALUE_PROPERTY));
			createParentArc(node, parentAstGraphNode, astGraphNode);

			runExtras(node);
			mapping.put(astGraphNode, node);
		}

		return false;
	}

	public boolean visit(ClassInstanceCreation node) {
		astGraphNode = graph.createClassInstanceCreation();
		standardVisit(node);
		return true;
	}

	public boolean visit(CompilationUnit node) {
		astGraphNode = graph.createCompilationUnit();
		standardVisit(node);
		if (!reducedMode && node.getJavaElement() != null)
			astGraphNode.setAttribute("name", node.getJavaElement().getElementName().toString());

		return true;
	}

	public boolean visit(ConditionalExpression node) {
		astGraphNode = graph.createConditionalExpression();
		standardVisit(node);
		return true;
	}

	public boolean visit(ConstructorInvocation node) {
		astGraphNode = graph.createConstructorInvocation();
		standardVisit(node);
		return true;
	}

	public boolean visit(ContinueStatement node) {
		astGraphNode = graph.createContinueStatement();
		if (!reducedMode) {
			astGraphNode.setAttribute("line", unit.getLineNumber(node.getStartPosition()));
			createParentArc(node, parentAstGraphNode, astGraphNode);
			Object label = node.getStructuralProperty(ContinueStatement.LABEL_PROPERTY);
			if (label != null) {
				astGraphNode.setAttribute("name", label.toString());
			} else {
				astGraphNode.setAttribute("name", "");
			}

			runExtras(node);
			mapping.put(astGraphNode, node);
		}

		return false;
	}

	public boolean visit(CreationReference node) {
		astGraphNode = graph.createCreationReference();
		standardVisit(node);
		return true;
	}

	public boolean visit(DoStatement node) {
		astGraphNode = graph.createDoStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(EmptyStatement node) {
		astGraphNode = graph.createEmptyStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(EnhancedForStatement node) {
		astGraphNode = graph.createEnhancedForStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(EnumConstantDeclaration node) {
		astGraphNode = graph.createEnumConstantDeclaration();
		standardVisit(node);
		// if (!reducedMode)
		// astGraphNode.setAttribute("name", node.getStructuralProperty(EnumConstantDeclaration.NAME_PROPERTY).toString());
		return true;
	}

	public boolean visit(EnumDeclaration node) {
		astGraphNode = graph.createEnumDeclaration();
		standardVisit(node);
		return true;
	}

	public boolean visit(ExpressionMethodReference node) {
		astGraphNode = graph.createExpressionMethodReference();
		standardVisit(node);
		//		if (!reducedMode)
		//			astGraphNode.setAttribute("name", node.getStructuralProperty(ExpressionMethodReference.NAME_PROPERTY).toString());
		return true;
	}

	public boolean visit(ExpressionStatement node) {
		astGraphNode = graph.createExpressionStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(FieldAccess node) {
		astGraphNode = graph.createFieldAccess();
		standardVisit(node);
		return true;
	}

	public boolean visit(FieldDeclaration node) {
		astGraphNode = graph.createFieldDeclaration();
		standardVisit(node);
		return true;
	}

	public boolean visit(ForStatement node) {
		astGraphNode = graph.createForStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(IfStatement node) {
		astGraphNode = graph.createIfStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(ImportDeclaration node) {
		astGraphNode = graph.createImportDeclaration();
		standardVisit(node);
		if (!reducedMode) {
			astGraphNode.setAttribute("name", node.getStructuralProperty(ImportDeclaration.NAME_PROPERTY).toString());
			astGraphNode.setAttribute("onDemand", (Boolean)node.getStructuralProperty(ImportDeclaration.ON_DEMAND_PROPERTY));
			astGraphNode.setAttribute("static", (Boolean)node.getStructuralProperty(ImportDeclaration.STATIC_PROPERTY));
		}
		return true;
	}

	public boolean visit(InfixExpression node) {
		astGraphNode = graph.createInfixExpression();
		standardVisit(node);
		if (!reducedMode)
			astGraphNode.setAttribute("name", node.getStructuralProperty(InfixExpression.OPERATOR_PROPERTY).toString());
		return true;
	}

	public boolean visit(Initializer node) {
		astGraphNode = graph.createInitializer();
		standardVisit(node);
		return true;
	}

	public boolean visit(InstanceofExpression node) {
		astGraphNode = graph.createInstanceofExpression();
		standardVisit(node);
		return true;
	}

	public boolean visit(IntersectionType node) {
		astGraphNode = graph.createIntersectionType();
		standardVisit(node);
		return true;
	}

	public boolean visit(Javadoc node) {
		astGraphNode = graph.createJavadoc();
		standardVisit(node);
		return true;
	}

	public boolean visit(LabeledStatement node) {
		astGraphNode = graph.createLabeledStatement();
		standardVisit(node);
		return true;


	}

	public boolean visit(LambdaExpression node) {
		astGraphNode = graph.createLambdaExpression();
		standardVisit(node);
		if (!reducedMode) {
			if (node.getStructuralProperty(LambdaExpression.PARENTHESES_PROPERTY).equals(true)) {
				astGraphNode.setAttribute("parantheses", true);
			}
			else {
				astGraphNode.setAttribute("parantheses", false);
			}

		}

		return true;
	}

	public boolean visit(LineComment node) {
		System.out.println("Found a line comment:" + node.toString());
		//standardVisit(node);
		//out.setAttribute(aggNode, "content", ((LineComment)node).toString());
		return true;
	}

	public boolean visit(MarkerAnnotation node) {
		astGraphNode = graph.createMarkerAnnotation();
		standardVisit(node);
		return true;
	}

	public boolean visit(MemberRef node) {
		astGraphNode = graph.createMemberRef();
		standardVisit(node);
		return true;
	}

	public boolean visit(MemberValuePair node) {
		astGraphNode = graph.createMemberValuePair();
		standardVisit(node);
		return true;
	}

	public boolean visit(MethodDeclaration node) {
		astGraphNode = graph.createMethodDeclaration();
		currentMethodStack.push(node);
		standardVisit(node);
		if (!reducedMode) {
			astGraphNode.setAttribute("name", node.getStructuralProperty(MethodDeclaration.NAME_PROPERTY).toString());
			if (node.getStructuralProperty(MethodDeclaration.CONSTRUCTOR_PROPERTY).equals(true)) {
				astGraphNode.setAttribute("constructor", true);
			} else {
				astGraphNode.setAttribute("constructor", false);
			}
			astGraphNode.setAttribute("dimension", (Integer)node.getStructuralProperty(MethodDeclaration.EXTRA_DIMENSIONS_PROPERTY));
		}
		//		methodDeclarations.put(node.resolveBinding(), aggNode);
		return true;
	}

	public boolean visit(MethodInvocation node) {
		astGraphNode = graph.createMethodInvocation();
		standardVisit(node);
		if (!reducedMode)
			astGraphNode.setAttribute("name", node.getStructuralProperty(MethodInvocation.NAME_PROPERTY).toString());
		return true;
	}

	public boolean visit(MethodRef node) {
		astGraphNode = graph.createMethodRef();
		standardVisit(node);
		return true;
	}

	public boolean visit(MethodRefParameter node) {
		astGraphNode = graph.createMethodRefParameter();
		standardVisit(node);
		if (!reducedMode) {
			if (node.getStructuralProperty(MethodRefParameter.VARARGS_PROPERTY).equals(true)) {
				astGraphNode.setAttribute("varargs", true);
			} else {
				astGraphNode.setAttribute("varargs", false);
			}
		}
		return true;
	}

	public boolean visit(Modifier node) {
		astGraphNode = graph.createModifier();
		if (!reducedMode) {
			astGraphNode.setAttribute("line", unit.getLineNumber(node.getStartPosition()));
			astGraphNode.setAttribute("name", node.getStructuralProperty(Modifier.KEYWORD_PROPERTY).toString());
			createParentArc(node, parentAstGraphNode, astGraphNode);

			runExtras(node);
			mapping.put(astGraphNode, node);
		}

		return false;
	}

	public boolean visit(NameQualifiedType node) {
		astGraphNode = graph.createNameQualifiedType();
		standardVisit(node);
		if (!reducedMode) {
			astGraphNode.setAttribute("name", node.getStructuralProperty(NameQualifiedType.NAME_PROPERTY).toString());
		}
		return true;
	}

	public boolean visit(NormalAnnotation node) {
		astGraphNode = graph.createNormalAnnotation();
		standardVisit(node);
		return true;
	}

	public boolean visit(NullLiteral node) {
		astGraphNode = graph.createNullLiteral();
		if (!reducedMode) {
			astGraphNode.setAttribute("line", unit.getLineNumber(node.getStartPosition()));
			createParentArc(node, parentAstGraphNode, astGraphNode);

			runExtras(node);
			mapping.put(astGraphNode, node);
		}

		return false;
	}

	public boolean visit(NumberLiteral node) {
		astGraphNode = graph.createNumberLiteral();
		if (!reducedMode) {
			astGraphNode.setAttribute("line", unit.getLineNumber(node.getStartPosition()));
			astGraphNode.setAttribute("content", node.getStructuralProperty(NumberLiteral.TOKEN_PROPERTY).toString());
			createParentArc(node, parentAstGraphNode, astGraphNode);

			runExtras(node);
			mapping.put(astGraphNode, node);
		}

		return false;
	}

	public boolean visit(PackageDeclaration node) {
		astGraphNode = graph.createPackageDeclaration();
		standardVisit(node);
		if (!reducedMode)
			astGraphNode.setAttribute("name", node.getStructuralProperty(PackageDeclaration.NAME_PROPERTY).toString());
		return true;
	}

	public boolean visit(ParameterizedType node) {
		astGraphNode = graph.createParameterizedType();
		standardVisit(node);
		return true;
	}

	public boolean visit(ParenthesizedExpression node) {
		astGraphNode = graph.createParenthesizedExpression();
		standardVisit(node);
		return true;
	}

	public boolean visit(PostfixExpression node) {
		astGraphNode = graph.createPostfixExpression();
		standardVisit(node);
		if (!reducedMode)
			astGraphNode.setAttribute("name", node.getStructuralProperty(PostfixExpression.OPERATOR_PROPERTY).toString());
		return true;
	}

	public boolean visit(PrefixExpression node) {
		astGraphNode = graph.createPrefixExpression();
		standardVisit(node);
		if (!reducedMode)
			astGraphNode.setAttribute("name", node.getStructuralProperty(PrefixExpression.OPERATOR_PROPERTY).toString());
		return true;
	}

	public boolean visit(PrimitiveType node) {
		astGraphNode = graph.createPrimitiveType();
		if (!reducedMode) {
			astGraphNode.setAttribute("line", unit.getLineNumber(node.getStartPosition()));
			astGraphNode.setAttribute("name", node.getStructuralProperty(PrimitiveType.PRIMITIVE_TYPE_CODE_PROPERTY).toString());
			createParentArc(node, parentAstGraphNode, astGraphNode);

			runExtras(node);
			mapping.put(astGraphNode, node);
		}

		return false;
	}

	public boolean visit(QualifiedName node) {
		if (node.getParent() instanceof ImportDeclaration && node.getLocationInParent().equals(ImportDeclaration.NAME_PROPERTY)) return false;
		if (node.getParent() instanceof PackageDeclaration && node.getLocationInParent().equals(PackageDeclaration.NAME_PROPERTY)) return false;
		astGraphNode = graph.createQualifiedName();
		standardVisit(node);
		return true;
	}

	public boolean visit(QualifiedType node) {
		astGraphNode = graph.createQualifiedType();
		standardVisit(node);
		if (!reducedMode)
			astGraphNode.setAttribute("name", node.getStructuralProperty(QualifiedType.NAME_PROPERTY).toString());
		return true;
	}

	public boolean visit(ReturnStatement node) {
		astGraphNode = graph.createReturnStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(SimpleName node) {
		if (node.getParent() instanceof MethodDeclaration && node.getLocationInParent().equals(MethodDeclaration.NAME_PROPERTY)) return false;
		if (node.getParent() instanceof MethodInvocation && node.getLocationInParent().equals(MethodInvocation.NAME_PROPERTY)) return false;
		if (node.getParent() instanceof PackageDeclaration && node.getLocationInParent().equals(PackageDeclaration.NAME_PROPERTY)) return false;
		if (node.getParent() instanceof SimpleType && node.getLocationInParent().equals(SimpleType.NAME_PROPERTY))
			return false;
		if (node.getParent() instanceof SingleVariableDeclaration && node.getLocationInParent().equals(SingleVariableDeclaration.NAME_PROPERTY)) return false;
		if (node.getParent() instanceof SuperMethodInvocation && node.getLocationInParent().equals(SuperMethodInvocation.NAME_PROPERTY)) return false;
		if (node.getParent() instanceof TypeDeclaration && node.getLocationInParent().equals(TypeDeclaration.NAME_PROPERTY)) return false;
		if (node.getParent() instanceof VariableDeclarationFragment && node.getLocationInParent().equals(VariableDeclarationFragment.NAME_PROPERTY)) return false;

		astGraphNode = graph.createSimpleName();
		if (!reducedMode) {
			astGraphNode.setAttribute("line", unit.getLineNumber(node.getStartPosition()));
			astGraphNode.setAttribute("name", node.getStructuralProperty(SimpleName.IDENTIFIER_PROPERTY).toString());
			createParentArc(node, parentAstGraphNode, astGraphNode);

			runExtras(node);
			mapping.put(astGraphNode, node);
		}
		return false;
	}

	public boolean visit(SimpleType node) {
		astGraphNode = graph.createSimpleType();
		standardVisit(node);
		if (!reducedMode) {
			astGraphNode.setAttribute("name", node.getStructuralProperty(SimpleType.NAME_PROPERTY).toString());
		}
		return true;
	}

	public boolean visit(SingleMemberAnnotation node) {
		astGraphNode = graph.createSingleMemberAnnotation();
		standardVisit(node);
		return true;
	}

	public boolean visit(SingleVariableDeclaration node) {
		astGraphNode = graph.createSingleVariableDeclaration();
		standardVisit(node);
		if (!reducedMode) {
			astGraphNode.setAttribute("name", node.getStructuralProperty(SingleVariableDeclaration.NAME_PROPERTY).toString());
			if (node.getStructuralProperty(SingleVariableDeclaration.VARARGS_PROPERTY).equals(true)) {
				astGraphNode.setAttribute("varargs", true);
			} else {
				astGraphNode.setAttribute("varargs", false);
			}
			astGraphNode.setAttribute("dimension", (Integer)node.getStructuralProperty(SingleVariableDeclaration.EXTRA_DIMENSIONS_PROPERTY));
		}

		//		variableDeclarations.put(node.resolveBinding(), aggNode);
		return true;
	}

	public boolean visit(StringLiteral node) {
		astGraphNode = graph.createStringLiteral();
		if (!reducedMode) {
			astGraphNode.setAttribute("line", unit.getLineNumber(node.getStartPosition()));
			astGraphNode.setAttribute("content", node.getStructuralProperty(StringLiteral.ESCAPED_VALUE_PROPERTY).toString());
			createParentArc(node, parentAstGraphNode, astGraphNode);

			runExtras(node);
			mapping.put(astGraphNode, node);
		}

		return false;
	}

	public boolean visit(SuperConstructorInvocation node) {
		astGraphNode = graph.createSuperConstructorInvocation();
		standardVisit(node);
		return true;
	}

	public boolean visit(SuperFieldAccess node) {
		astGraphNode = graph.createSuperFieldAccess();
		standardVisit(node);
		return true;
	}

	public boolean visit(SuperMethodInvocation node) {
		astGraphNode = graph.createSuperMethodInvocation();
		standardVisit(node);
		if (!reducedMode)
			astGraphNode.setAttribute("name", node.getStructuralProperty(SuperMethodInvocation.NAME_PROPERTY).toString());
		return true;
	}

	public boolean visit(SuperMethodReference node) {
		astGraphNode = graph.createSuperMethodReference();
		standardVisit(node);
		if(!reducedMode)
			astGraphNode.setAttribute("name", node.getStructuralProperty(SuperMethodReference.NAME_PROPERTY).toString());
		return true;

	}

	public boolean visit(SwitchCase node) {
		astGraphNode = graph.createSwitchCase();
		standardVisit(node);
		return true;
	}

	public boolean visit(SwitchStatement node) {
		astGraphNode = graph.createSwitchStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(SynchronizedStatement node) {
		astGraphNode = graph.createSynchronizedStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(TagElement node) {
		astGraphNode = graph.createTagElement();
		standardVisit(node);
		if (!reducedMode) {
			if (node.getStructuralProperty(TagElement.TAG_NAME_PROPERTY) != null) {
				astGraphNode.setAttribute("name", node.getStructuralProperty(TagElement.TAG_NAME_PROPERTY).toString());
			} else {
				astGraphNode.setAttribute("name", "");
			}
		}
		return true;
	}

	public boolean visit(TextElement node) {
		astGraphNode = graph.createTextElement();
		standardVisit(node);
		if (!reducedMode) {
			if (node.getStructuralProperty(TextElement.TEXT_PROPERTY) != null) {
				astGraphNode.setAttribute("content", node.getStructuralProperty(TextElement.TEXT_PROPERTY).toString());
			} else {
				astGraphNode.setAttribute("content", "");
			}
		}
		return true;
	}

	public boolean visit(ThisExpression node) {
		astGraphNode = graph.createThisExpression();
		standardVisit(node);
		return true;
	}

	public boolean visit(ThrowStatement node) {
		astGraphNode = graph.createThrowStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(TryStatement node) {
		astGraphNode = graph.createTryStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(TypeDeclaration node) {
		astGraphNode = graph.createTypeDeclaration();
		currentTypeStack.push(node);
		standardVisit(node);
		if (!reducedMode) {
			astGraphNode.setAttribute("name", node.getStructuralProperty(TypeDeclaration.NAME_PROPERTY).toString());
			if (node.getStructuralProperty(TypeDeclaration.INTERFACE_PROPERTY).equals(true)) {
				astGraphNode.setAttribute("interface", true);
			} else {
				astGraphNode.setAttribute("interface", false);
			}
		}

		return true;
	}

	public boolean visit(TypeDeclarationStatement node) {
		astGraphNode = graph.createTypeDeclarationStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(TypeLiteral node) {
		astGraphNode = graph.createTypeLiteral();
		standardVisit(node);
		return true;
	}

	public boolean visit(TypeMethodReference node) {
		astGraphNode = graph.createTypeMethodReference();
		standardVisit(node);
		if (!reducedMode)
			astGraphNode.setAttribute("name", node.getStructuralProperty(TypeMethodReference.NAME_PROPERTY).toString());
		return true;
	}

	public boolean visit(TypeParameter node) {
		astGraphNode = graph.createTypeParameter();
		standardVisit(node);
		return true;
	}

	public boolean visit(UnionType node){
		astGraphNode = graph.createUnionType();
		standardVisit(node);
		return true;
	}

	public boolean visit(VariableDeclarationExpression node) {
		astGraphNode = graph.createVariableDeclarationExpression();
		standardVisit(node);
		return true;
	}

	public boolean visit(VariableDeclarationFragment node) {
		astGraphNode = graph.createVariableDeclarationFragment();
		standardVisit(node);
		if (!reducedMode) {
			astGraphNode.setAttribute("name", node.getStructuralProperty(VariableDeclarationFragment.NAME_PROPERTY).toString());
			astGraphNode.setAttribute("dimension", (Integer)node.getStructuralProperty(VariableDeclarationFragment.EXTRA_DIMENSIONS_PROPERTY));
		}
		//		variableDeclarations.put(node.resolveBinding(), aggNode);
		return true;
	}
	public boolean visit(VariableDeclarationStatement node) {
		astGraphNode = graph.createVariableDeclarationStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(WhileStatement node) {
		astGraphNode = graph.createWhileStatement();
		standardVisit(node);
		return true;
	}

	public boolean visit(WildcardType node) {
		astGraphNode = graph.createWildcardType();
		standardVisit(node);
		if (!reducedMode) {
			if (node.getStructuralProperty(WildcardType.UPPER_BOUND_PROPERTY).equals(true)) {
				astGraphNode.setAttribute("upperBound", true);
			} else {
				astGraphNode.setAttribute("upperBound", false);
			}
		}
		return true;
	}
}
