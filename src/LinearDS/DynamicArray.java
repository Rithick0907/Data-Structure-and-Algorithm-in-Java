package LinearDS;

import java.util.Arrays;

public class DynamicArray {
    int[] array;                            //Since array is also an object,here by default constructor it is initialized to null
    int size;
    int count;                              //To keep track of index

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.size = capacity;
    }

    public void resizeArray() {
        this.size = (size * 2);
        int[] newArray = new int[size];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void insert(int value) {
        if (count >= size) {
            resizeArray();
        }
        this.array[count++] = value;
    }

    public void remove(int index) {
        if (index >= count) {
            System.out.println("Enter valid index within range");
        } else {
            array[index] = 0;
            int[] newArray = new int[size];
            int j = 0;
            for (int i = 0; i < count; i++) {
                if (i == index) continue;
                newArray[j++] = array[i];
            }
            count--;
            array = newArray;
        }
    }

    public int findByValue(int value) {
        int index = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (array[i] == value) {
                index = i;
            }
        }
        return index;
    }

    public void print() {
        System.out.println(Arrays.toString(Arrays.copyOfRange(array, 0, count)));
    }
}
