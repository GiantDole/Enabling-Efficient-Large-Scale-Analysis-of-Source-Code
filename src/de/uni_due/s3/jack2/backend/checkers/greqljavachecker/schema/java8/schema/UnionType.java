/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_koblenz.jgralab.EdgeDirection;

public interface UnionType extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type, de.uni_koblenz.jgralab.Vertex {

	public static final de.uni_koblenz.jgralab.schema.VertexClass VC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getVertexClass("UnionType");

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element getNextElement();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node getNextNode();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type getNextType();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionType vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionType getNextUnionType();

	/**
	 * @return the first edge of class UnionTypeTypes at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionTypeTypes getFirstUnionTypeTypesIncidence();

	/**
	 * @return the first edge of class UnionTypeTypes at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionTypeTypes getFirstUnionTypeTypesIncidence(EdgeDirection orientation);
		/**
		 * adds the given vertex as <code>access</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeAccess</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeAccess</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeAccess add_access(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclaration vertex);
		/**
		 * removes all access adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeAccess</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclaration> remove_access();
		/**
		 * removes the given vertex as <code>access</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeAccess</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_access(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclaration vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'access'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeAccess</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclaration> Iterable<V> get_access();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclaration> Iterable<V> get_access(de.uni_koblenz.jgralab.VertexFilter<V> filter);
		/**
		 * adds the given vertex as <code>types</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionTypeTypes</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionTypeTypes</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionTypeTypes add_types(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type vertex);
		/**
		 * removes all types adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionTypeTypes</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type> remove_types();
		/**
		 * removes the given vertex as <code>types</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionTypeTypes</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_types(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'types'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionTypeTypes</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type> Iterable<V> get_types();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type> Iterable<V> get_types(de.uni_koblenz.jgralab.VertexFilter<V> filter);
		/**
		 * adds the given vertex as <code>expression</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression add_expression(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression vertex);
		/**
		 * removes all expression adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression> remove_expression();
		/**
		 * removes the given vertex as <code>expression</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_expression(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'expression'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression> Iterable<V> get_expression();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression> Iterable<V> get_expression(de.uni_koblenz.jgralab.VertexFilter<V> filter);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type UnionTypeTypes or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionTypeTypes> getUnionTypeTypesIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type UnionTypeTypes.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.UnionTypeTypes> getUnionTypeTypesIncidences(EdgeDirection direction);
}
