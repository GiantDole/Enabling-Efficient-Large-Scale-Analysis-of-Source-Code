/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_koblenz.jgralab.EdgeDirection;

public interface Element extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node, de.uni_koblenz.jgralab.Vertex {

	public static final de.uni_koblenz.jgralab.schema.VertexClass VC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getVertexClass("Element");

	public int get_line();

	public void set_line(int _line);

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element getNextElement();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node getNextNode();

	/**
	 * @return the first edge of class LambdaExpressionBody at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody getFirstLambdaExpressionBodyIncidence();

	/**
	 * @return the first edge of class LambdaExpressionBody at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody getFirstLambdaExpressionBodyIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class ElementExpression at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression getFirstElementExpressionIncidence();

	/**
	 * @return the first edge of class ElementExpression at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression getFirstElementExpressionIncidence(EdgeDirection orientation);
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
	 * Returns an Iterable for all incidence edges of this vertex that are of type LambdaExpressionBody or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody> getLambdaExpressionBodyIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type LambdaExpressionBody.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody> getLambdaExpressionBodyIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type ElementExpression or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression> getElementExpressionIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type ElementExpression.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression> getElementExpressionIncidences(EdgeDirection direction);
}
