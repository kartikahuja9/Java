package com.kartik;
import java.util.*;
public class Array {
    /*
    //method 1
    public static void main(String args[]){
        int marks[] = new int[3];
        //without loop
            marks[0] = 98;//phy
            marks[1] = 95;//chem
            marks[2] = 97;//maths
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        //with loop
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
     */
    /*
    //method 2
    public static void main(String args[]) {
        int marks[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }
    }
     */
    /*
    public static void main(String args[]) {
        int marks[] = new int[3];
        Scanner s = new Scanner(System.in);
        String a = "";
        System.out.print("Enter 3 numbers: ");
        for (int i = 0; i < 3; i++) {
            marks[i] = s.nextInt();
            a += marks[i] + " ";
        }
        System.out.println(a);
    }
     */
    //to search the index of an element in an array(linear search)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = s.nextInt(); //input size of the array

        int marks[] = new int[size]; //initializing array

        System.out.print("Enter marks: "); //filling the array
        for(int i=0;i<size;i++){
            marks[i] = s.nextInt();
        }

        System.out.print("Enter element to be searched: ");
        int x = s.nextInt();
        for(int i=0;i<marks.length;i++){
            if(marks[i]==x){
                System.out.print("The index of x is: "+ i);
            }
        }
    }
}
