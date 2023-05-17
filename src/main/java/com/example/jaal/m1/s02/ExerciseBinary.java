package com.example.jaal.m1.s02;

public class ExerciseBinary {
    public static int binarySearch(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static int binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, right, target);
        } else {
            return binarySearch(nums, left, mid - 1, target);
        }

    }

    public static void main(String[] args) {
        int[] array = { -7,1, 2, 3, 4, 6, 9, 10, 12 };
        int pos = binarySearch(array, 6);
        System.out.println(pos);

    }
}
