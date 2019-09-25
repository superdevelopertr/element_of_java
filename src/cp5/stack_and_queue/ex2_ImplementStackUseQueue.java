package cp5.stack_and_queue;

public class ex2_ImplementStackUseQueue {
	private bootCamp2_queueImpl q1 = new bootCamp2_queueImpl();
	private bootCamp2_queueImpl q2 = new bootCamp2_queueImpl();
	
	public void push(Integer a) {
		q1.enqueue(a);
	}
	
	public Integer pop() {
		Integer lastOne=null;
		while(!q1.isEmpty()) {
			lastOne = q1.dequeue();
			if(!q1.isEmpty()) {
				q2.enqueue(lastOne);
			}
		}
		
		while(!q2.isEmpty()) {
			q1.enqueue(q2.dequeue());
		}
		
		return lastOne;
	}
	
	public static void main(String[] args) {
		ex2_ImplementStackUseQueue a = new ex2_ImplementStackUseQueue();
		a.push(1);
		a.push(2);
		a.push(3);
		System.out.println(a.pop());
		
		a.push(5);
		System.out.println(a.pop());
	}
}