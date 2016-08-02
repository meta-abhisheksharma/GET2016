package MirrorTree;
public class MyBinaryTree<T> {

	MyNode<T> root;

	public MyBinaryTree() {
		root = null;
	}

	public MyNode<T> getRoot() {
		return root;
	}
	
	//method insert value in tree
	public void insertNode(T data) {
		root = insertNode(root, data);
	}
	
	//method to generate mirror image
	public MyNode<T> mirrorImage(MyNode<T> node) {
		if (node == null) {
			return node;
		} else {
			MyNode<T> temp = node.getRight();
			node.setRight(node.getLeft());
			node.setLeft(temp);
			mirrorImage(node.getRight());
			mirrorImage(node.getLeft());
		}
		return node;
	}

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
		System.out.println(" " + parent.getData());
		return parent;
	}
	
	//it checks that both given tree are mirror image or not
	public boolean checkMirror(MyNode<T> node1, MyNode<T> node2) {
		if (node1 == null && node2 == null)
			return true;
		if (node1 != null && node2 != null) {
			return (node1.getData() == node2.getData()
					&& checkMirror(node1.getLeft(), node2.getRight()) 
					&& checkMirror(node1.getRight(), node2.getLeft()));
		}
		return false;
	}
	
	/**
	 * this print the leaf node of tree
	 * @param node
	 */
	public void printLeafNodes(MyNode<T> node) {
		if (node == null)
			return;
		if (node.left == null && node.right == null) {
			System.out.printf("%d ", node.data);
		}
		printLeafNodes(node.left);
		printLeafNodes(node.right);
	}

}
