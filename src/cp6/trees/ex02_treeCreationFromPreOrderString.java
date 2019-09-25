package cp6.trees;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ex02_treeCreationFromPreOrderString {

	private int index=0;
	
	private void print(BinaryTreeNode tree) {
		if (tree == null) {
			return;
		}
		System.out.println(tree.data);
		print(tree.left);
		print(tree.right);
	}


	private BinaryTreeNode createTree(List<String> output) {
		String node = output.get(index);
		index++;
		if(node==null) {
			return null;
		}
		BinaryTreeNode left = createTree(output);
		BinaryTreeNode right = createTree(output);
		return new BinaryTreeNode(node,left , right);
	}

	@Test
	public void verify_BinaryTree() {
		List<String> output = Arrays.asList("1","2","4", null, null, "5", null, null, "3", null,null);

		BinaryTreeNode tree = createTree(output);
		print(tree);
	}


}