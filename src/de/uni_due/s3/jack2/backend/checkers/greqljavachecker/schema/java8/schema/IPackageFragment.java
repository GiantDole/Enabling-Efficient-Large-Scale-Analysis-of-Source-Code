/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_koblenz.jgralab.EdgeDirection;

public interface IPackageFragment extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node, de.uni_koblenz.jgralab.Vertex {

	public static final de.uni_koblenz.jgralab.schema.VertexClass VC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getVertexClass("IPackageFragment");

	public java.lang.String get_name();

	public void set_name(java.lang.String _name);

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment getNextIPackageFragment();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node getNextNode();

	/**
	 * @return the first edge of class IJavaProjectFragements at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements getFirstIJavaProjectFragementsIncidence();

	/**
	 * @return the first edge of class IJavaProjectFragements at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements getFirstIJavaProjectFragementsIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class IPackageFragmentUnits at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits getFirstIPackageFragmentUnitsIncidence();

	/**
	 * @return the first edge of class IPackageFragmentUnits at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits getFirstIPackageFragmentUnitsIncidence(EdgeDirection orientation);
		/**
		 * adds the given vertex as <code>units</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits add_units(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit vertex);
		/**
		 * removes all units adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit> remove_units();
		/**
		 * removes the given vertex as <code>units</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_units(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'units'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit> Iterable<V> get_units();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit> Iterable<V> get_units(de.uni_koblenz.jgralab.VertexFilter<V> filter);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type IJavaProjectFragements or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements> getIJavaProjectFragementsIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type IJavaProjectFragements.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements> getIJavaProjectFragementsIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type IPackageFragmentUnits or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits> getIPackageFragmentUnitsIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type IPackageFragmentUnits.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits> getIPackageFragmentUnitsIncidences(EdgeDirection direction);
}
