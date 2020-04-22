package de.uni_due.s3.jack2.backend.checkers.greqljavachecker.parser;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.IBinding;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.IVariableBinding;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.SuperMethodInvocation;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.AnnotationTypeDeclaration;
import de.uni_due.s3.jack2.backend.checkers.greqljavachecker.schema.java8.schema.Java8;
import de.uni_koblenz.jgralab.Edge;
import de.uni_koblenz.jgralab.Vertex;
import de.uni_koblenz.jgralab.schema.AttributedElementClass;
import de.uni_koblenz.jgralab.schema.EdgeClass;
import de.uni_koblenz.jgralab.schema.GraphElementClass;
import de.uni_koblenz.jgralab.schema.VertexClass;

public class BindingManager implements IVisitorExtra {
	
	private HashMap<String, Entry> declarations = new HashMap<String, Entry>();
	private Java8 graph;

	public BindingManager(Java8 graph) {
		this.graph = graph;
	}
	
	public void handle(Mapping mapping, ASTNode node, Vertex astGraphNode, Vertex parentAstGraphNode, MethodDeclaration currentMethod, TypeDeclaration currentType, Vertex currentPackageNode) {
		String currentMethodKey = "";
		String currentTypeKey = "";
		String currentPackageKey = "";
		if (currentMethod != null) {
			IMethodBinding currentMethodBinding = (IMethodBinding)currentMethod.resolveBinding();
			if (currentMethodBinding != null)
				currentMethodKey = cleanKey(currentMethodBinding.getKey());
		}
		if (currentType != null) {
			ITypeBinding currentTypeBinding = (ITypeBinding)currentType.resolveBinding();
			if (currentTypeBinding != null)
				currentTypeKey = cleanKey(currentTypeBinding.getKey());
		}
		if (currentPackageNode != null)
			currentPackageKey = generatePackageKey(currentPackageNode);
		
		// Quellen
		if (node instanceof ClassInstanceCreation) {
			IMethodBinding methodBinding = ((ClassInstanceCreation)node).resolveConstructorBinding();
			if (methodBinding == null) return;
			String keyMethod = cleanKey(methodBinding.getKey());
//			String keyType = cleanKey(methodBinding.getDeclaringClass().getKey());
//			String keyPackage = cleanKey(methodBinding.getDeclaringClass().getPackage().getKey());
			if (!currentMethodKey.equals(keyMethod))
				addSource(keyMethod, astGraphNode);
/*			if (!currentTypeKey.equals(keyType)) {
				addSource(keyType, aggNode);
				addSource(keyType, mapping.get(currentType));
			} if (!currentPackageKey.equals(keyPackage))
				addSource(keyPackage, aggNode);*/
		}
		if (node instanceof MethodInvocation) {
			IMethodBinding methodBinding = ((MethodInvocation)node).resolveMethodBinding();
			if (methodBinding == null) return;
			String keyMethod = cleanKey(methodBinding.getKey());
			String keyType = cleanKey(methodBinding.getDeclaringClass().getKey());
			String keyPackage = cleanKey(methodBinding.getDeclaringClass().getPackage().getKey());
			//if (!currentMethodKey.equals(keyMethod))
				addSource(keyMethod, astGraphNode);
			if (!currentTypeKey.equals(keyType)) {
				addSource(keyType, astGraphNode);
				addSource(keyType, mapping.get(currentType));
			} if (!currentPackageKey.equals(keyPackage))
				addSource(keyPackage, astGraphNode);
		}
		if (node instanceof SuperMethodInvocation) {
			IMethodBinding methodBinding = ((SuperMethodInvocation)node).resolveMethodBinding();
			if (methodBinding == null) return;
			String keyMethod = cleanKey(methodBinding.getKey());
			String keyType = cleanKey(methodBinding.getDeclaringClass().getKey());
			String keyPackage = cleanKey(methodBinding.getDeclaringClass().getPackage().getKey());
			//if (!currentMethodKey.equals(keyMethod))
				addSource(keyMethod, astGraphNode);
			if (!currentTypeKey.equals(keyType)) {
				addSource(keyType, astGraphNode);
				addSource(keyType, mapping.get(currentType));
			} if (!currentPackageKey.equals(keyPackage))
				addSource(keyPackage, astGraphNode);
		}
		if (node instanceof SimpleName && !(parentAstGraphNode instanceof AnnotationTypeDeclaration)) {
			IBinding binding = ((SimpleName)node).resolveBinding();
			if (binding == null) return;
			if (binding instanceof IVariableBinding) {
				IVariableBinding vBinding = (IVariableBinding)binding;
				String key = cleanKey(vBinding.getKey());
				addSource(key, astGraphNode);
/*				if (vBinding.getDeclaringMethod() != null) {
					String keyMethod = cleanKey(vBinding.getDeclaringMethod().getKey());
					if (!currentMethodKey.equals(keyMethod))
						//System.out.println(currentMethodKey + " <-> " + keyMethod);
						addSource(keyMethod, aggNode);
				}*/
				if (vBinding.getDeclaringClass() != null) {
					String keyType = cleanKey(vBinding.getDeclaringClass().getKey());
					addSource(keyType, astGraphNode);
					if (!currentTypeKey.equals(keyType))
						addSource(keyType, mapping.get(currentType));
					if (vBinding.getDeclaringClass().getPackage() != null) {
						String keyPackage = cleanKey(vBinding.getDeclaringClass().getPackage().getKey());
						if (!currentPackageKey.equals(keyPackage))
							addSource(keyPackage, astGraphNode);
					}
				}
			} else if (binding instanceof ITypeBinding) {
				ITypeBinding tBinding = (ITypeBinding)binding;
				String keyType = cleanKey(tBinding.getKey());
				if (!currentTypeKey.equals(keyType)) {
					addSource(keyType, astGraphNode);
					addSource(keyType, mapping.get(currentType));
				} 
//				System.out.println(node + " " + node.getFlags() + " " + node.getNodeType() + " " + node.getClass());
				//getPackage != null
				if(tBinding.getPackage() != null) {		
					String keyPackage = cleanKey(tBinding.getPackage().getKey());
					if (!currentPackageKey.equals(keyPackage))
						addSource(keyPackage, astGraphNode);
				}
			}
		}
		if (node instanceof SimpleType) {
			ITypeBinding typeBinding = ((SimpleType)node).resolveBinding();
			if (typeBinding == null) return;
			String keyType = cleanKey(typeBinding.getKey());
			//if (!currentTypeKey.equals(keyType))
				addSource(keyType, astGraphNode);
			//if (!currentTypeKey.equals(keyType))
				addSource(keyType, mapping.get(currentType));
			if (typeBinding.getPackage() != null) {
				String keyPackage = cleanKey(typeBinding.getPackage().getKey());
				if (!currentPackageKey.equals(keyPackage))
					addSource(keyPackage, astGraphNode);
			}
		}
/*		if (node instanceof ThisExpression) {
			ITypeBinding typeBinding = ((ThisExpression)node).resolveTypeBinding();
			if (typeBinding == null) return;
			String keyType = cleanKey(typeBinding.getKey());
			if (!currentTypeKey.equals(keyType)) {
				addSource(keyType, aggNode);
				addSource(keyType, mapping.get(currentType));
			}
			String keyPackage = cleanKey(typeBinding.getPackage().getKey());
			if (!currentPackageKey.equals(keyPackage))
				addSource(keyPackage, aggNode);
		}*/

		// Ziele
		if (node instanceof EnumConstantDeclaration) {
			addTarget(((EnumConstantDeclaration)node).resolveVariable(), astGraphNode, false);
			if (!currentTypeKey.equals(""))
				addTarget(currentTypeKey, mapping.get(currentType), false);
			if (!currentPackageKey.equals(""))
				addTarget(currentPackageKey, currentPackageNode, false);
		}
		if (node instanceof MethodDeclaration) {
			addTarget(((MethodDeclaration)node).resolveBinding(), astGraphNode, false);
			if (!currentTypeKey.equals(""))
				addTarget(currentTypeKey, mapping.get(currentType), false);
			if (!currentPackageKey.equals(""))
				addTarget(currentPackageKey, currentPackageNode, false);
		}
/*		if (node instanceof PackageDeclaration) {
			addTarget(((PackageDeclaration)node).resolveBinding(), aggNode, false);
		}*/
		if (node instanceof SingleVariableDeclaration) {
			addTarget(((SingleVariableDeclaration)node).resolveBinding(), astGraphNode, false);
			if (!currentMethodKey.equals(""))
				addTarget(currentMethodKey, mapping.get(currentMethod), false);
			if (!currentTypeKey.equals(""))
				addTarget(currentTypeKey, mapping.get(currentType), false);
			if (!currentPackageKey.equals(""))
				addTarget(currentPackageKey, currentPackageNode, false);
		}
		if (node instanceof TypeDeclaration) {
			addTarget(((TypeDeclaration)node).resolveBinding(), astGraphNode, false);
			if (!currentMethodKey.equals(""))
				addTarget(currentMethodKey, mapping.get(currentMethod), false);
			if (!currentPackageKey.equals(""))
				addTarget(currentPackageKey, currentPackageNode, false);
		}
		if (node instanceof VariableDeclarationFragment) {
			addTarget(((VariableDeclarationFragment)node).resolveBinding(), astGraphNode, false);
			if (!currentMethodKey.equals(""))
				addTarget(currentMethodKey, mapping.get(currentMethod), false);
			if (!currentTypeKey.equals(""))
				addTarget(currentTypeKey, mapping.get(currentType), false);
			if (!currentPackageKey.equals(""))
				addTarget(currentPackageKey, currentPackageNode, false);
		}

//		if (node instanceof ImportDeclaration)
//			addTarget(((ImportDeclaration)node).resolveBinding(), aggNode, ((ImportDeclaration)node).isOnDemand());
	}
	public void finish() {
		Iterator<String> iter = declarations.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			declarations.get(key).resolve(graph);
		}
	}
	
	public boolean isTarget(IBinding binding, Vertex node) {
		if (binding == null) return false;
		String key = cleanKey(binding.getKey());
		if (declarations.containsKey(key)) {
			if (declarations.get(key).targetNode != null) {
				if (declarations.get(key).targetNode.equals(node)) return true;
			}
		}
		return false;
	}

	private void addSource(String key, Vertex node) {
		if (declarations.containsKey(key)) {
			declarations.get(key).addSource(node);
		} else {
			Entry newEntry = new Entry();
			newEntry.addSource(node);
			declarations.put(key, newEntry);
		}
	}

	private void addTarget(IBinding binding, Vertex node, boolean onDemand) {
		if (binding == null) return;
		String key = cleanKey(binding.getKey());
		addTarget(key, node, onDemand);
	}
	
	private void addTarget(String key, Vertex node, boolean onDemand) {
		if (declarations.containsKey(key)) {
			Entry entry = declarations.get(key);
			entry.setTarget(node, onDemand);
		} else {
			Entry newEntry = new Entry();
			newEntry.setTarget(node, onDemand);
			declarations.put(key, newEntry);
		}
	}
	
	private String cleanKey(String key) {
		String cleanKey = key.replaceFirst("<(\\w|;|/|\\$)*>", "<>");
		return cleanKey;
	}

	private String generatePackageKey(Vertex astGraphNode) {
		if (astGraphNode == null)
			return "null";
		String name = (String)astGraphNode.getAttribute("name");
		return name.replace(".", "/");
	}

	private class Entry {
		
		private LinkedList<Vertex> sourceNodes = new LinkedList<Vertex>();
		
		private Vertex targetNode;
		
		private boolean targetOnDemand = false;
		
		public void addSource(Vertex node) {
			if (!sourceNodes.contains(node))
				sourceNodes.add(node);
		}
		
		public void setTarget(Vertex node, boolean onDemand) {
			targetNode = node;
			targetOnDemand = onDemand;
		}
		
		public boolean targetOnDemand() {
			return targetOnDemand;
		}
		
		public void resolve(Java8 graph) {
			if (targetNode == null)
				return;
			for (Vertex sourceNode : sourceNodes) {
				for (AttributedElementClass eClass : ((GraphElementClass<EdgeClass, Edge>) graph.getSchema().getAttributedElementClass("Access")).getDirectSubClasses()) {
					EdgeClass e = (EdgeClass)eClass;
					VertexClass from = e.getFrom().getVertexClass();
					VertexClass to = e.getTo().getVertexClass();
					
					if ((sourceNode.getAttributedElementClass().equals(from) || sourceNode.getAttributedElementClass().isSubClassOf(from)) && (targetNode.getAttributedElementClass().equals(to) || targetNode.getAttributedElementClass().isSubClassOf(to))) {
						graph.createEdge(e, sourceNode, targetNode);
					}
				}
			}
		}
	}

}
