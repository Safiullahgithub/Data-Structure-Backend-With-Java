
import java.util.EmptyStackException;

public class Stack<T> {
    private Node<T> top;
    private int size;

    // Node class to represent each element in the stack
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    // Constructor to initialize the stack
    public Stack() {
        top = null;
        size = 0;
    }

    // Method to push an element onto the stack
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Method to pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Method to peek at the top element of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to get the size of the stack
    public int size() {
        return size;
    }

    // Main method to demonstrate stack operations
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element
        System.out.println("Top element is: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Get the size of the stack
        System.out.println("Stack size is: " + stack.size());
    }
}

