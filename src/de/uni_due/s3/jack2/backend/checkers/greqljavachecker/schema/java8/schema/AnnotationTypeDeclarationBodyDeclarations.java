/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclaration;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclaration;
import de.uni_koblenz.jgralab.EdgeDirection;
/**
 * FromVertexClass: AnnotationTypeDeclaration
 * FromRoleName : 
 * ToVertexClass: AnnotationTypeMemberDeclaration
 * ToRoleName : bodyDeclarations
 */

public interface AnnotationTypeDeclarationBodyDeclarations extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child, de.uni_koblenz.jgralab.Edge {

	public static final de.uni_koblenz.jgralab.schema.EdgeClass EC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getEdgeClass("AnnotationTypeDeclarationBodyDeclarations");

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationBodyDeclarations edge in the global edge sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationBodyDeclarations getNextAnnotationTypeDeclarationBodyDeclarationsInGraph();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child edge in the global edge sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildInGraph();

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationBodyDeclarations at the "this" vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationBodyDeclarations getNextAnnotationTypeDeclarationBodyDeclarationsIncidence();

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationBodyDeclarations at the "this" vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationBodyDeclarations getNextAnnotationTypeDeclarationBodyDeclarationsIncidence(EdgeDirection orientation);

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child at the "this" vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildIncidence();

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child at the "this" vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildIncidence(EdgeDirection orientation);
	public AnnotationTypeDeclaration getAlpha();
	public AnnotationTypeMemberDeclaration getOmega();
}
