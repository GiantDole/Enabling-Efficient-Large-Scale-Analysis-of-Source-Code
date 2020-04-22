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

public class CatchClauseImpl extends VertexImpl implements de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClause, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element, de.uni_koblenz.jgralab.Vertex {

	protected int _line;

	public CatchClauseImpl(int id, de.uni_koblenz.jgralab.Graph g) {
		super(id, g);
	}

	@Override
	public final de.uni_koblenz.jgralab.schema.VertexClass getAttributedElementClass() {
		return de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClause.VC;
	}

	@Override
	public final java.lang.Class<? extends de.uni_koblenz.jgralab.Vertex> getSchemaClass() {
		return de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClause.class;
	}

	@SuppressWarnings("unchecked")
	public <T> T getAttribute(String attributeName) {
		if (attributeName.equals("line")) return (T) (java.lang.Integer) get_line();
		throw new NoSuchAttributeException("CatchClause doesn't contain an attribute " + attributeName);
	}

	public <T> void setAttribute(String attributeName, T data) {
		if (attributeName.equals("line")) {
			set_line((java.lang.Integer) data);
			return;
		}
		throw new NoSuchAttributeException("CatchClause doesn't contain an attribute " + attributeName);
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
		throw new NoSuchAttributeException("CatchClause doesn't contain an attribute " + attributeName);
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
		throw new NoSuchAttributeException("CatchClause doesn't contain an attribute " + attributeName);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClause getNextCatchClause() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClause)getNextVertex(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClause.VC);
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
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody getFirstLambdaExpressionBodyIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody getFirstLambdaExpressionBodyIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.LambdaExpressionBody.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody getFirstCatchClauseBodyIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody getFirstCatchClauseBodyIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody.EC, orientation);
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
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getFirstChildIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child getFirstChildIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC, orientation);
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
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementCatchClauses getFirstTryStatementCatchClausesIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementCatchClauses)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementCatchClauses.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementCatchClauses getFirstTryStatementCatchClausesIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementCatchClauses)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementCatchClauses.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException getFirstCatchClauseExceptionIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException getFirstCatchClauseExceptionIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException.EC, orientation);
	}
		@Override
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException add_exception(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclaration vertex) {
			return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8)getGraph()).createEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException.EC, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClause) this, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclaration) vertex);
		}
		@Override
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclaration> remove_exception() {
			java.util.List<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclaration> adjacences = new java.util.ArrayList<>();
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException.EC, EdgeDirection.OUT);
				adjacences.add((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclaration) edge.getThat());
				edge.delete();
				edge = next;
			}
			return adjacences;
		}
		@Override
		public boolean remove_exception(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclaration vertex) {
			boolean elementRemoved = false;
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException.EC, EdgeDirection.OUT);
				if (edge.getThat().equals(vertex)) {			edge.delete();
					elementRemoved = true;
				}
				edge = next;
			}
			return elementRemoved;
		}
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclaration> Iterable<V> get_exception() {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException.EC, EdgeDirection.OUT, null);
		}
		
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.SingleVariableDeclaration> Iterable<V> get_exception(de.uni_koblenz.jgralab.VertexFilter<V> filter) {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException.EC, EdgeDirection.OUT, filter);
		}
		@Override
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression add_expression(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression vertex) {
			return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8)getGraph()).createEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClause) this, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression) vertex);
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
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody add_body(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block vertex) {
			return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8)getGraph()).createEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody.EC, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClause) this, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block) vertex);
		}
		@Override
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block> remove_body() {
			java.util.List<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block> adjacences = new java.util.ArrayList<>();
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody.EC, EdgeDirection.OUT);
				adjacences.add((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block) edge.getThat());
				edge.delete();
				edge = next;
			}
			return adjacences;
		}
		@Override
		public boolean remove_body(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block vertex) {
			boolean elementRemoved = false;
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody.EC, EdgeDirection.OUT);
				if (edge.getThat().equals(vertex)) {			edge.delete();
					elementRemoved = true;
				}
				edge = next;
			}
			return elementRemoved;
		}
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block> Iterable<V> get_body() {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody.EC, EdgeDirection.OUT, null);
		}
		
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Block> Iterable<V> get_body(de.uni_koblenz.jgralab.VertexFilter<V> filter) {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody.EC, EdgeDirection.OUT, filter);
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
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody> getCatchClauseBodyIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody> getCatchClauseBodyIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseBody.EC, direction);
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
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child> getChildIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child> getChildIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Child.EC, direction);
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
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementCatchClauses> getTryStatementCatchClausesIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementCatchClauses.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementCatchClauses> getTryStatementCatchClausesIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.TryStatementCatchClauses.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException> getCatchClauseExceptionIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException> getCatchClauseExceptionIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CatchClauseException.EC, direction);
	}
}
