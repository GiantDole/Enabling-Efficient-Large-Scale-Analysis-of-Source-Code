/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProject;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment;
import de.uni_koblenz.jgralab.EdgeDirection;
/**
 * FromVertexClass: IJavaProject
 * FromRoleName : 
 * ToVertexClass: IPackageFragment
 * ToRoleName : fragments
 */

public interface IJavaProjectFragements extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child, de.uni_koblenz.jgralab.Edge {

	public static final de.uni_koblenz.jgralab.schema.EdgeClass EC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getEdgeClass("IJavaProjectFragements");

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child edge in the global edge sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildInGraph();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements edge in the global edge sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements getNextIJavaProjectFragementsInGraph();

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
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements at the "this" vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements getNextIJavaProjectFragementsIncidence();

	/**
	 * @return the next edge of class de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements at the "this" vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements getNextIJavaProjectFragementsIncidence(EdgeDirection orientation);
	public IJavaProject getAlpha();
	public IPackageFragment getOmega();
}
