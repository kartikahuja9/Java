package com.kartik;
import java.util.*;
public class arrayHW {
    public static void main(String args[]){
        /*
        //Take an array of names as input from the user and print them on the screen.
        String names[] = new String[4];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 4 names");
        for(int i=0;i<names.length;i++){
            names[i] = s.next();
        }
        for(int i=0;i<names.length;i++){
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }
         */
        /*
        //Find the maximum & minimum number in an array of integers.
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = s.nextInt();

        int numbers[] = new int[size];
        System.out.print("Enter numbers: ");
        for(int i=0;i<size;i++){
            numbers[i] = s.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            if(numbers[i]<min) {
                min=(numbers[i]);
            }
            if(numbers[i]>max){
                max=(numbers[i]);
            }
        }
        System.out.println("Max = "+ max);
        System.out.println("Min = "+ min);
         */

        //3.Take an array of numbers as input and check if it is an array sorted in ascending order.
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = s.nextInt();

        int numbers[] = new int[size];
        System.out.print("Enter numbers: ");
        for(int i=0;i<size;i++){
            numbers[i] = s.nextInt();
        }
        boolean isAscending = true;
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]) {
                isAscending = false;
            }
        }
        if(isAscending) {
            System.out.println("The array is sorted in ascending order.");
        }
        else {
            System.out.println("The array is not sorted in ascending order");
        }
    }

}
