package Queue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class OperationsQueue {
    private static final int MAX = 10;
    private int[] queue = new int[MAX];
    private int front = -1;
    private int rear = -1;

    public void enqueue(int value) {
        if (rear == MAX - 1) {
            System.out.println("Queue is full");
        } else {
            rear = rear + 1;
            queue[rear] = value;
            if (front == -1) {
                front = 0;
            }
        }
    }
    public int dequeue() {
        if (front == -1) {
            throw new NoSuchElementException();
        } else {
            int removedElement = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = front + 1;
            }
            return removedElement;
        }
    }
    public static void main(String[] args) {
        OperationsQueue queue1 = new OperationsQueue();


            queue1.enqueue(10);
            queue1.enqueue(20);
            queue1.enqueue(30);
try{
            System.out.println("Dequeued element: " + queue1.dequeue());
            System.out.println("Dequeued element: " + queue1.dequeue());
            System.out.println("Dequeued element: " + queue1.dequeue());
            System.out.println("Dequeued element: " + queue1.dequeue());
        }
        catch (NoSuchElementException e){
            System.out.println("Error: Queue is empty");
        }
    }
}
