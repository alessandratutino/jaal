package com.example.jaal.m1.s02;

public class EsercizioSomma {
    public static int somma(int[] nums){
    int result = 0;
    for (int i = 0; i < nums.length; i++) { // PER SOMMA SOLO ELEMENTI PARI USO i+=2
        result = result + nums[i]; //leggo valore corrente e lo aggiungo a result
    }
    return result;
}

    public static void main(String[] args) {
        int[] numeri = {1,3,4};
        int result = EsercizioSomma.somma(numeri);
        System.out.println(result);
    }
}
