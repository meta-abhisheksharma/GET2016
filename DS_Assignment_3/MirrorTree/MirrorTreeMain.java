package MirrorTree;

import java.util.Scanner;

public class MirrorTreeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String operation[] = new String[] { "First Tree", "Second Tree","Check Mirror" };
		
		MyBinaryTree<Integer> bTree1 = new MyBinaryTree<Integer>();
		MyBinaryTree<Integer> bTree2 = new MyBinaryTree<Integer>();
		
		MyNode<Integer> node1 = new MyNode<Integer>(1);
		MyNode<Integer> node2 = new MyNode<Integer>(2);
		MyNode<Integer> node3 = new MyNode<Integer>(3);
		MyNode<Integer> node4 = new MyNode<Integer>(4);
		MyNode<Integer> node5 = new MyNode<Integer>(5);
		MyNode<Integer> node6 = new MyNode<Integer>(6);

		node1.setLeft(node3);
		node1.setRight(node2);

		node2.setLeft(node5);
		node2.setRight(node4);
		node3.setLeft(node6);
		
		MyNode<Integer> node11 = new MyNode<Integer>(1);
		MyNode<Integer> node12 = new MyNode<Integer>(2);
		MyNode<Integer> node13 = new MyNode<Integer>(3);
		MyNode<Integer> node14 = new MyNode<Integer>(4);
		MyNode<Integer> node15 = new MyNode<Integer>(5);
		MyNode<Integer> node16 = new MyNode<Integer>(6);
		
		node11.setLeft(node12);
		node11.setRight(node13);

		node12.setLeft(node14);
		node12.setRight(node15);
		node13.setRight(node16);

		MyBinaryTree<Integer> bt = new MyBinaryTree<Integer>();
		if (bt.checkMirror(node1, node11)) {
			System.out.println("Both Binary Tree Are Mirror Image");

		} else {
			System.out.println("Not Mirror Image");
		}
		bTree1.printLeafNodes(node1);
		System.out.println();
		bTree2.printLeafNodes(node11);
	}

}
