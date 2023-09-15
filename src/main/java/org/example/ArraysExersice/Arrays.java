package org.example.ArraysExersice;

public class Arrays {

    int[] array;
    int counter;
    public Arrays(int size) {
        this.array = new int[size];
    }

    public void insert(int item){
        if (counter >= array.length) {
            int[] tempoArray = array;
            this.array = new int[counter + 1];
            for (int i = 0; i < counter; i++) {
                array[i] = tempoArray[i];
            }
        }
        array[counter] = item;
        counter++;
    }

    public void removeAt(int index){
        if(index >= counter){
            throw new IllegalArgumentException();
        }else {
            int[] temp = array;
            this.array = new int[counter - 1];
            for (int i = 0; i < array.length; i++) {
                if (i >= index){
                    array[i] = temp[i+1];
                } else {
                    array[i] = temp[i];
                }
            }
        }
        counter--;
    }

    public int indexOf(int item){
        for (int i = 0; i < counter; i++) {
            if (array[i] == item){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        System.out.println("array: ");
        for (int i = 0; i < counter; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

}
