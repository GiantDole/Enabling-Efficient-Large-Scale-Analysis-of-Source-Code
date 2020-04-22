/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_koblenz.jgralab.EdgeDirection;

public interface BodyDeclaration extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element, de.uni_koblenz.jgralab.Vertex {

	public static final de.uni_koblenz.jgralab.schema.VertexClass VC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getVertexClass("BodyDeclaration");

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration getNextBodyDeclaration();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element getNextElement();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node getNextNode();

	/**
	 * @return the first edge of class TypeDeclarationBodyDeclarations1 at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationBodyDeclarations1 getFirstTypeDeclarationBodyDeclarations1Incidence();

	/**
	 * @return the first edge of class TypeDeclarationBodyDeclarations1 at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationBodyDeclarations1 getFirstTypeDeclarationBodyDeclarations1Incidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class AnonymousClassDeclarationBodyDeclarations at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnonymousClassDeclarationBodyDeclarations getFirstAnonymousClassDeclarationBodyDeclarationsIncidence();

	/**
	 * @return the first edge of class AnonymousClassDeclarationBodyDeclarations at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnonymousClassDeclarationBodyDeclarations getFirstAnonymousClassDeclarationBodyDeclarationsIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class ExpressionAccess1 at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1 getFirstExpressionAccess1Incidence();

	/**
	 * @return the first edge of class ExpressionAccess1 at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1 getFirstExpressionAccess1Incidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class BodyDeclarationJavadoc at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclarationJavadoc getFirstBodyDeclarationJavadocIncidence();

	/**
	 * @return the first edge of class BodyDeclarationJavadoc at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclarationJavadoc getFirstBodyDeclarationJavadocIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class EnumDeclarationBodyDeclaration at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumDeclarationBodyDeclaration getFirstEnumDeclarationBodyDeclarationIncidence();

	/**
	 * @return the first edge of class EnumDeclarationBodyDeclaration at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumDeclarationBodyDeclaration getFirstEnumDeclarationBodyDeclarationIncidence(EdgeDirection orientation);
		/**
		 * adds the given vertex as <code>javadoc</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclarationJavadoc</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclarationJavadoc</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclarationJavadoc add_javadoc(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Javadoc vertex);
		/**
		 * removes all javadoc adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclarationJavadoc</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Javadoc> remove_javadoc();
		/**
		 * removes the given vertex as <code>javadoc</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclarationJavadoc</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_javadoc(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Javadoc vertex);
		/**
		 * @return the vertex to this one with the rolename 'javadoc' 
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclarationJavadoc</code> edge), or null if no such vertex exists
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Javadoc get_javadoc();
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
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationBodyDeclarations1 or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationBodyDeclarations1> getTypeDeclarationBodyDeclarations1Incidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationBodyDeclarations1.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationBodyDeclarations1> getTypeDeclarationBodyDeclarations1Incidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnonymousClassDeclarationBodyDeclarations or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnonymousClassDeclarationBodyDeclarations> getAnonymousClassDeclarationBodyDeclarationsIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnonymousClassDeclarationBodyDeclarations.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnonymousClassDeclarationBodyDeclarations> getAnonymousClassDeclarationBodyDeclarationsIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type ExpressionAccess1 or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1> getExpressionAccess1Incidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type ExpressionAccess1.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1> getExpressionAccess1Incidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type BodyDeclarationJavadoc or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclarationJavadoc> getBodyDeclarationJavadocIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type BodyDeclarationJavadoc.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclarationJavadoc> getBodyDeclarationJavadocIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type EnumDeclarationBodyDeclaration or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumDeclarationBodyDeclaration> getEnumDeclarationBodyDeclarationIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type EnumDeclarationBodyDeclaration.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumDeclarationBodyDeclaration> getEnumDeclarationBodyDeclarationIncidences(EdgeDirection direction);
}
