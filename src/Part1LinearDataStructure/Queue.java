package Part1LinearDataStructure;

import java.util.Arrays;

public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int count;

    public Queue(int capacity){
        queue = new int[capacity];
    }

    public void enqueue(int value){
        if(isFull()) {
            System.out.println("Queue is Full");
        }else{
            queue[rear] = value;         //Here we use array circularly to efficiently use empty array index space
            rear = (rear + 1) % queue.length;
            count++;
        }
    }

    public int dequeue(){
        if(isEmpty())   throw new IllegalArgumentException();
        int result = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return result;
    }

    public int peek(){
        return queue[front];
    }

    public boolean isFull(){
        return count == queue.length;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        return Arrays.toString(queue);
    }
}
