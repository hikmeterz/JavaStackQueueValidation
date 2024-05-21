public class Stack {
	private Node head;
	
	public Stack() {
		head = new Node("");//Head bos string.
		
	}
	public Node getHead() {
		
		return head;
	}
	
	public void push(String value) {
		Node temp = new Node(value);
		temp.setNext(head.getNext());//En son giren ilk cikacagi icin her push edilen node headin nexti olucak...
		head.setNext(temp);
	}
	
	public String peek() {
		if(head.getNext() != null)
			return head.getNext().getValue();//peekte ise devamli head in nexti alinacak....
		else
			return "";//Eger null ise bos don.....
	}
	
	public String pop() {
		if(head.getNext() != null) {//Null degilse
			String temp = head.getNext().getValue();//temp olarak headin nexti yani son giren node.
			head.setNext(head.getNext().getNext());//Poplucagimiz icin head in yeni nexti nextiniin nexti...
			return temp;
		}else
			return "";
	}
}