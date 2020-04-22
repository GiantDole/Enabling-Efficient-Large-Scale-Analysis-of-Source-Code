/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema;

import de.uni_koblenz.jgralab.EdgeDirection;

public interface TypeDeclaration extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AbstractTypeDeclaration, de.uni_koblenz.jgralab.Vertex {

	public static final de.uni_koblenz.jgralab.schema.VertexClass VC = de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8Schema.instance().getGraphClass().getVertexClass("TypeDeclaration");

	public boolean is_interface();

	public void set_interface(boolean _interface);

	public java.lang.String get_name();

	public void set_name(java.lang.String _name);

	/**
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AbstractTypeDeclaration vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AbstractTypeDeclaration getNextAbstractTypeDeclaration();

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
	 * @return the next de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclaration vertex in the global vertex sequence
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclaration getNextTypeDeclaration();

	/**
	 * @return the first edge of class TypeDeclarationTypeParameters at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationTypeParameters getFirstTypeDeclarationTypeParametersIncidence();

	/**
	 * @return the first edge of class TypeDeclarationTypeParameters at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationTypeParameters getFirstTypeDeclarationTypeParametersIncidence(EdgeDirection orientation);

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
	 * @return the first edge of class TypeDeclarationSuperclassType at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperclassType getFirstTypeDeclarationSuperclassTypeIncidence();

	/**
	 * @return the first edge of class TypeDeclarationSuperclassType at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperclassType getFirstTypeDeclarationSuperclassTypeIncidence(EdgeDirection orientation);

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
	 * @return the first edge of class TypeAccess at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeAccess getFirstTypeAccessIncidence();

	/**
	 * @return the first edge of class TypeAccess at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeAccess getFirstTypeAccessIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class TypeDeclarationAnnotation at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationAnnotation getFirstTypeDeclarationAnnotationIncidence();

	/**
	 * @return the first edge of class TypeDeclarationAnnotation at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationAnnotation getFirstTypeDeclarationAnnotationIncidence(EdgeDirection orientation);

	/**
	 * @return the first edge of class TypeDeclarationSuperInterfaceTypes at this vertex
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperInterfaceTypes getFirstTypeDeclarationSuperInterfaceTypesIncidence();

	/**
	 * @return the first edge of class TypeDeclarationSuperInterfaceTypes at this vertex
	 * @param orientation the orientation of the edge
	 */
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperInterfaceTypes getFirstTypeDeclarationSuperInterfaceTypesIncidence(EdgeDirection orientation);
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
		 * adds the given vertex as <code>superclassType</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperclassType</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperclassType</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperclassType add_superclassType(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type vertex);
		/**
		 * removes all superclassType adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperclassType</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type> remove_superclassType();
		/**
		 * removes the given vertex as <code>superclassType</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperclassType</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_superclassType(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type vertex);
		/**
		 * @return the vertex to this one with the rolename 'superclassType' 
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperclassType</code> edge), or null if no such vertex exists
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type get_superclassType();
		/**
		 * adds the given vertex as <code>modifiers1</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationModifiers</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationModifiers</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationModifiers add_modifiers1(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier vertex);
		/**
		 * removes all modifiers1 adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationModifiers</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier> remove_modifiers1();
		/**
		 * removes the given vertex as <code>modifiers1</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationModifiers</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_modifiers1(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'modifiers1'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationModifiers</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier> Iterable<V> get_modifiers1();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Modifier> Iterable<V> get_modifiers1(de.uni_koblenz.jgralab.VertexFilter<V> filter);
		/**
		 * adds the given vertex as <code>superInterfaceTypes</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperInterfaceTypes</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperInterfaceTypes</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperInterfaceTypes add_superInterfaceTypes(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type vertex);
		/**
		 * removes all superInterfaceTypes adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperInterfaceTypes</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type> remove_superInterfaceTypes();
		/**
		 * removes the given vertex as <code>superInterfaceTypes</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperInterfaceTypes</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_superInterfaceTypes(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'superInterfaceTypes'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperInterfaceTypes</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type> Iterable<V> get_superInterfaceTypes();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type> Iterable<V> get_superInterfaceTypes(de.uni_koblenz.jgralab.VertexFilter<V> filter);
		/**
		 * adds the given vertex as <code>typeParameters</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationTypeParameters</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationTypeParameters</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationTypeParameters add_typeParameters(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameter vertex);
		/**
		 * removes all typeParameters adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationTypeParameters</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameter> remove_typeParameters();
		/**
		 * removes the given vertex as <code>typeParameters</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationTypeParameters</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_typeParameters(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameter vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'typeParameters'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationTypeParameters</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameter> Iterable<V> get_typeParameters();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameter> Iterable<V> get_typeParameters(de.uni_koblenz.jgralab.VertexFilter<V> filter);
		/**
		 * adds the given vertex as <code>bodyDeclarations</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationBodyDeclarations1</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationBodyDeclarations1</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationBodyDeclarations1 add_bodyDeclarations(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration vertex);
		/**
		 * removes all bodyDeclarations adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationBodyDeclarations1</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration> remove_bodyDeclarations();
		/**
		 * removes the given vertex as <code>bodyDeclarations</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationBodyDeclarations1</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_bodyDeclarations(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'bodyDeclarations'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationBodyDeclarations1</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration> Iterable<V> get_bodyDeclarations();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration> Iterable<V> get_bodyDeclarations(de.uni_koblenz.jgralab.VertexFilter<V> filter);
		/**
		 * adds the given vertex as <code>modifiers2</code> to this vertex, i.e. creates an
		 * <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationAnnotation</code> edge from this vertex to the given 
		 * one and returns the created edge.
		 * @return  a newly created edge of type <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationAnnotation</code>
		 *          between this vertex and the given one.
		 */
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationAnnotation add_modifiers2(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation vertex);
		/**
		 * removes all modifiers2 adjacences to all vertices by 
		 * deleting the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationAnnotation</code> edges of this vertex to 
		 * all other ones, but doesn't delete those vertices.
		 *
		 * @return the adjacent vertices prior to removal of incidences
		 */
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation> remove_modifiers2();
		/**
		 * removes the given vertex as <code>modifiers2</code> from this vertex, i.e. 
		 * deletes the <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationAnnotation</code> edge connections of this vertex with 
		 * the given one.
		 */
		public boolean remove_modifiers2(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation vertex);
		/**
		 * @return an Iterable of all vertices adjacent to this one with the rolename 'modifiers2'
		 *         (connected with a <code>de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationAnnotation</code> edge).
		 */
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation> Iterable<V> get_modifiers2();
		
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Annotation> Iterable<V> get_modifiers2(de.uni_koblenz.jgralab.VertexFilter<V> filter);
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
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationTypeParameters or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationTypeParameters> getTypeDeclarationTypeParametersIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationTypeParameters.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationTypeParameters> getTypeDeclarationTypeParametersIncidences(EdgeDirection direction);

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
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationSuperclassType or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperclassType> getTypeDeclarationSuperclassTypeIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationSuperclassType.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperclassType> getTypeDeclarationSuperclassTypeIncidences(EdgeDirection direction);

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
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeAccess or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeAccess> getTypeAccessIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeAccess.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeAccess> getTypeAccessIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationAnnotation or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationAnnotation> getTypeDeclarationAnnotationIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationAnnotation.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationAnnotation> getTypeDeclarationAnnotationIncidences(EdgeDirection direction);

	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationSuperInterfaceTypes or subtypes.
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperInterfaceTypes> getTypeDeclarationSuperInterfaceTypesIncidences();
	
	/**
	 * Returns an Iterable for all incidence edges of this vertex that are of type TypeDeclarationSuperInterfaceTypes.
	 * @param direction EdgeDirection.IN or EdgeDirection.OUT, only edges of this direction will be included in the Iterable
	 */
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeDeclarationSuperInterfaceTypes> getTypeDeclarationSuperInterfaceTypesIncidences(EdgeDirection direction);
}
