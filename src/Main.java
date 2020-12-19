import Part1LinearDataStructure.*;     //import all class from Part1OrderedDataStructure

public class Main {
    public static void main(String[] args) {
        HashTable hm=new HashTable(5);  //here 5 is capacity of hash table
        hm.put("Rithick",10);
        hm.put("Ram",50);
        hm.get("Rithick");
        hm.remove("Ram");
    }
}