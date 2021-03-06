package com.onlineinteract.tree;

import java.util.Iterator;

import com.onlineinteract.tree.api.AbstractBinaryTree;
import com.onlineinteract.tree.api.Position;

/**
 * Concrete implementation of a binary tree using a node-based, linked
 * structure.
 */
public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {
	// ---------------- nested Node class ----------------
	protected static class Node<E> implements Position<E> {
		// an element stored at this node
		private E element;
		// a reference to the parent node (if any)
		private Node<E> parent;
		// a reference to the left child (if any)
		private Node<E> left;
		// a reference to the right child (if any)
		private Node<E> right;

		/** Constructs a node with the given element and neighbors. */
		public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
			element = e;
			parent = above;
			left = leftChild;
			right = rightChild;
		}

		// accessor methods

		public E getElement() {
			return element;
		}

		public Node<E> getParent() {
			return parent;
		}

		public Node<E> getLeft() {
			return left;
		}

		public Node<E> getRight() {
			return right;
		} // update methods

		public void setElement(E e) {
			element = e;
		}

		public void setParent(Node<E> parentNode) {
			parent = parentNode;
		}

		public void setLeft(Node<E> leftChild) {
			left = leftChild;
		}

		public void setRight(Node<E> rightChild) {
			right = rightChild;
		}
	} // ----------- end of nested Node class -----------

	/** Factory function to create a new node storing element e. */
	protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right) {
		return new Node<E>(e, parent, left, right);
	}

	// LinkedBinaryTree instance variables
	protected Node<E> root = null; // root of the tree
	private int size = 0; // number of nodes in the tree

	// constructor
	public LinkedBinaryTree() {
	} // constructs an empty binary tree
		// nonpublic utility

	/**
	 * Validates the position and returns it as a node. Invalid
	 * conditions are: if it is not an instance of Node or if the Node
	 * being passed in is equal to the same instance as its parent
	 * (therefore a defunct node).
	 * 
	 */
	protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
		if (!(p instanceof Node))
			throw new IllegalArgumentException("Not valid position type");
		Node<E> node = (Node<E>) p; // safe cast
		if (node.getParent() == node) // our convention for defunct
										// node
			throw new IllegalArgumentException("p is no longer in the tree");
		return node;
	}

	// accessor methods (not already implemented in
	// AbstractBinaryTree) O(1).
	/** Returns the number of nodes in the tree. */
	public int size() {
		return size;
	}

	/**
	 * Returns the root Position of the tree (or null if tree is
	 * empty). O(1)
	 */
	public Position<E> root() {
		return root;
	}

	/** Returns the Position of p's parent (or null if p is root). O(1) */
	public Position<E> parent(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return node.getParent();
	}

	/**
	 * Returns the Position of p's left child (or null if no child
	 * exists). O(1)
	 */
	public Position<E> left(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return node.getLeft();
	}

	/**
	 * Returns the Position of p's right child (or null if no child
	 * exists). O(1)
	 */
	public Position<E> right(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		return node.getRight();
	}

	// update methods supported by this class
	/**
	 * Places element e at the root of an empty tree and returns its
	 * new Position. If the tree already contains nodes, throw
	 * exceptions, else create the root node with element passed in. O(1)
	 */
	public Position<E> addRoot(E e) throws IllegalStateException {
		if (!isEmpty())
			throw new IllegalStateException("Tree is not empty");
		root = createNode(e, null, null, null);
		size = 1;
		return root;
	}

	/**
	 * Creates a new left child of Position p storing element e;
	 * returns its Position. O(1)
	 */
	public Position<E> addLeft(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> parent = validate(p);
		if (parent.getLeft() != null)
			throw new IllegalArgumentException("p already has a left child");
		Node<E> child = createNode(e, parent, null, null);
		parent.setLeft(child);
		size++;
		return child;
	}

	/**
	 * Creates a new right child of Position p storing element e;
	 * returns its Position. O(1)
	 */
	public Position<E> addRight(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> parent = validate(p);
		if (parent.getRight() != null)
			throw new IllegalArgumentException("p already has a right child");
		Node<E> child = createNode(e, parent, null, null);
		parent.setRight(child);
		size++;
		return child;
	}

	/**
	 * Replaces the element at Position p with e and returns the
	 * replaced element. O(1)
	 */
	public E set(Position<E> p, E e) throws IllegalArgumentException {
		Node<E> node = validate(p);
		E temp = node.getElement();
		node.setElement(e);
		return temp;
	}

	/**
	 * Attaches trees t1 and t2 as left and right subtrees of external
	 * p.
	 */
	public void attach(Position<E> p, LinkedBinaryTree<E> t1, LinkedBinaryTree<E> t2) throws IllegalArgumentException {
		Node<E> node = validate(p);
		if (isInternal(p))
			throw new IllegalArgumentException("p must be a leaf");
		size += t1.size() + t2.size();
		if (!t1.isEmpty()) { // attach t1 as left subtree of node
			t1.root.setParent(node);
			node.setLeft(t1.root);
			t1.root = null;
			t1.size = 0;
		}
		if (!t2.isEmpty()) { // attach t2 as right subtree of node
			t2.root.setParent(node);
			node.setRight(t2.root);
			t2.root = null;
			t2.size = 0;
		}
	}

	/**
	 * Removes the node at Position p and replaces it with its child,
	 * if any. From looking at this, we cannot remove nodes from the
	 * middle of the tree - more specifically, if it has two children.
	 * If it had once child, it would move up into its place. If it
	 * had no children, then of course the node to be removed would
	 * simply just disappear.
	 */
	public E remove(Position<E> p) throws IllegalArgumentException {
		Node<E> node = validate(p);
		if (numChildren(p) == 2)
			throw new IllegalArgumentException("p has two children");
		Node<E> child = (node.getLeft() != null ? node.getLeft() : node.getRight());
		if (child != null)
			child.setParent(node.getParent()); // child’s grandparent
												// becomes its parent
		if (node == root)
			root = child; // child becomes root
		else {
			Node<E> parent = node.getParent();
			if (node == parent.getLeft())
				parent.setLeft(child);
			else
				parent.setRight(child);
		}
		size--;
		E temp = node.getElement();
		node.setElement(null); // help garbage collection
		node.setLeft(null);
		node.setRight(null);
		node.setParent(node); // our convention for defunct node
		return temp;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Position<E>> positions() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		System.out.println("Linked Binary Tree Demo");
		System.out.println("-----------------------");
		System.out.println();

		LinkedBinaryTree<Character> lbt = new LinkedBinaryTree<>();
		Position<Character> rootNode = lbt.addRoot('-');
		Position<Character> level1Pos1 = lbt.addLeft(rootNode, '/');
		Position<Character> level1Pos2 = lbt.addRight(rootNode, '+');

		Position<Character> level2Pos1 = lbt.addLeft(level1Pos1, '*');
		Position<Character> level2Pos2 = lbt.addRight(level1Pos1, '+');

		Position<Character> level2Pos3 = lbt.addLeft(level1Pos2, '*');
		Position<Character> level2Pos4 = lbt.addRight(level1Pos2, '6');

		Position<Character> level3Pos1 = lbt.addLeft(level2Pos1, '+');
		Position<Character> level3Pos2 = lbt.addRight(level2Pos1, '3');

		Position<Character> level3Pos3 = lbt.addLeft(level2Pos2, '-');
		Position<Character> level3Pos4 = lbt.addRight(level2Pos2, '2');

		Position<Character> level3Pos5 = lbt.addLeft(level2Pos3, '3');
		Position<Character> level3Pos6 = lbt.addRight(level2Pos3, '-');

		Position<Character> level4Pos1 = lbt.addLeft(level3Pos1, '3');
		Position<Character> level4Pos2 = lbt.addRight(level3Pos1, '1');

		Position<Character> level4Pos3 = lbt.addLeft(level3Pos3, '9');
		Position<Character> level4Pos4 = lbt.addRight(level3Pos3, '5');

		Position<Character> level4Pos5 = lbt.addLeft(level3Pos6, '7');
		Position<Character> level4Pos6 = lbt.addRight(level3Pos6, '4');

		Iterable<Position<Character>> children = lbt.children(level2Pos1);

		for (Position<Character> position : children) {
			System.out.print(" | " + position.getElement());
		}
		System.out.print(" |\n");

		// Try to remove a node with two children (should throw
		// exception)
		try {
			lbt.remove(level2Pos3);
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

		// Remove a leaf node
		lbt.remove(level4Pos5);

		// Prove removal
		children = lbt.children(level3Pos6);

		for (Position<Character> position : children) {
			System.out.print(" | " + position.getElement());
		}
		System.out.print(" |\n");

		// Remove parent same parent node to see if remaining child
		// (4) replaces it.
		
		lbt.remove(level3Pos6);
		
		// Prove the new parent has no children now
		children = lbt.children(level4Pos6);

		for (Position<Character> position : children) {
			System.out.print(" | " + position.getElement());
		}
		System.out.print(" |\n");
		
		//Prove it's new parent contains it (4) now.
		children = lbt.children(level2Pos3);

		for (Position<Character> position : children) {
			System.out.print(" | " + position.getElement());
		}
		System.out.print(" |\n");
		
		/**
		 * Output should be:
		 * 
		 * Linked Binary Tree Demo
		 * -----------------------
		 * | + | 3 |
		 * Exception: p has two children
		 * | 4 |
		 * |
		 * | 3 | 4 |
		 */

	}
} // ----------- end of LinkedBinaryTree class -----------