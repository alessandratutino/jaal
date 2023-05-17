package com.example.jaal.m1.s02;

public class ExercisePositive {
    public static int sumPositive(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result += nums[i];
            }
        }
        return result;
    }
    
    // variazione, saltare il negativo e il valore successivo
    public static int sumAlternative(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
               result += nums[i];
            } else {// if (nums[i] < 0)
            i++;
        }
    }
        return result;
    }
    
    

    public static void main(String[] args) {
        int[] array = { -7,1, -1,5, 6, 8};
        int sum = ExercisePositive.sumPositive(array);
        int somma = ExercisePositive.sumAlternative(array);
        System.out.println(sum);
        System.out.println(somma);
    }
}
