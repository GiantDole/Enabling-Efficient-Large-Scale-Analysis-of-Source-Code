/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_koblenz.jgralab.EdgeDirection;

public interface Modifier extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element, de.uni_koblenz.jgralab.Vertex {

	public static final de.uni_koblenz.jgralab.schema.VertexClass VC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getVertexClass("Modifier");

	public java.lang.String get_name();

	public void set_name(java.lang.String _name);

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element getNextElement();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier getNextModifier();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node getNextNode();

	/**
	 * @return the first edge of class InitializerModifiers at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerModifiers getFirstInitializerModifiersIncidence();

	/**
	 * @return the first edge of class InitializerModifiers at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerModifiers getFirstInitializerModifiersIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class MethodDeclarationModifiers at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.MethodDeclarationModifiers getFirstMethodDeclarationModifiersIncidence();

	/**
	 * @return the first edge of class MethodDeclarationModifiers at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.MethodDeclarationModifiers getFirstMethodDeclarationModifiersIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class SingleVariableDeclarationModifiers at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclarationModifiers getFirstSingleVariableDeclarationModifiersIncidence();

	/**
	 * @return the first edge of class SingleVariableDeclarationModifiers at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclarationModifiers getFirstSingleVariableDeclarationModifiersIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class TypeDeclarationModifiers at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationModifiers getFirstTypeDeclarationModifiersIncidence();

	/**
	 * @return the first edge of class TypeDeclarationModifiers at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationModifiers getFirstTypeDeclarationModifiersIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class EnumDeclarationModifiers at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumDeclarationModifiers getFirstEnumDeclarationModifiersIncidence();

	/**
	 * @return the first edge of class EnumDeclarationModifiers at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumDeclarationModifiers getFirstEnumDeclarationModifiersIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class VariableDeclarationStatementModifier at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclarationStatementModifier getFirstVariableDeclarationStatementModifierIncidence();

	/**
	 * @return the first edge of class VariableDeclarationStatementModifier at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclarationStatementModifier getFirstVariableDeclarationStatementModifierIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class VariableDeclarationExpressionModifiers at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclarationExpressionModifiers getFirstVariableDeclarationExpressionModifiersIncidence();

	/**
	 * @return the first edge of class VariableDeclarationExpressionModifiers at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclarationExpressionModifiers getFirstVariableDeclarationExpressionModifiersIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class AnnotationTypeDeclarationModifiers at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationModifiers getFirstAnnotationTypeDeclarationModifiersIncidence();

	/**
	 * @return the first edge of class AnnotationTypeDeclarationModifiers at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationModifiers getFirstAnnotationTypeDeclarationModifiersIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class AnnotationTypeMemberDeclarationModifiers at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationModifiers getFirstAnnotationTypeMemberDeclarationModifiersIncidence();

	/**
	 * @return the first edge of class AnnotationTypeMemberDeclarationModifiers at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationModifiers getFirstAnnotationTypeMemberDeclarationModifiersIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class FieldDeclarationModifiers at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.FieldDeclarationModifiers getFirstFieldDeclarationModifiersIncidence();

	/**
	 * @return the first edge of class FieldDeclarationModifiers at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.FieldDeclarationModifiers getFirstFieldDeclarationModifiersIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class EnumConstantDeclarationModifiers at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumConstantDeclarationModifiers getFirstEnumConstantDeclarationModifiersIncidence();

	/**
	 * @return the first edge of class EnumConstantDeclarationModifiers at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumConstantDeclarationModifiers getFirstEnumConstantDeclarationModifiersIncidence(EdgeDirection orientation);
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
	 * Returns an Iterable for all incidence edges of this vertex that are of type InitializerModifiers or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerModifiers> getInitializerModifiersIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type InitializerModifiers.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerModifiers> getInitializerModifiersIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type MethodDeclarationModifiers or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.MethodDeclarationModifiers> getMethodDeclarationModifiersIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type MethodDeclarationModifiers.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.MethodDeclarationModifiers> getMethodDeclarationModifiersIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type SingleVariableDeclarationModifiers or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclarationModifiers> getSingleVariableDeclarationModifiersIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type SingleVariableDeclarationModifiers.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclarationModifiers> getSingleVariableDeclarationModifiersIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationModifiers or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationModifiers> getTypeDeclarationModifiersIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationModifiers.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationModifiers> getTypeDeclarationModifiersIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type EnumDeclarationModifiers or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumDeclarationModifiers> getEnumDeclarationModifiersIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type EnumDeclarationModifiers.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumDeclarationModifiers> getEnumDeclarationModifiersIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type VariableDeclarationStatementModifier or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclarationStatementModifier> getVariableDeclarationStatementModifierIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type VariableDeclarationStatementModifier.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclarationStatementModifier> getVariableDeclarationStatementModifierIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type VariableDeclarationExpressionModifiers or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclarationExpressionModifiers> getVariableDeclarationExpressionModifiersIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type VariableDeclarationExpressionModifiers.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.VariableDeclarationExpressionModifiers> getVariableDeclarationExpressionModifiersIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeDeclarationModifiers or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationModifiers> getAnnotationTypeDeclarationModifiersIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeDeclarationModifiers.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationModifiers> getAnnotationTypeDeclarationModifiersIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeMemberDeclarationModifiers or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationModifiers> getAnnotationTypeMemberDeclarationModifiersIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeMemberDeclarationModifiers.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationModifiers> getAnnotationTypeMemberDeclarationModifiersIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type FieldDeclarationModifiers or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.FieldDeclarationModifiers> getFieldDeclarationModifiersIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type FieldDeclarationModifiers.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.FieldDeclarationModifiers> getFieldDeclarationModifiersIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type EnumConstantDeclarationModifiers or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumConstantDeclarationModifiers> getEnumConstantDeclarationModifiersIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type EnumConstantDeclarationModifiers.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnumConstantDeclarationModifiers> getEnumConstantDeclarationModifiersIncidences(EdgeDirection direction);
}
