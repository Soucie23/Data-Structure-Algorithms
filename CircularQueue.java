package Queue;

import java.util.NoSuchElementException;

public class CircularQueue {
    private final int MaxSize = 5;
    private int[] queue = new int[MaxSize];
    private int front = -1;
    private int rear = -1;

    private void enqueue(int value) {
        if ((rear + 1) % MaxSize == front) {
            throw new NoSuchElementException();
        } else {
            rear = (rear + 1) % MaxSize;
            queue[rear] = value;
            if (front == -1) {
                front = 0;
            }
        }
    }

    private void dequeue() {
        if (front == -1) {
            System.out.println("Queue underflow.");
        } else {
            System.out.println("Dequeued element : " + queue[front]);
            if (front == rear) {
                front = rear - 1;
            } else {
                front = (front + 1) % MaxSize;
            }
        }
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue();
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        try {
            System.out.println("Dequeued element: "+circularQueue.dequeue());
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty");
        }
    }

}
