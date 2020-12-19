package Part1LinearDataStructure;

import java.util.LinkedList;

public class HashTable {
    private class Entry{
        private String key;
        private int value;
        public Entry(String key,int value){
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<Entry>[] entries;
    private int capacity;

    public HashTable(int capacity){
        entries = new LinkedList[capacity];
        this.capacity = capacity;
    }

    public int hashFunction(String key){
        int hash = 0;
        for(char c : key.toCharArray()){
            hash += c;
        }
        return Math.abs(hash%capacity);     //Here we use modulus to get index of hash within array capacity
    }

    public void put(String key,int value){
        int index = hashFunction(key);
        if(entries[index] == null){
            entries[index] = new LinkedList<>();
            //Here we only create a new linked list in array index if that index is empty and not add any values to it.
            //So don't break the exit after initializing that index
        }

        LinkedList<Entry> bucket = entries[index];        //Store that values array index to another variable to make our code clean.
        for(var entry : bucket){                   //This for loop is to handle repeated key values
            if(entry.key == key){
                entry.value = value;
                return;
            }
        }
        bucket.addLast(new Entry(key, value));      //This is to add new node to our linked list in specified array index
    }

    public int get(String key){
        int result = Integer.MIN_VALUE;
        int index = hashFunction(key);
        LinkedList<Entry> bucket = entries[index];

        if(bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key) {
                    result = entry.value;
                    break;
                }
            }
        }
        return result;
    }

    public void remove(String key){
        int index = hashFunction(key);
        var bucket = entries[index];
        if(bucket != null){
            for(var entry : bucket){
                if(entry.key == key){
                    bucket.remove(entry);       //remove method removes that passed object from list
                    return;
                }
            }
        }
        throw new IllegalStateException();      //To handle if the specified key is absent scenario
    }
}
