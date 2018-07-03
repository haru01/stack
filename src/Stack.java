
public class Stack {

	private int index = 0;
	private int[] values;

	public Stack() {
		this(10);
	}

	public Stack(int capacity) {
		values = new int[capacity];
	}

	public int capacity() {
		return values.length;
	}

	public int size() {
		return index;
	}

	public void push(int value) throws OverflowException {
		if (isFull()) {
			throw new OverflowException();
		}
		values[index++] = value;
	}

	public int pop() throws EmptyException {
		if (isEmpty()) {
			throw new EmptyException();
		}
		return values[--index];
	}

	public boolean isFull() {
		return index == values.length;
	}

	private boolean isEmpty() {
		return index == 0;
	}

	public String toString() {
		if (isEmpty()) {
			return "[]";
		}
		StringBuilder s = new StringBuilder();
		s.append('[');
		s.append(values[0]);
		for (int i = 1; i < index; i++) {
			s.append(',');
			s.append(values[i]);
		}
		s.append(']');
		return s.toString();
	}
}
