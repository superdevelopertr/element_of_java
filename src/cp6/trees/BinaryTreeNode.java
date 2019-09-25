package cp6.trees;

public class BinaryTreeNode {
	String data;
	int level;
	BinaryTreeNode left, right, next;

	public BinaryTreeNode(String data) {
		this.data = data;
	}
		
	public BinaryTreeNode(String data, BinaryTreeNode left, BinaryTreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "data: "+data+", level: "+level+", next: ["+next+"]";
	}
}