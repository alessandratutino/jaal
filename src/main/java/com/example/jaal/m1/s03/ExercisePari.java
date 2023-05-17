package com.example.jaal.m1.s03;

public class ExercisePari {
    public static int contaPari(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,9,10,22,4,-2,-3, 26, 66};
        int count = contaPari(nums);
        System.out.println(count);
    }
}