/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumConstantDeclaration;
import de.uni_koblenz.jgralab.EdgeDirection;
/**
 * FromVertexClass: EnumConstantDeclaration
 * FromRoleName : 
 * ToVertexClass: Annotation
 * ToRoleName : modifiers1
 */

public interface EnumConstantDeclarationAnnotations extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child, de.uni_koblenz.jgralab.Edge {

	public static final de.uni_koblenz.jgralab.schema.EdgeClass EC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getEdgeClass("EnumConstantDeclarationAnnotations");

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child edge in the global edge sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildInGraph();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumConstantDeclarationAnnotations edge in the global edge sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumConstantDeclarationAnnotations getNextEnumConstantDeclarationAnnotationsInGraph();

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child at the "this" vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildIncidence();

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child at the "this" vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildIncidence(EdgeDirection orientation);

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumConstantDeclarationAnnotations at the "this" vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumConstantDeclarationAnnotations getNextEnumConstantDeclarationAnnotationsIncidence();

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumConstantDeclarationAnnotations at the "this" vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumConstantDeclarationAnnotations getNextEnumConstantDeclarationAnnotationsIncidence(EdgeDirection orientation);
	public EnumConstantDeclaration getAlpha();
	public Annotation getOmega();
}
