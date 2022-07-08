package com.kartik;
import java.util.*;
public class exercise
{
    /*
    //1.Enter 3 numbers from the user & make a function to print their average.
    public static int average(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(average(a,b,c));
    }
     */
    /*
    //2.Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i+=2){
            sum=sum+i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print("Sum of all odd numbers till n = ");
        System.out.println(sumOdd(n));
    }
     */
/*
    //3.Write a function which takes in 2 numbers and returns the greater of those two.
    public static void largestofTwo(int a, int b){
        if(a==b){
            System.out.println("Both are equal");
        }
        else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = s.nextInt();
        System.out.print("Enter b: ");
        int b = s.nextInt();
        largestofTwo(a, b);
    }
 */
    /*
    //4.Write a function that takes in the radius as input and returns the circumference of a circle.
    public static int circleCircumference(int r){
        int C;
        C = (2*22*r)/7;
        return C;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = s.nextInt();
        System.out.print("Circumference is "+ circleCircumference(r));
    }
     */
    /*
    //5.Write a function that takes in age as input and returns if that person is eligible
    // to vote or not. A person of age > 18 is eligible to vote.
    public static void votingAge(int x){
        if(17<x && x<120){
            System.out.println("Eligible to vote");
        }
        else if(0<x && x<18){
            System.out.println("Not eligible to vote");
        }
        else{
            System.out.println("Invalid age");
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter age: ");
        int x = s.nextInt();
        votingAge(x);
    }
     */
    /*
    //6.Write an infinite loop using do while condition.
    public static void main(String args[]) {
        int x = 100;
        do {
            System.out.print("This is an infinite loop" );
            x++;
        }while( x > 10 );
    }
     */
    /*
    //7.Write a program to enter the numbers till the user wants
    // and at the end it should display the count of positive, negative and zeros entered.
    public static void numbers(int a, int b){
        int countpos=0;
        int countzero=0;
        int countneg=0;
        for(int i=a;i<=b;i++){
            System.out.println(i);
            if(i>0){
                countpos++;
            }
            else if(i<0){
                countneg++;
            }
            else{
                countzero++;
            }
        }
        System.out.println("Positives: "+ countpos);
        System.out.println("Negatives: "+ countneg);
        System.out.println("Zeros: "+ countzero);
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter initial number: ");
        int a = s.nextInt();
        System.out.print("Enter final number: ");
        int b = s.nextInt();
        numbers(a,b);
    }
     */
    /*
    //8.Two numbers are entered by the user, x and n.
    // Write a function to find the value of one number raised to the power of another i.e.
    public static int xpowern(int x, int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*x;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = s.nextInt();
        System.out.print("Enter power: ");
        int n = s.nextInt();
        System.out.println(xpowern(x,n));
    }
     */
/*
    //10.Write a program to print Fibonacci series of n terms where n is input by user.
    //In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
    public static void fibonacci(int n){
        int a=0, b=1,c;
        if(n==0){
            System.out.print(a);
        }
        if(n==1)
            System.out.print(b);
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(b);
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();

        fibonacci(n);
    }
 */
    //9.Write a function that calculates the Greatest Common Divisor of 2 numbers.

}


