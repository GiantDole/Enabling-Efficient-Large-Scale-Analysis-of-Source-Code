/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Name;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SuperFieldAccess;
import de.uni_koblenz.jgralab.EdgeDirection;
/**
 * FromVertexClass: SuperFieldAccess
 * FromRoleName : 
 * ToVertexClass: Name
 * ToRoleName : qualifier
 */

public interface SuperFieldAccessQualifier extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child, de.uni_koblenz.jgralab.Edge {

	public static final de.uni_koblenz.jgralab.schema.EdgeClass EC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getEdgeClass("SuperFieldAccessQualifier");

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child edge in the global edge sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildInGraph();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SuperFieldAccessQualifier edge in the global edge sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SuperFieldAccessQualifier getNextSuperFieldAccessQualifierInGraph();

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
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SuperFieldAccessQualifier at the "this" vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SuperFieldAccessQualifier getNextSuperFieldAccessQualifierIncidence();

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SuperFieldAccessQualifier at the "this" vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SuperFieldAccessQualifier getNextSuperFieldAccessQualifierIncidence(EdgeDirection orientation);
	public SuperFieldAccess getAlpha();
	public Name getOmega();
}
