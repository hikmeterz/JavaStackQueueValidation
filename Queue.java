public class Queue {
	private QNode head;
	private QNode tail;

	public Queue() {
		head = new QNode(-1);
		tail = new QNode(-1);
		head.setNext(tail);
	}

	public boolean isEmpty() {
		return head.getNext() == tail;
	}

	public void enqueue(int value) {
		tail.setValue(value);
		tail.setNext(new QNode(-1));
		tail = tail.getNext();
	}

	public int dequeue() {
		if(isEmpty())
			return -1;
		head = head.getNext();
		int value = head.getValue();
		head.setValue(-1);
		return value;
	}

	public int peek() {
		if(!isEmpty())
			return head.getNext().getValue();
		else
			return -1;
	}
	
		
		
}