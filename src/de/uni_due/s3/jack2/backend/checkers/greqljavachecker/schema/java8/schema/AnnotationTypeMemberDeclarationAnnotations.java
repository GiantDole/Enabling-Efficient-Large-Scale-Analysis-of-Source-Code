/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclaration;
import de.uni_koblenz.jgralab.EdgeDirection;
/**
 * FromVertexClass: AnnotationTypeMemberDeclaration
 * FromRoleName : 
 * ToVertexClass: Annotation
 * ToRoleName : modifiers1
 */

public interface AnnotationTypeMemberDeclarationAnnotations extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child, de.uni_koblenz.jgralab.Edge {

	public static final de.uni_koblenz.jgralab.schema.EdgeClass EC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getEdgeClass("AnnotationTypeMemberDeclarationAnnotations");

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations edge in the global edge sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations getNextAnnotationTypeMemberDeclarationAnnotationsInGraph();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child edge in the global edge sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildInGraph();

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations at the "this" vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations getNextAnnotationTypeMemberDeclarationAnnotationsIncidence();

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations at the "this" vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations getNextAnnotationTypeMemberDeclarationAnnotationsIncidence(EdgeDirection orientation);

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child at the "this" vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildIncidence();

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child at the "this" vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildIncidence(EdgeDirection orientation);
	public AnnotationTypeMemberDeclaration getAlpha();
	public Annotation getOmega();
}
