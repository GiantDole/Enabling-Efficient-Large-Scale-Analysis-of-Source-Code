/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.impl;

import de.uni_koblenz.jgralab.impl.std.EdgeImpl;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Type;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameter;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.impl.ReversedTypeParameterTypeImpl;
import de.uni_koblenz.jgralab.EdgeDirection;
import de.uni_koblenz.jgralab.GraphIO;
import de.uni_koblenz.jgralab.Vertex;
import de.uni_koblenz.jgralab.exception.GraphIOException;
import de.uni_koblenz.jgralab.exception.NoSuchAttributeException;

import java.io.IOException;
/**
 * FromVertexClass: TypeParameter
 * FromRoleName : 
 * ToVertexClass: Type
 * ToRoleName : typeBounds
 */

public class TypeParameterTypeImpl extends EdgeImpl implements de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child, de.uni_koblenz.jgralab.Edge, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType {

	protected int _position;

	public TypeParameterTypeImpl(int id, de.uni_koblenz.jgralab.Graph g, Vertex alpha, Vertex omega) {
		super(id, g, alpha, omega);
		((de.uni_koblenz.jgralab.impl.InternalGraph) graph).addEdge(this, alpha, omega);
	}

	@Override
	public final de.uni_koblenz.jgralab.schema.EdgeClass getAttributedElementClass() {
		return de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType.EC;
	}

	@Override
	public final java.lang.Class<? extends de.uni_koblenz.jgralab.Edge> getSchemaClass() {
		return de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType.class;
	}

	@SuppressWarnings("unchecked")
	public <T> T getAttribute(String attributeName) {
		if (attributeName.equals("position")) return (T) (java.lang.Integer) get_position();
		throw new NoSuchAttributeException("TypeParameterType doesn't contain an attribute " + attributeName);
	}

	public <T> void setAttribute(String attributeName, T data) {
		if (attributeName.equals("position")) {
			set_position((java.lang.Integer) data);
			return;
		}
		throw new NoSuchAttributeException("TypeParameterType doesn't contain an attribute " + attributeName);
	}

	public int get_position() {
		return _position;
	}

	public void set_position(int _position) {
		graph.fireBeforeChangeAttribute(this, "position", this._position, _position);
		Object oldValue = this._position;
		this._position = _position;
		internalMarkAttributeAsSet(0, true);
		graphModified();
		graph.fireAfterChangeAttribute(this, "position", oldValue, _position);
	}

	public void readAttributeValues(GraphIO io) throws GraphIOException {
		{
			boolean attrIsSet = true;
			if (!io.isNextToken(de.uni_koblenz.jgralab.impl.TgLexer.Token.UNSET_LITERAL)) {
				_position = io.matchInteger();
			} else {
				io.match();
				attrIsSet = false;
			}
			if (attrIsSet) {set_position(_position);}
		}
	}

	public void readAttributeValueFromString(String attributeName, String value) throws GraphIOException {
		if (attributeName.equals("position")) {
			GraphIO io = GraphIO.createStringReader(value, getSchema());
			boolean attrIsSet = true;
			if (!io.isNextToken(de.uni_koblenz.jgralab.impl.TgLexer.Token.UNSET_LITERAL)) {
				_position = io.matchInteger();
			} else {
				io.match();
				attrIsSet = false;
			}
			if (attrIsSet) {set_position(_position);}
			return;
		}
		throw new NoSuchAttributeException("TypeParameterType doesn't contain an attribute " + attributeName);
	}

	public void writeAttributeValues(GraphIO io) throws GraphIOException, IOException {
		if (isUnsetAttribute("position")) {
			io.writeIdentifier(GraphIO.UNSET_LITERAL);
		} else {
			io.writeInteger(_position);
		}
	}

	public String writeAttributeValueToString(String attributeName) throws IOException, GraphIOException {
		if (attributeName.equals("position")) {
			GraphIO io = GraphIO.createStringWriter(getSchema());
			if (isUnsetAttribute("position")) {
				io.writeIdentifier(GraphIO.UNSET_LITERAL);
			} else {
				io.writeInteger(_position);
			}
			return io.getStringWriterResult();
		}
		throw new NoSuchAttributeException("TypeParameterType doesn't contain an attribute " + attributeName);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildInGraph() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child)getNextEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType getNextTypeParameterTypeInGraph() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType)getNextEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType.EC);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC, orientation);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType getNextTypeParameterTypeIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType.EC);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType getNextTypeParameterTypeIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TypeParameterType.EC, orientation);
	}

	public de.uni_koblenz.jgralab.schema.AggregationKind getAggregationKind() {
		return de.uni_koblenz.jgralab.schema.AggregationKind.NONE;
	}

	@Override
	public de.uni_koblenz.jgralab.schema.AggregationKind getAlphaAggregationKind() {
		return de.uni_koblenz.jgralab.schema.AggregationKind.NONE;
	}

	@Override
	public de.uni_koblenz.jgralab.schema.AggregationKind getOmegaAggregationKind() {
		return de.uni_koblenz.jgralab.schema.AggregationKind.NONE;
	}

	protected de.uni_koblenz.jgralab.impl.ReversedEdgeBaseImpl createReversedEdge() {
		return new ReversedTypeParameterTypeImpl(this, graph);
	}
	public TypeParameter getAlpha() {
		return (TypeParameter) super.getAlpha();
	}
	public Type getOmega() {
		return (Type) super.getOmega();
	}
}
