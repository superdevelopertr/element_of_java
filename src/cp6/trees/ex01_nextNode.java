package cp6.trees;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ex01_nextNode {

	public List<BinaryTreeNode> getLevelOrderNodeList(BinaryTreeNode a) {
		Deque<BinaryTreeNode> traverseQ = new LinkedList<>();
		List<BinaryTreeNode> nodes = new ArrayList<>();
		
		traverseQ.addLast(a);
		int level = 0;
		a.level=0;
		nodes.add(a);
		while(!traverseQ.isEmpty()) {
			BinaryTreeNode node = traverseQ.removeFirst();
			
			level = node.level;
			level++;
			if(node.left!=null) {
				BinaryTreeNode left = node.left;
				left.level=level;
				traverseQ.addLast(left);
				nodes.add(left);
			}
			
			if(node.right!=null) {
				BinaryTreeNode right = node.right;
				right.level=level;
				traverseQ.addLast(right);
				nodes.add(right);
			}
		}
		
		return nodes;
	}
	
	public void setNext(List<BinaryTreeNode> nodes) {
		for (int i = 0; i < nodes.size()-1; i++) {
			if(nodes.get(i).level==nodes.get(i+1).level) {
				nodes.get(i).next= nodes.get(i+1);
			}
		}
	}
	
	private BinaryTreeNode a;
	
	@Before
	public void init() {
		a = new BinaryTreeNode("A");
		BinaryTreeNode b = new BinaryTreeNode("B");
		BinaryTreeNode c = new BinaryTreeNode("C");
		BinaryTreeNode d = new BinaryTreeNode("D");
		BinaryTreeNode e = new BinaryTreeNode("E");
		BinaryTreeNode f = new BinaryTreeNode("F");
		BinaryTreeNode g = new BinaryTreeNode("G");
		BinaryTreeNode h = new BinaryTreeNode("H");
		
		a.left= b;
		a.right=c;
		b.left=d;
		c.left=e;
		c.right=f;
		f.left=g;
		f.right=h;
		
	}
	
	@Test
	public void verifyLevelOrder() {
		String expected = "A B C D E F G H";
		
		List<BinaryTreeNode> nodes = getLevelOrderNodeList(a);
	
		String result = nodes.stream().map(n->n.data).reduce((n1,n2)->n1+" "+n2).get();
		
		assertEquals(expected, result);
	}

	@Test
	public void printLevelOrder() {
		
		List<BinaryTreeNode> nodes = getLevelOrderNodeList(a);
		setNext(nodes);
		
		nodes.stream().forEach(System.out::println);
	}
}