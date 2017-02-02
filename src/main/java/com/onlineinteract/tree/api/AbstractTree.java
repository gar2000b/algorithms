package com.onlineinteract.tree.api;

/**
 * An abstract base class providing some functionality of the Tree
 * interface.
 */
public abstract class AbstractTree<E> implements Tree<E> {
	// O(1)
	public boolean isInternal(Position<E> p) {
		return numChildren(p) > 0;
	}

	// O(1)
	public boolean isExternal(Position<E> p) {
		return numChildren(p) == 0;
	}

	// O(1)
	public boolean isRoot(Position<E> p) {
		return p == root();
	}

	// O(1)
	public boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * Returns the number of levels separating Position p from the
	 * root. It does this based on recursively calling depth (itself),
	 * passing in a call to parent(p) which by this point will have
	 * been implemented.
	 * 
	 * The base case is detected when isRoot(p) is true, thereby
	 * returning 0. For each return thereafter, 1 will be added for
	 * each depth level until the initial recursive call is made. 
	 * O(dp + 1)
	 * 
	 */
	public int depth(Position<E> p) {
		if (isRoot(p))
			return 0;
		else
			return 1 + depth(parent(p));
	}

	/**
	 * Returns the height of the tree. It does this by returning the
	 * largest depth. The height bad algorithm basically cycles
	 * through each position, determines if it's an external / leaf
	 * and gets it's depth. Returns the largest depth.
	 * 
	 * Time Complexity O(n ^ 2)
	 */
	private int heightBad() { // works, but quadratic worst-case time
		int h = 0;
		for (Position<E> p : positions())
			if (isExternal(p)) // only consider leaf positions
				h = Math.max(h, depth(p));
		return h;
	}

	/**
	 * Returns the height of the subtree rooted at Position p. From
	 * the root position past in, it cycles through its children. As
	 * you can see, if this method is called recursively updating the
	 * largest height among the children. If there are no children,
	 * the for-each is never executed and the largest height is simply
	 * returned. Notice how 1 is added each time to the recursion as
	 * it traverses down through the particular path of each child.
	 * 
	 * Time Complexity O(n).
	 */
	public int height(Position<E> p) {
		int h = 0; // base case if p is external
		for (Position<E> c : children(p))
			h = Math.max(h, 1 + height(c));
		return h;
	}
}