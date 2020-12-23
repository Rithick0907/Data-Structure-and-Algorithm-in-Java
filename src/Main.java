import Part1LinearDataStructure.*;     //import all class from Part1OrderedDataStructure

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(40);
        list.addLast(50);
        list.removeFirst();
        list.addLast(60);
        list.addLast(70);
        list.removeLast();
        list.addFirst(10);
        list.print();
    }
}