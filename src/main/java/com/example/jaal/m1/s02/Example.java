package com.example.jaal.m1.s02;

public class Example {
    public static void main(String[] args) {
        int[] array = { 1, -1, -3, 9, 7, 3, 10 };

        int index = indexOf(array, 8);
        System.out.println(index);
        System.out.println(contains(array, 9));
        System.out.println(min(array));
        System.out.println(max(array));
        System.out.println(value(array, 7));
        System.out.println(minIndex(array));
        
    }
    public static int indexOf(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return true;
            }
        }
        return false;
    }

    // ricerca del minimo.
    public static int min(int[] data) {
        int min = data[0]; // min è anche il metodo quindi nel caso meglio chiamarlo result.
        for (int i = 0; i < data.length; i++) { //faccio un for per guardare gli elementi dell'array e poi confrontare il valore i-esimo con quello della variabile d'appoggio.
                if (data[i] < min ) {
                    min = data[i];
            }
        }
        return min;
    }

    // ricerca del massimo
    public static int max(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
    
    
 // ricerca di un valore
    public static int value(int[] data,int value) {
      
        for (int i = 1; i < data.length; i++) {
            if (data[i] == value) {
                value = data[i];
            }
        }
        return value;
    }
    
    //ricerca dell'indice dell'array
    public static int minIndex(int[] data) {
        int minIndex = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
