package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.parser;

import java.util.LinkedList;

import org.eclipse.jdt.core.dom.ASTNode;

import de.uni_koblenz.jgralab.Vertex;

public class Mapping {
	
	private LinkedList<Entry> mapping;

	public Mapping() {
		mapping = new LinkedList<Entry>();
	}
	
	public void put(Vertex astGraphNode, ASTNode astNode) {
		mapping.add(new Entry(astGraphNode, astNode));
	}
	
	public ASTNode get(Vertex astGraphNode) {
		for (Entry next : mapping)
			if (next.getAggNode().equals(astGraphNode)) return next.astNode;
		return null;
	}
	
	public Vertex get(ASTNode astNode) {
		for (Entry next : mapping)
			if (next.getASTNode().equals(astNode)) return next.astGraphNode;
		return null;
	}
	
	public void remove(Vertex astGraphNode, ASTNode astNode) {
		Entry x = null;
		
		for (Entry next : mapping)
			if (next.getAggNode().equals(astGraphNode) && next.getASTNode().equals(astNode)) {
				x = next;
				break;
			}
		
		mapping.remove(x);
	}
	
	private class Entry {
		
		private Vertex astGraphNode;
		private ASTNode astNode;
		
		public Entry(Vertex astGraphNode, ASTNode astNode) {
			this.astGraphNode = astGraphNode;
			this.astNode = astNode;
		}
		
		public ASTNode getASTNode() {
			return astNode;
		}
		
		public Vertex getAggNode() {
			return astGraphNode;
		}
	}
	
}
