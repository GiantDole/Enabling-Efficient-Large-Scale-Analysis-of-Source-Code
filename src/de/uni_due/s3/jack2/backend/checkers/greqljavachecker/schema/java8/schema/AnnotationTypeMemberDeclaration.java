/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_koblenz.jgralab.EdgeDirection;

public interface AnnotationTypeMemberDeclaration extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration, de.uni_koblenz.jgralab.Vertex {

	public static final de.uni_koblenz.jgralab.schema.VertexClass VC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getVertexClass("AnnotationTypeMemberDeclaration");

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclaration vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclaration getNextAnnotationTypeMemberDeclaration();

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
	 * @return the first edge of class AnnotationTypeMemberDeclarationAnnotations at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations getFirstAnnotationTypeMemberDeclarationAnnotationsIncidence();

	/**
	 * @return the first edge of class AnnotationTypeMemberDeclarationAnnotations at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations getFirstAnnotationTypeMemberDeclarationAnnotationsIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class AnnotationTypeDeclarationBodyDeclarations at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationBodyDeclarations getFirstAnnotationTypeDeclarationBodyDeclarationsIncidence();

	/**
	 * @return the first edge of class AnnotationTypeDeclarationBodyDeclarations at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationBodyDeclarations getFirstAnnotationTypeDeclarationBodyDeclarationsIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class AnnotationTypeMemberDeclarationType at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationType getFirstAnnotationTypeMemberDeclarationTypeIncidence();

	/**
	 * @return the first edge of class AnnotationTypeMemberDeclarationType at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationType getFirstAnnotationTypeMemberDeclarationTypeIncidence(EdgeDirection orientation);

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
	 * @return the first edge of class AnnotationTypeMemberDeclarationDefault at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationDefault getFirstAnnotationTypeMemberDeclarationDefaultIncidence();

	/**
	 * @return the first edge of class AnnotationTypeMemberDeclarationDefault at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationDefault getFirstAnnotationTypeMemberDeclarationDefaultIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class AnnotationTypeMemberDeclarationName at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationName getFirstAnnotationTypeMemberDeclarationNameIncidence();

	/**
	 * @return the first edge of class AnnotationTypeMemberDeclarationName at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationName getFirstAnnotationTypeMemberDeclarationNameIncidence(EdgeDirection orientation);
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
		 * adds the given vertex as <code>modifiers2</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationModifiers</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationModifiers</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationModifiers add_modifiers2(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier vertex);
		/**
		 * removes all modifiers2 adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationModifiers</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier> remove_modifiers2();
		/**
		 * removes the given vertex as <code>modifiers2</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationModifiers</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_modifiers2(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'modifiers2'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationModifiers</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier> Iterable<V> get_modifiers2();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier> Iterable<V> get_modifiers2(de.uni_koblenz.jgralab.VertexFilter<V> filter);
		/**
		 * adds the given vertex as <code>default</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationDefault</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationDefault</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationDefault add_default(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression vertex);
		/**
		 * removes all default adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationDefault</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression> remove_default();
		/**
		 * removes the given vertex as <code>default</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationDefault</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_default(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression vertex);
		/**
		 * @return the vertex to this one with the rolename 'default' 
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationDefault</code> edge), or null if no such vertex exists
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression get_default();
		/**
		 * adds the given vertex as <code>type</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationType</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationType</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationType add_type(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type vertex);
		/**
		 * removes all type adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationType</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type> remove_type();
		/**
		 * removes the given vertex as <code>type</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationType</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_type(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type vertex);
		/**
		 * @return the vertex to this one with the rolename 'type' 
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationType</code> edge), or null if no such vertex exists
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type get_type();
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
		 * adds the given vertex as <code>name</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationName</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationName</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationName add_name(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SimpleName vertex);
		/**
		 * removes all name adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationName</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SimpleName> remove_name();
		/**
		 * removes the given vertex as <code>name</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationName</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_name(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SimpleName vertex);
		/**
		 * @return the vertex to this one with the rolename 'name' 
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationName</code> edge), or null if no such vertex exists
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SimpleName get_name();
		/**
		 * adds the given vertex as <code>modifiers1</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations add_modifiers1(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation vertex);
		/**
		 * removes all modifiers1 adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation> remove_modifiers1();
		/**
		 * removes the given vertex as <code>modifiers1</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_modifiers1(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'modifiers1'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation> Iterable<V> get_modifiers1();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation> Iterable<V> get_modifiers1(de.uni_koblenz.jgralab.VertexFilter<V> filter);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeMemberDeclarationAnnotations or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations> getAnnotationTypeMemberDeclarationAnnotationsIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeMemberDeclarationAnnotations.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationAnnotations> getAnnotationTypeMemberDeclarationAnnotationsIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeDeclarationBodyDeclarations or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationBodyDeclarations> getAnnotationTypeDeclarationBodyDeclarationsIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeDeclarationBodyDeclarations.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclarationBodyDeclarations> getAnnotationTypeDeclarationBodyDeclarationsIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeMemberDeclarationType or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationType> getAnnotationTypeMemberDeclarationTypeIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeMemberDeclarationType.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationType> getAnnotationTypeMemberDeclarationTypeIncidences(EdgeDirection direction);

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
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeMemberDeclarationDefault or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationDefault> getAnnotationTypeMemberDeclarationDefaultIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeMemberDeclarationDefault.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationDefault> getAnnotationTypeMemberDeclarationDefaultIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeMemberDeclarationName or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationName> getAnnotationTypeMemberDeclarationNameIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type AnnotationTypeMemberDeclarationName.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeMemberDeclarationName> getAnnotationTypeMemberDeclarationNameIncidences(EdgeDirection direction);
}
