/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.impl;

import de.uni_koblenz.jgralab.impl.std.ReversedEdgeImpl;
import de.uni_koblenz.jgralab.impl.std.EdgeImpl;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpression;
import de.uni_koblenz.jgralab.EdgeDirection;
import de.uni_koblenz.jgralab.Graph;
import de.uni_koblenz.jgralab.GraphIO;
import de.uni_koblenz.jgralab.exception.GraphIOException;

import java.io.IOException;

public class ReversedInfixExpressionLeftOperandImpl extends ReversedEdgeImpl implements de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child, de.uni_koblenz.jgralab.Edge, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpressionLeftOperand {

	ReversedInfixExpressionLeftOperandImpl(EdgeImpl e, Graph g) {
		super(e, g);
	}

	@Override
	public final de.uni_koblenz.jgralab.schema.EdgeClass getAttributedElementClass() {
		return getNormalEdge().getAttributedElementClass();
	}

	public int get_position() {
		return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpressionLeftOperand)normalEdge).get_position();
	}

	public void set_position(int _position) {
		((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpressionLeftOperand)normalEdge).set_position(_position);
	}

	public void readAttributeValues(GraphIO io) throws GraphIOException {
		throw new GraphIOException("Can not call readAttributeValues for reversed Edges.");
	}

	public void readAttributeValueFromString(String attributeName, String value) throws GraphIOException {
		throw new GraphIOException("Can not call readAttributeValuesFromString for reversed Edges.");
	}

	public void writeAttributeValues(GraphIO io) throws GraphIOException, IOException {
		throw new GraphIOException("Can not call writeAttributeValues for reversed Edges.");
	}

	public String writeAttributeValueToString(String _attributeName) throws IOException, GraphIOException {
		throw new GraphIOException("Can not call writeAttributeValueToString for reversed Edges.");
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildInGraph() {
		return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child)normalEdge).getNextChildInGraph();
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpressionLeftOperand getNextInfixExpressionLeftOperandInGraph() {
		return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpressionLeftOperand)normalEdge).getNextInfixExpressionLeftOperandInGraph();
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getNextChildIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC, orientation);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpressionLeftOperand getNextInfixExpressionLeftOperandIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpressionLeftOperand)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpressionLeftOperand.EC);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpressionLeftOperand getNextInfixExpressionLeftOperandIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpressionLeftOperand)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.InfixExpressionLeftOperand.EC, orientation);
	}
	public InfixExpression getAlpha() {
		return (InfixExpression) super.getAlpha();
	}
	public Expression getOmega() {
		return (Expression) super.getOmega();
	}
}
