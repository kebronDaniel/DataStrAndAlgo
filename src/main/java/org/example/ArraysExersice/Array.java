package org.example.ArraysExersice;

public class Array {
    int[] myArray;
    int count;
    int size;
    public Array(int size) {
        this.size = size;
        this.myArray = new int[size];
    }


    public void insert(int value){
        if (count >= myArray.length){
            int[] temp = myArray;
            myArray = new int[count + 1];
            for (int i = 0; i < temp.length; i++) {
                myArray[i] = temp[i];
            }
        }
        myArray[count] = value;
        count++;
    }

    public void removeAt(int index){
        int[] temp = myArray;
        count--;
        myArray = new int[count];
        for (int i = 0; i < temp.length; i++) {
            if (i < index){
                myArray[i] = temp[i];
            } else if (i == index) {
                continue;
            }
            else {
                myArray[i] = temp[i-1];
            }
        }
    }

    public int indexOf(int value){
        for (int i = 0; i < count; i++) {
            if (myArray[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i < count; i++) {
            System.out.println(myArray[i]);
        }
    }
}

