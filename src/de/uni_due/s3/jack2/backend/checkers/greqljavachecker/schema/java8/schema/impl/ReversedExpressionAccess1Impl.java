/*
 * This code was generated automatically.
 * Do NOT edit this file, changes will be lost.
 * Instead, change and commit the underlying schema.
 */

package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.impl;

import de.uni_koblenz.jgralab.impl.std.ReversedEdgeImpl;
import de.uni_koblenz.jgralab.impl.std.EdgeImpl;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BodyDeclaration;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression;
import de.uni_koblenz.jgralab.EdgeDirection;
import de.uni_koblenz.jgralab.Graph;
import de.uni_koblenz.jgralab.GraphIO;
import de.uni_koblenz.jgralab.exception.GraphIOException;

import java.io.IOException;

public class ReversedExpressionAccess1Impl extends ReversedEdgeImpl implements de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access, de.uni_koblenz.jgralab.Edge, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1 {

	ReversedExpressionAccess1Impl(EdgeImpl e, Graph g) {
		super(e, g);
	}

	@Override
	public final de.uni_koblenz.jgralab.schema.EdgeClass getAttributedElementClass() {
		return getNormalEdge().getAttributedElementClass();
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

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access getNextAccessInGraph() {
		return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access)normalEdge).getNextAccessInGraph();
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1 getNextExpressionAccess1InGraph() {
		return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1)normalEdge).getNextExpressionAccess1InGraph();
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access getNextAccessIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access.EC);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access getNextAccessIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access.EC, orientation);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1 getNextExpressionAccess1Incidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1.EC);
	}

	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1 getNextExpressionAccess1Incidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1)getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ExpressionAccess1.EC, orientation);
	}
	public Expression getAlpha() {
		return (Expression) super.getAlpha();
	}
	public BodyDeclaration getOmega() {
		return (BodyDeclaration) super.getOmega();
	}
}
