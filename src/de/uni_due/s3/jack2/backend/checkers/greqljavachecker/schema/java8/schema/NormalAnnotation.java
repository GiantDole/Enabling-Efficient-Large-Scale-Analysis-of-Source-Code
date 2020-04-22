/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_koblenz.jgralab.EdgeDirection;

public interface NormalAnnotation extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation, de.uni_koblenz.jgralab.Vertex {

	public static final de.uni_koblenz.jgralab.schema.VertexClass VC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getVertexClass("NormalAnnotation");

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation getNextAnnotation();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element getNextElement();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression getNextExpression();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node getNextNode();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotation vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotation getNextNormalAnnotation();

	/**
	 * @return the first edge of class NormalAnnotationTypeName at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationTypeName getFirstNormalAnnotationTypeNameIncidence();

	/**
	 * @return the first edge of class NormalAnnotationTypeName at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationTypeName getFirstNormalAnnotationTypeNameIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class NormalAnnotationValues at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationValues getFirstNormalAnnotationValuesIncidence();

	/**
	 * @return the first edge of class NormalAnnotationValues at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationValues getFirstNormalAnnotationValuesIncidence(EdgeDirection orientation);
		/**
		 * adds the given vertex as <code>typeName</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationTypeName</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationTypeName</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationTypeName add_typeName(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Name vertex);
		/**
		 * removes all typeName adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationTypeName</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Name> remove_typeName();
		/**
		 * removes the given vertex as <code>typeName</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationTypeName</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_typeName(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Name vertex);
		/**
		 * @return the vertex to this one with the rolename 'typeName' 
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationTypeName</code> edge), or null if no such vertex exists
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Name get_typeName();
		/**
		 * adds the given vertex as <code>access2</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess2</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess2</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess2 add_access2(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclaration vertex);
		/**
		 * removes all access2 adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess2</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclaration> remove_access2();
		/**
		 * removes the given vertex as <code>access2</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess2</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_access2(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclaration vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'access2'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess2</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclaration> Iterable<V> get_access2();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclaration> Iterable<V> get_access2(de.uni_koblenz.jgralab.VertexFilter<V> filter);
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
		 * adds the given vertex as <code>values</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationValues</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationValues</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationValues add_values(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.MemberValuePair vertex);
		/**
		 * removes all values adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationValues</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.MemberValuePair> remove_values();
		/**
		 * removes the given vertex as <code>values</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationValues</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_values(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.MemberValuePair vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'values'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationValues</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.MemberValuePair> Iterable<V> get_values();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.MemberValuePair> Iterable<V> get_values(de.uni_koblenz.jgralab.VertexFilter<V> filter);
		/**
		 * adds the given vertex as <code>access1</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1 add_access1(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration vertex);
		/**
		 * removes all access1 adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration> remove_access1();
		/**
		 * removes the given vertex as <code>access1</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_access1(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'access1'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration> Iterable<V> get_access1();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration> Iterable<V> get_access1(de.uni_koblenz.jgralab.VertexFilter<V> filter);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type NormalAnnotationTypeName or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationTypeName> getNormalAnnotationTypeNameIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type NormalAnnotationTypeName.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationTypeName> getNormalAnnotationTypeNameIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type NormalAnnotationValues or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationValues> getNormalAnnotationValuesIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type NormalAnnotationValues.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.NormalAnnotationValues> getNormalAnnotationValuesIncidences(EdgeDirection direction);
}
