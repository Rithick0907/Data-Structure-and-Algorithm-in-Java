package LinearDataStructure;

import java.util.Arrays;

public class Stack {
    int[] stack;
    int size;
    int top;

    public Stack(int capacity) {
        stack = new int[capacity];
        this.size = capacity;
    }

    private void resize() {
        this.size = size * 2;
        int[] newArray = new int[size];
        for (int i = 0; i < top; i++) {
            newArray[i] = stack[i];
        }
        stack = newArray;
    }

    public void push(int value) {
        if (top >= size) {
            resize();
        }
        stack[top++] = value;
    }

    public int pop() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return stack[--top];
    }

    public int peek() {
        return top == 0 ? Integer.MIN_VALUE : stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void print() {
        System.out.println(Arrays.toString(Arrays.copyOfRange(stack, 0, top)));
    }
}
