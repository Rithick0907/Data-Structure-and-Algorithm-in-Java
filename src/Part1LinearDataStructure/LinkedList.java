package Part1LinearDataStructure;

public class LinkedList {
    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
        }
    }
    private Node head;
    private Node tail;

    public void addFirst(int value){
        if(head == null){
            head = tail = new Node(value);
        } else{
            Node node = new Node(value);
            node.next = head;
            head = node;
        }
    }

    public void addLast(int value){}

//    public int indexOf(int value){}
//
//    public boolean contains(int value){}

//    public int size(){}

    public void removeFirst(){}

    public void removeLast(){}
}
