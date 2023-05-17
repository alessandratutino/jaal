package com.example.jaal.m1.s02;

public class contaStringhe {
    public static int countEquals(String[] name, String target){
        int count = 0;
        for (int i=0; i< name.length; i++) {
            if(name[i].equals(target)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] array = {"dog","tommy", "bob", "tommy", "bob", "jenny"};
           String target = "dog";
           int count = countEquals(array, target);
           System.out.println(count);
        }       
    }

// with for-each

