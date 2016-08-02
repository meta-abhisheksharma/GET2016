package BinaryTree;

public class MyBinaryTree<T> {

	MyNode<T> root;
	String prefix = "";
	String postfix = "";
	public MyBinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	public MyNode<T> getRoot() {
		return root;
	}

	public void insertNode(T data) {
		root = insertNode(root, data);
	}

	/**
	 * this will take parameter and insert it into tree
	 * 
	 * @param parent
	 * @param data
	 * @return
	 */
	public MyNode<T> insertNode(MyNode<T> parent, T data) {

		if (parent == null) {
			parent = new MyNode<T>(data);
		} else {
			if (parent.getRight() == null) {
				parent.setRight(insertNode(parent.getRight(), data));
			} else {
				parent.setLeft(insertNode(parent.getLeft(), data));
			}
		}
		return parent;
	}

	/**
	 * this will traverse tree in root left right manner
	 * 
	 * @param node
	 */
	public String preOrder(MyNode<T> node) {
		 
		if (node != null) {
			prefix += node.getData() + "  ";
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
		return prefix;
	}

	/**
	 * this will traverse tree in left right and root manner
	 * 
	 * @param node
	 */
	public String postOrder(MyNode<T> node) {
		
		if (node != null) {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			postfix += node.getData() + "  ";
		}
		return postfix;
	}

}
