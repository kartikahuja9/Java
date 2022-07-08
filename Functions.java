package com.kartik;
import java.sql.SQLOutput;
import java.util.*;

public class Functions {
/*
    //public static int calculateSum(int a, int b){
    //    int sum = a+b;
    //    return sum;

    public static int calculateProduct(int a, int b) {
        return a * b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //int sum = calculateSum(a,b);
        //System.out.println("Sum of a and b is : "+ sum);

        System.out.println("Product of a and b is : "+ calculateProduct(a,b));
    }

 */
 /*
   //Sum of 2 numbers
    public static int printSum(int a, int b){
        return a+b;
    }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println("Sum of the numbers is: "+ printSum(a,b));
        }
  */
    //factorial using function
    public static void factorial(int a){
        if(a<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for(int i=1;i<=a;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            factorial(a);
        }
}
