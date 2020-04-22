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

public class AssertStatementImpl extends VertexImpl implements de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatement, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement, de.uni_koblenz.jgralab.Vertex {

	protected int _line;

	public AssertStatementImpl(int id, de.uni_koblenz.jgralab.Graph g) {
		super(id, g);
	}

	@Override
	public final de.uni_koblenz.jgralab.schema.VertexClass getAttributedElementClass() {
		return de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatement.VC;
	}

	@Override
	public final java.lang.Class<? extends de.uni_koblenz.jgralab.Vertex> getSchemaClass() {
		return de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatement.class;
	}

	@SuppressWarnings("unchecked")
	public <T> T getAttribute(String attributeName) {
		if (attributeName.equals("line")) return (T) (java.lang.Integer) get_line();
		throw new NoSuchAttributeException("AssertStatement doesn't contain an attribute " + attributeName);
	}

	public <T> void setAttribute(String attributeName, T data) {
		if (attributeName.equals("line")) {
			set_line((java.lang.Integer) data);
			return;
		}
		throw new NoSuchAttributeException("AssertStatement doesn't contain an attribute " + attributeName);
	}

	public int get_line() {
		return _line;
	}

	public void set_line(int _line) {
		graph.fireBeforeChangeAttribute(this, "line", this._line, _line);
		Object oldValue = this._line;
		this._line = _line;
		internalMarkAttributeAsSet(0, true);
		graphModified();
		graph.fireAfterChangeAttribute(this, "line", oldValue, _line);
	}

	public void readAttributeValues(GraphIO io) throws GraphIOException {
		{
			boolean attrIsSet = true;
			if (!io.isNextToken(de.uni_koblenz.jgralab.impl.TgLexer.Token.UNSET_LITERAL)) {
				_line = io.matchInteger();
			} else {
				io.match();
				attrIsSet = false;
			}
			if (attrIsSet) {set_line(_line);}
		}
	}

	public void readAttributeValueFromString(String attributeName, String value) throws GraphIOException {
		if (attributeName.equals("line")) {
			GraphIO io = GraphIO.createStringReader(value, getSchema());
			boolean attrIsSet = true;
			if (!io.isNextToken(de.uni_koblenz.jgralab.impl.TgLexer.Token.UNSET_LITERAL)) {
				_line = io.matchInteger();
			} else {
				io.match();
				attrIsSet = false;
			}
			if (attrIsSet) {set_line(_line);}
			return;
		}
		throw new NoSuchAttributeException("AssertStatement doesn't contain an attribute " + attributeName);
	}

	public void writeAttributeValues(GraphIO io) throws GraphIOException, IOException {
		if (isUnsetAttribute("line")) {
			io.writeIdentifier(GraphIO.UNSET_LITERAL);
		} else {
			io.writeInteger(_line);
		}
	}

	public String writeAttributeValueToString(String attributeName) throws IOException, GraphIOException {
		if (attributeName.equals("line")) {
			GraphIO io = GraphIO.createStringWriter(getSchema());
			if (isUnsetAttribute("line")) {
				io.writeIdentifier(GraphIO.UNSET_LITERAL);
			} else {
				io.writeInteger(_line);
			}
			return io.getStringWriterResult();
		}
		throw new NoSuchAttributeException("AssertStatement doesn't contain an attribute " + attributeName);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatement getNextAssertStatement() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatement)getNextVertex(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatement.VC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element getNextElement() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element)getNextVertex(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element.VC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node getNextNode() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node)getNextVertex(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Node.VC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement getNextStatement() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement)getNextVertex(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Statement.VC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.WhileStatementBody getFirstWhileStatementBodyIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.WhileStatementBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.WhileStatementBody.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.WhileStatementBody getFirstWhileStatementBodyIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.WhileStatementBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.WhileStatementBody.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression getFirstElementExpressionIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression getFirstElementExpressionIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SwitchStatementStatements getFirstSwitchStatementStatementsIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SwitchStatementStatements)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SwitchStatementStatements.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SwitchStatementStatements getFirstSwitchStatementStatementsIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SwitchStatementStatements)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SwitchStatementStatements.EC, orientation);
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
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementBody getFirstTryStatementBodyIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementBody.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementBody getFirstTryStatementBodyIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementBody.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnhancedForStatementBody getFirstEnhancedForStatementBodyIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnhancedForStatementBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnhancedForStatementBody.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnhancedForStatementBody getFirstEnhancedForStatementBodyIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnhancedForStatementBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnhancedForStatementBody.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement getFirstIfStatementThenStatementIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement getFirstIfStatementThenStatementIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody getFirstLambdaExpressionBodyIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody getFirstLambdaExpressionBodyIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody.EC, orientation);
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
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement getFirstIfStatementElseStatementIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement getFirstIfStatementElseStatementIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BlockStatements getFirstBlockStatementsIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BlockStatements)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BlockStatements.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BlockStatements getFirstBlockStatementsIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BlockStatements)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BlockStatements.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LabeledStatementBody getFirstLabeledStatementBodyIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LabeledStatementBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LabeledStatementBody.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LabeledStatementBody getFirstLabeledStatementBodyIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LabeledStatementBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LabeledStatementBody.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ForStatementBody getFirstForStatementBodyIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ForStatementBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ForStatementBody.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ForStatementBody getFirstForStatementBodyIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ForStatementBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ForStatementBody.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage getFirstAssertStatementMessageIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage getFirstAssertStatementMessageIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage.EC, orientation);
	}
		@Override
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage add_message(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression vertex) {
			return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8)getGraph()).createEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage.EC, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatement) this, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression) vertex);
		}
		@Override
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression> remove_message() {
			java.util.List<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression> adjacences = new java.util.ArrayList<>();
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage.EC, EdgeDirection.OUT);
				adjacences.add((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression) edge.getThat());
				edge.delete();
				edge = next;
			}
			return adjacences;
		}
		@Override
		public boolean remove_message(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression vertex) {
			boolean elementRemoved = false;
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage.EC, EdgeDirection.OUT);
				if (edge.getThat().equals(vertex)) {			edge.delete();
					elementRemoved = true;
				}
				edge = next;
			}
			return elementRemoved;
		}
		@Override
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression get_message() {
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage.EC, EdgeDirection.OUT);
			if (edge != null) {
				return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression) edge.getThat();
			}
			return null;
		}
		@Override
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression add_expression(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression vertex) {
			return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8)getGraph()).createEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatement) this, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression) vertex);
		}
		@Override
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression> remove_expression() {
			java.util.List<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression> adjacences = new java.util.ArrayList<>();
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC, EdgeDirection.OUT);
				adjacences.add((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression) edge.getThat());
				edge.delete();
				edge = next;
			}
			return adjacences;
		}
		@Override
		public boolean remove_expression(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression vertex) {
			boolean elementRemoved = false;
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC, EdgeDirection.OUT);
				if (edge.getThat().equals(vertex)) {			edge.delete();
					elementRemoved = true;
				}
				edge = next;
			}
			return elementRemoved;
		}
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression> Iterable<V> get_expression() {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC, EdgeDirection.OUT, null);
		}
		
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression> Iterable<V> get_expression(de.uni_koblenz.jgralab.VertexFilter<V> filter) {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC, EdgeDirection.OUT, filter);
		}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.WhileStatementBody> getWhileStatementBodyIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.WhileStatementBody.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.WhileStatementBody> getWhileStatementBodyIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.WhileStatementBody.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression> getElementExpressionIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression> getElementExpressionIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SwitchStatementStatements> getSwitchStatementStatementsIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SwitchStatementStatements.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SwitchStatementStatements> getSwitchStatementStatementsIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SwitchStatementStatements.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access> getAccessIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access> getAccessIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Access.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementBody> getTryStatementBodyIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementBody.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementBody> getTryStatementBodyIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementBody.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnhancedForStatementBody> getEnhancedForStatementBodyIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnhancedForStatementBody.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnhancedForStatementBody> getEnhancedForStatementBodyIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.EnhancedForStatementBody.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement> getIfStatementThenStatementIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement> getIfStatementThenStatementIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementThenStatement.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody> getLambdaExpressionBodyIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody> getLambdaExpressionBodyIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody.EC, direction);
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
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement> getIfStatementElseStatementIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement> getIfStatementElseStatementIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IfStatementElseStatement.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BlockStatements> getBlockStatementsIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BlockStatements.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BlockStatements> getBlockStatementsIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.BlockStatements.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LabeledStatementBody> getLabeledStatementBodyIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LabeledStatementBody.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LabeledStatementBody> getLabeledStatementBodyIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LabeledStatementBody.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ForStatementBody> getForStatementBodyIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ForStatementBody.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ForStatementBody> getForStatementBodyIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ForStatementBody.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage> getAssertStatementMessageIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage> getAssertStatementMessageIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AssertStatementMessage.EC, direction);
	}
}
