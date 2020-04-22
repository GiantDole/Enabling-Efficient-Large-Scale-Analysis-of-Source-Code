package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.parser;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import de.uni_koblenz.jgralab.Vertex;

public interface IVisitorExtra {

	public void handle(Mapping mapping, ASTNode astNode, Vertex astGraphNode, Vertex parentAstGraphNode, MethodDeclaration currentMethod, TypeDeclaration currentType, Vertex currentPackage);
	public void finish();
}
