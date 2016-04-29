package ca3;

/**
 *
 * @author Administrator
 */
public class DoublyLinedList implements Ilist {

	private final Node head;
	private final Node ends;
	private int size;

	public DoublyLinedList() {
		super();
		head = new Node(null, null, null);
		ends = new Node(head, null, null);
		size = 0;
		head.setNext(ends);
	}

	@Override
	public Node getNode(int pos) {
		if (pos > this.size - 1 || pos < 0)
			throw new IndexOutOfBoundsException();

		Node current = head.getNext();
		for (int i = 0; i < pos; i++) {
			current = current.getNext();
		}

		return current;

	}
        

	@Override
	public void add(Object object) {
		Node newNode = new Node(null, object, null);
		ends.getPrevious().setNext(newNode);
		newNode.setPrevious(ends.getPrevious());
		newNode.setNext(ends);
		ends.setPrevious(newNode);
		size++;

	}

        @Override
	public boolean isEmpty() {
		return (this.size == 0);

	}

	@Override
	public void remove(int pos) {
		Node currnet = getNode(pos);
		currnet.getPrevious().setNext(currnet.getNext());
		currnet.getNext().setPrevious(currnet.getPrevious());
		size--;

	}

	
        @Override
	public void insert(int pos, int pos2) {
		Node current = getNode(pos);
		Node insertTo = getNode(pos2);
		insertTo.getPrevious().setNext(insertTo.getNext());
		insertTo.getNext().setPrevious(insertTo.getPrevious());
		insertTo.setPrevious(current.getPrevious());
		insertTo.setNext(current);
		current.getPrevious().setNext(insertTo);
		current.setPrevious(insertTo);

	}

	@Override
	public int size() {
		return size;
	}

	// 
	public String getNodeToString(int i) {
		Patient patient = (Patient) this.getNode(i).getObject();

		return patient.getFname() + "," + patient.getLname() + "," + patient.getPPS() + "," + String.valueOf(i) + ","
				+ patient.getConditionDescrption();

	}

        @Override
	public String toString() {
		String replyString = "";
		if (this.size == 0) {
			replyString = "N/A,N/A,N/A";
			// return replyString;

		} else {
			for (int i = 0; i < this.size; i++) {
				Patient patient = (Patient) this.getNode(i).getObject();
				if (this.getNode(i).getPriority() != 0) {
					replyString = replyString + patient.getFname() + "," + patient.getLname() + ","
							 + this.getNode(i).getPriority() + "\n";

				}

			}

		}

		return replyString;

	}
        
        // using for large amount data search however not been used in this project 

	public Node getNodeBackfromEnd(int pos) {
		if (pos > this.size - 1 || pos < 0)
			throw new IndexOutOfBoundsException();

		Node currentFromBack = ends.getPrevious();
		for (int i = this.size - 1; i > pos; i--) {
			currentFromBack = currentFromBack.getPrevious();
		}

		return currentFromBack;	

	}

}
