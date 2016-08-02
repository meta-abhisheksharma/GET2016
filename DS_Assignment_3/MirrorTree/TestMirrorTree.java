package MirrorTree;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMirrorTree {

	@Test
	public void test() {
		MyNode<Integer> n1 = new MyNode<Integer>(1);
		MyNode<Integer> n2 = new MyNode<Integer>(2);
		MyNode<Integer> n3 = new MyNode<Integer>(3);
		MyNode<Integer> n4 = new MyNode<Integer>(4);
		MyNode<Integer> n5 = new MyNode<Integer>(5);
		MyNode<Integer> n6 = new MyNode<Integer>(6);

		n1.setLeft(n3);
		n1.setRight(n2);

		n2.setLeft(n5);
		n2.setRight(n4);
		n3.setLeft(n6);
		
		MyNode<Integer> n11 = new MyNode<Integer>(1);
		MyNode<Integer> n12 = new MyNode<Integer>(2);
		MyNode<Integer> n13 = new MyNode<Integer>(3);
		MyNode<Integer> n14 = new MyNode<Integer>(4);
		MyNode<Integer> n15 = new MyNode<Integer>(5);
		MyNode<Integer> n16 = new MyNode<Integer>(6);
		
		n11.setLeft(n12);
		n11.setRight(n13);

		n12.setLeft(n14);
		n12.setRight(n15);
		n13.setRight(n16);
		
		MyBinaryTree<Integer> bt = new MyBinaryTree<Integer>();
		
		assertEquals(true,bt.checkMirror(n1, n11));
	}

}
