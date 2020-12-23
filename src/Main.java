import Part1LinearDataStructure.*;     //import all class from Part1OrderedDataStructure

public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(1);
        array.insert(10);
        array.insert(20);
        array.print();
        array.remove(0);
        array.print();
        System.out.println(array.findByValue(20));
    }
}