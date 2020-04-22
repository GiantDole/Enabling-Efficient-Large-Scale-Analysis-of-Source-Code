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

public class CompilationUnitImpl extends VertexImpl implements de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Element, de.uni_koblenz.jgralab.Vertex {

	protected int _line;

	protected java.lang.String _name;

	public CompilationUnitImpl(int id, de.uni_koblenz.jgralab.Graph g) {
		super(id, g);
	}

	@Override
	public final de.uni_koblenz.jgralab.schema.VertexClass getAttributedElementClass() {
		return de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit.VC;
	}

	@Override
	public final java.lang.Class<? extends de.uni_koblenz.jgralab.Vertex> getSchemaClass() {
		return de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit.class;
	}

	@SuppressWarnings("unchecked")
	public <T> T getAttribute(String attributeName) {
		if (attributeName.equals("line")) return (T) (java.lang.Integer) get_line();
		if (attributeName.equals("name")) return (T) get_name();
		throw new NoSuchAttributeException("CompilationUnit doesn't contain an attribute " + attributeName);
	}

	public <T> void setAttribute(String attributeName, T data) {
		if (attributeName.equals("line")) {
			set_line((java.lang.Integer) data);
			return;
		}
		if (attributeName.equals("name")) {
			set_name((java.lang.String) data);
			return;
		}
		throw new NoSuchAttributeException("CompilationUnit doesn't contain an attribute " + attributeName);
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

	public java.lang.String get_name() {
		return _name;
	}

	public void set_name(java.lang.String _name) {
		graph.fireBeforeChangeAttribute(this, "name", this._name, _name);
		Object oldValue = this._name;
		this._name = _name;
		internalMarkAttributeAsSet(1, true);
		graphModified();
		graph.fireAfterChangeAttribute(this, "name", oldValue, _name);
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
		throw new NoSuchAttributeException("CompilationUnit doesn't contain an attribute " + attributeName);
	}

	public void writeAttributeValues(GraphIO io) throws GraphIOException, IOException {
		if (isUnsetAttribute("line")) {
			io.writeIdentifier(GraphIO.UNSET_LITERAL);
		} else {
			io.writeInteger(_line);
		}
		if (isUnsetAttribute("name")) {
			io.writeIdentifier(GraphIO.UNSET_LITERAL);
		} else {
			io.writeUtfString(_name);
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
		if (attributeName.equals("name")) {
			GraphIO io = GraphIO.createStringWriter(getSchema());
			if (isUnsetAttribute("name")) {
				io.writeIdentifier(GraphIO.UNSET_LITERAL);
			} else {
				io.writeUtfString(_name);
			}
			return io.getStringWriterResult();
		}
		throw new NoSuchAttributeException("CompilationUnit doesn't contain an attribute " + attributeName);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit getNextCompilationUnit() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit)getNextVertex(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit.VC);
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
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes getFirstCompilationUnitTypesIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes getFirstCompilationUnitTypesIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes.EC, orientation);
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
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage getFirstCompilationUnitPackageIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage getFirstCompilationUnitPackageIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage.EC, orientation);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports getFirstCompilationUnitImportsIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports getFirstCompilationUnitImportsIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports.EC, orientation);
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
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits getFirstIPackageFragmentUnitsIncidence() {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits.EC);
	}

	@Override
	public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits getFirstIPackageFragmentUnitsIncidence(EdgeDirection orientation) {
		return (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits)getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits.EC, orientation);
	}
		@Override
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports add_imports(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ImportDeclaration vertex) {
			return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8)getGraph()).createEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports.EC, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit) this, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ImportDeclaration) vertex);
		}
		@Override
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ImportDeclaration> remove_imports() {
			java.util.List<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ImportDeclaration> adjacences = new java.util.ArrayList<>();
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports.EC, EdgeDirection.OUT);
				adjacences.add((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ImportDeclaration) edge.getThat());
				edge.delete();
				edge = next;
			}
			return adjacences;
		}
		@Override
		public boolean remove_imports(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ImportDeclaration vertex) {
			boolean elementRemoved = false;
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports.EC, EdgeDirection.OUT);
				if (edge.getThat().equals(vertex)) {			edge.delete();
					elementRemoved = true;
				}
				edge = next;
			}
			return elementRemoved;
		}
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ImportDeclaration> Iterable<V> get_imports() {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports.EC, EdgeDirection.OUT, null);
		}
		
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ImportDeclaration> Iterable<V> get_imports(de.uni_koblenz.jgralab.VertexFilter<V> filter) {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports.EC, EdgeDirection.OUT, filter);
		}
		@Override
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes add_types(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AbstractTypeDeclaration vertex) {
			return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8)getGraph()).createEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes.EC, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit) this, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AbstractTypeDeclaration) vertex);
		}
		@Override
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AbstractTypeDeclaration> remove_types() {
			java.util.List<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AbstractTypeDeclaration> adjacences = new java.util.ArrayList<>();
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes.EC, EdgeDirection.OUT);
				adjacences.add((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AbstractTypeDeclaration) edge.getThat());
				edge.delete();
				edge = next;
			}
			return adjacences;
		}
		@Override
		public boolean remove_types(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AbstractTypeDeclaration vertex) {
			boolean elementRemoved = false;
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes.EC, EdgeDirection.OUT);
				if (edge.getThat().equals(vertex)) {			edge.delete();
					elementRemoved = true;
				}
				edge = next;
			}
			return elementRemoved;
		}
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AbstractTypeDeclaration> Iterable<V> get_types() {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes.EC, EdgeDirection.OUT, null);
		}
		
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AbstractTypeDeclaration> Iterable<V> get_types(de.uni_koblenz.jgralab.VertexFilter<V> filter) {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes.EC, EdgeDirection.OUT, filter);
		}
		@Override
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression add_expression(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression vertex) {
			return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8)getGraph()).createEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.ElementExpression.EC, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit) this, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Expression) vertex);
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
		public de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage add_package(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.PackageDeclaration vertex) {
			return ((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8)getGraph()).createEdge(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage.EC, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnit) this, (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.PackageDeclaration) vertex);
		}
		@Override
		public java.util.List<? extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.PackageDeclaration> remove_package() {
			java.util.List<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.PackageDeclaration> adjacences = new java.util.ArrayList<>();
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage.EC, EdgeDirection.OUT);
				adjacences.add((de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.PackageDeclaration) edge.getThat());
				edge.delete();
				edge = next;
			}
			return adjacences;
		}
		@Override
		public boolean remove_package(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.PackageDeclaration vertex) {
			boolean elementRemoved = false;
			de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage edge = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage) getFirstIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage.EC, EdgeDirection.OUT);
			while (edge != null) {
				de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage next = (de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage) edge.getNextIncidence(de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage.EC, EdgeDirection.OUT);
				if (edge.getThat().equals(vertex)) {			edge.delete();
					elementRemoved = true;
				}
				edge = next;
			}
			return elementRemoved;
		}
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.PackageDeclaration> Iterable<V> get_package() {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage.EC, EdgeDirection.OUT, null);
		}
		
		@Override
		public <V extends de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.PackageDeclaration> Iterable<V> get_package(de.uni_koblenz.jgralab.VertexFilter<V> filter) {
			return new de.uni_koblenz.jgralab.impl.NeighbourIterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage, V>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage.EC, EdgeDirection.OUT, filter);
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
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes> getCompilationUnitTypesIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes> getCompilationUnitTypesIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitTypes.EC, direction);
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
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage> getCompilationUnitPackageIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage> getCompilationUnitPackageIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitPackage.EC, direction);
	}

	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports> getCompilationUnitImportsIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports> getCompilationUnitImportsIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.CompilationUnitImports.EC, direction);
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
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits> getIPackageFragmentUnitsIncidences() {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits.EC);
	}
	
	@Override
	public Iterable<de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits> getIPackageFragmentUnitsIncidences(EdgeDirection direction) {
		return new IncidenceIterable<>(this, de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.IPackageFragmentUnits.EC, direction);
	}
}
