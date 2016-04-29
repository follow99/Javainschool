package ca3;

public final class Node {
	private Object object;
	private Node next;
	private Node previous;
	private int Priority;



	public Node(Node previous,Object object, Node next) {
		//super();
		setPrevious(previous);
		setObject(object);
		setNext(next);
	}
	
	public int getPriority() {
		return Priority;
	}

	public void setPriority(int priority) {
		Priority = priority;
	}
	
	public Node getPrevious() {
		return previous;
	}


	public void setPrevious(Node previous) {
		this.previous = previous;
	}	
	
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

}
