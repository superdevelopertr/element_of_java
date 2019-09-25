package cp4.linkedlist;

public class EvenOdd {

	static class Node {
		Integer value;
		Node next;

		public Node(Integer value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return value.toString();
		}
	}

	public static Node evenOdd(Node original) {
		if (original == null || original.next == null) {
			return original;
		}

		int i = 0;
		Node evenNode = new Node(original.value);
		Node headOfEven = evenNode;
		Node oddNode = new Node(original.next.value);
		Node headOfOdd = oddNode;

		original = original.next;
		i++;

		while (original.next != null) {
			original = original.next;
			i++;
			if (i % 2 == 0) {
				evenNode.next = new Node(original.value);
				evenNode = evenNode.next;
			} else {
				oddNode.next = new Node(original.value);
				oddNode = oddNode.next;
			}
		}

		evenNode.next = headOfOdd;

		return headOfEven;
	}

	public static void main(String[] args) {
		Node n = new Node(1);
		Node n2 = new Node(2);
		n.next=n2;
		Node n3 = new Node(3);
		n2.next=n3;
		Node n4 = new Node(4);
		n3.next=n4;
		Node n5 = new Node(5);
		n4.next=n5;

		Node result = evenOdd(n);
		
		while(result!=null){
			System.out.println(result.value+" ");
			result = result.next;
		}
	}

}
