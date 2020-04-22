/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.impl;

import de.uni_koblenz.jgralab.impl.IncidenceIterable;

import de.uni_koblenz.jgralab.impl.std.VertexImpl;

import de.uni_koblenz.jgralab.EdgeDirection;
import de.uni_koblenz.jgralab.GraphIO;
import de.uni_koblenz.jgralab.exception.GraphIOException;
import de.uni_koblenz.jgralab.exception.NoSuchAttributeException;

import java.io.IOException;

public class IJavaProjectImpl extends VertexImpl implements de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProject, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node, de.uni_koblenz.jgralab.Vertex {

	protected java.lang.String _name;

	public IJavaProjectImpl(int id, de.uni_koblenz.jgralab.Graph g) {
		super(id, g);
	}

	@Override
	public final de.uni_koblenz.jgralab.schema.VertexClass getAttributedElementClass() {
		return de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProject.VC;
	}

	@Override
	public final java.lang.Class<? extends de.uni_koblenz.jgralab.Vertex> getSchemaClass() {
		return de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProject.class;
	}

	@SuppressWarnings("unchecked")
	public <T> T getAttribute(String attributeName) {
		if (attributeName.equals("name")) return (T) get_name();
		throw new NoSuchAttributeException("IJavaProject doesn't contain an attribute " + attributeName);
	}

	public <T> void setAttribute(String attributeName, T data) {
		if (attributeName.equals("name")) {
			set_name((java.lang.String) data);
			return;
		}
		throw new NoSuchAttributeException("IJavaProject doesn't contain an attribute " + attributeName);
	}

	public java.lang.String get_name() {
		return _name;
	}

	public void set_name(java.lang.String _name) {
		graph.fireBeforeChangeAttribute(this, "name", this._name, _name);
		Object oldValue = this._name;
		this._name = _name;
		internalMarkAttributeAsSet(0, true);
		graphModified();
		graph.fireAfterChangeAttribute(this, "name", oldValue, _name);
	}

	public void readAttributeValues(GraphIO io) throws GraphIOException {
		{
			boolean attrIsSet = true;
			if (!io.isNextToken(de.uni_koblenz.jgralab.impl.TgLexer.Token.UNSET_LITERAL)) {
				_name = io.matchUtfString();
			} else {
				io.match();
				attrIsSet = false;
			}
			if (attrIsSet) {set_name(_name);}
		}
	}

	public void readAttributeValueFromString(String attributeName, String value) throws GraphIOException {
		if (attributeName.equals("name")) {
			GraphIO io = GraphIO.createStringReader(value, getSchema());
			boolean attrIsSet = true;
			if (!io.isNextToken(de.uni_koblenz.jgralab.impl.TgLexer.Token.UNSET_LITERAL)) {
				_name = io.matchUtfString();
			} else {
				io.match();
				attrIsSet = false;
			}
			if (attrIsSet) {set_name(_name);}
			return;
		}
		throw new NoSuchAttributeException("IJavaProject doesn't contain an attribute " + attributeName);
	}

	public void writeAttributeValues(GraphIO io) throws GraphIOException, IOException {
		if (isUnsetAttribute("name")) {
			io.writeIdentifier(GraphIO.UNSET_LITERAL);
		} else {
			io.writeUtfString(_name);
		}
	}

	public String writeAttributeValueToString(String attributeName) throws IOException, GraphIOException {
		if (attributeName.equals("name")) {
			GraphIO io = GraphIO.createStringWriter(getSchema());
			if (isUnsetAttribute("name")) {
				io.writeIdentifier(GraphIO.UNSET_LITERAL);
			} else {
				io.writeUtfString(_name);
			}
			return io.getStringWriterResult();
		}
		throw new NoSuchAttributeException("IJavaProject doesn't contain an attribute " + attributeName);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProject getNextIJavaProject() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProject)getNextVertex(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProject.VC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node getNextNode() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node)getNextVertex(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node.VC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getFirstChildIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getFirstChildIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements getFirstIJavaProjectFragementsIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements getFirstIJavaProjectFragementsIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits getFirstIJavaProjectUnitsIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits getFirstIJavaProjectUnitsIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access getFirstAccessIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access getFirstAccessIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access.EC, orientation);
	}
		@Override
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements add_fragments(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment vertex) {
			return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8)getGraph()).createEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements.EC, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProject) this, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment) vertex);
		}
		@Override
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment> remove_fragments() {
			java.util.List<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment> adjacences = new java.util.ArrayList<>();
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements.EC, EdgeDirection.OUT);
				adjacences.add((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment) edge.getThat());
				edge.delete();
				edge = next;
			}
			return adjacences;
		}
		@Override
		public boolean remove_fragments(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment vertex) {
			boolean elementRemoved = false;
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements.EC, EdgeDirection.OUT);
				if (edge.getThat().equals(vertex)) {			edge.delete();
					elementRemoved = true;
				}
				edge = next;
			}
			return elementRemoved;
		}
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment> Iterable<V> get_fragments() {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements.EC, EdgeDirection.OUT, null);
		}
		
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragment> Iterable<V> get_fragments(de.uni_koblenz.jgralab.VertexFilter<V> filter) {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements.EC, EdgeDirection.OUT, filter);
		}
		@Override
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits add_units(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit vertex) {
			return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8)getGraph()).createEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits.EC, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProject) this, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit) vertex);
		}
		@Override
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit> remove_units() {
			java.util.List<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit> adjacences = new java.util.ArrayList<>();
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits.EC, EdgeDirection.OUT);
				adjacences.add((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit) edge.getThat());
				edge.delete();
				edge = next;
			}
			return adjacences;
		}
		@Override
		public boolean remove_units(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit vertex) {
			boolean elementRemoved = false;
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits.EC, EdgeDirection.OUT);
				if (edge.getThat().equals(vertex)) {			edge.delete();
					elementRemoved = true;
				}
				edge = next;
			}
			return elementRemoved;
		}
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit> Iterable<V> get_units() {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits.EC, EdgeDirection.OUT, null);
		}
		
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit> Iterable<V> get_units(de.uni_koblenz.jgralab.VertexFilter<V> filter) {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits.EC, EdgeDirection.OUT, filter);
		}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child> getChildIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child> getChildIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements> getIJavaProjectFragementsIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements> getIJavaProjectFragementsIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectFragements.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits> getIJavaProjectUnitsIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits> getIJavaProjectUnitsIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IJavaProjectUnits.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access> getAccessIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access> getAccessIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access.EC, direction);
	}
}