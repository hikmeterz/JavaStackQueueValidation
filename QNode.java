public class QNode {
	private int value;
	private QNode next;
	
	public QNode(int value) {
		this.value = value;
		this.next = null;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setNext(QNode next) {
		this.next = next;
	}
	
	public int getValue() {
		return value;
	}
	
	public QNode getNext() {
		return next;
	}
}