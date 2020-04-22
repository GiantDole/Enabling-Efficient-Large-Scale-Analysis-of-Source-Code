/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_koblenz.jgralab.EdgeDirection;

public interface Initializer extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration, de.uni_koblenz.jgralab.Vertex {

	public static final de.uni_koblenz.jgralab.schema.VertexClass VC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getVertexClass("Initializer");

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration getNextBodyDeclaration();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element getNextElement();

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Initializer vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Initializer getNextInitializer();

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
	 * @return the first edge of class InitializerAnnotation at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerAnnotation getFirstInitializerAnnotationIncidence();

	/**
	 * @return the first edge of class InitializerAnnotation at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerAnnotation getFirstInitializerAnnotationIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class InitializerBody at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerBody getFirstInitializerBodyIncidence();

	/**
	 * @return the first edge of class InitializerBody at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerBody getFirstInitializerBodyIncidence(EdgeDirection orientation);
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
		 * adds the given vertex as <code>body</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerBody</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerBody</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerBody add_body(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block vertex);
		/**
		 * removes all body adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerBody</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block> remove_body();
		/**
		 * removes the given vertex as <code>body</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerBody</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_body(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block vertex);
		/**
		 * @return the vertex to this one with the rolename 'body' 
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerBody</code> edge), or null if no such vertex exists
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block get_body();
		/**
		 * adds the given vertex as <code>modifiers2</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerModifiers</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerModifiers</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerModifiers add_modifiers2(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier vertex);
		/**
		 * removes all modifiers2 adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerModifiers</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier> remove_modifiers2();
		/**
		 * removes the given vertex as <code>modifiers2</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerModifiers</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_modifiers2(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'modifiers2'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerModifiers</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier> Iterable<V> get_modifiers2();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier> Iterable<V> get_modifiers2(de.uni_koblenz.jgralab.VertexFilter<V> filter);
		/**
		 * adds the given vertex as <code>modifiers1</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerAnnotation</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerAnnotation</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerAnnotation add_modifiers1(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation vertex);
		/**
		 * removes all modifiers1 adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerAnnotation</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation> remove_modifiers1();
		/**
		 * removes the given vertex as <code>modifiers1</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerAnnotation</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_modifiers1(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'modifiers1'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerAnnotation</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation> Iterable<V> get_modifiers1();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation> Iterable<V> get_modifiers1(de.uni_koblenz.jgralab.VertexFilter<V> filter);
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
	 * Returns an Iterable for all incidence edges of this vertex that are of type InitializerAnnotation or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerAnnotation> getInitializerAnnotationIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type InitializerAnnotation.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerAnnotation> getInitializerAnnotationIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type InitializerBody or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerBody> getInitializerBodyIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type InitializerBody.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InitializerBody> getInitializerBodyIncidences(EdgeDirection direction);
}
