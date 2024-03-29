/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_koblenz.jgralab.EdgeDirection;

public interface IfStatement extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement, de.uni_koblenz.jgralab.Vertex {

	public static final de.uni_koblenz.jgralab.schema.VertexClass VC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getVertexClass("IfStatement");

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element getNextElement();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatement vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatement getNextIfStatement();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node getNextNode();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement getNextStatement();

	/**
	 * @return the first edge of class IfStatementElseStatement at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement getFirstIfStatementElseStatementIncidence();

	/**
	 * @return the first edge of class IfStatementElseStatement at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement getFirstIfStatementElseStatementIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class IfStatementThenStatement at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement getFirstIfStatementThenStatementIncidence();

	/**
	 * @return the first edge of class IfStatementThenStatement at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement getFirstIfStatementThenStatementIncidence(EdgeDirection orientation);
		/**
		 * adds the given vertex as <code>thenStatement</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement add_thenStatement(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement vertex);
		/**
		 * removes all thenStatement adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement> remove_thenStatement();
		/**
		 * removes the given vertex as <code>thenStatement</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_thenStatement(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement vertex);
		/**
		 * @return the vertex to this one with the rolename 'thenStatement' 
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement</code> edge), or null if no such vertex exists
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement get_thenStatement();
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
		 * adds the given vertex as <code>elseStatement</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement add_elseStatement(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement vertex);
		/**
		 * removes all elseStatement adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement> remove_elseStatement();
		/**
		 * removes the given vertex as <code>elseStatement</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_elseStatement(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement vertex);
		/**
		 * @return the vertex to this one with the rolename 'elseStatement' 
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement</code> edge), or null if no such vertex exists
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement get_elseStatement();

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type IfStatementElseStatement or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement> getIfStatementElseStatementIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type IfStatementElseStatement.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement> getIfStatementElseStatementIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type IfStatementThenStatement or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement> getIfStatementThenStatementIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type IfStatementThenStatement.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement> getIfStatementThenStatementIncidences(EdgeDirection direction);
}
