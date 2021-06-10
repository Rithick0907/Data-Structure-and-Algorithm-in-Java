package Part1LinearDataStructure;

public class LinkedList {
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void addFirst(int value) {
        if (isEmpty()) {
            head = tail = new Node(value);
        } else {
            Node node = new Node(value);
            node.next = head;
            head = node;
        }
    }

    public void addLast(int value) {
        Node current = new Node(value);
        if (isEmpty()) {
            head = tail = current;
        } else {
            tail.next = current;
            tail = tail.next;
        }
    }

    public int indexOf(int value) {
        int index = -1;
        if (!isEmpty()) {
            Node current = head;
            while (current != null) {
                if (current.data == value) {
                    index++;
                    break;
                }
                index++;
                current = current.next;
            }
        }
        return index;
    }

    public boolean contains(int value) {
        if (!isEmpty()) {
            Node current = head;
            while (current != null) {
                if (current.data == value) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    public int size() {
        int size = 0;
        if (!isEmpty()) {
            Node current = head;
            while (current != null) {
                size++;
                current = current.next;
            }
        }
        return size;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List is Empty");
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            if (previous == null) {
                head = tail = null;
            } else {
                tail = previous;
                tail.next = null;
            }
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        } else {
            System.out.println("Linked List is Empty");
        }
    }
}
