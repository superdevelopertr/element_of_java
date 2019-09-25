package cp6.trees;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ex02_treeCreationFromPostOrderString {

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
		
	}

	@Test
	public void verify_BinaryTree() {
		List<String> output = Arrays.asList(null, null, "4", null, null, "5","2",null,null,"3","1");

		BinaryTreeNode tree = createTree(output);
		print(tree);
	}

}