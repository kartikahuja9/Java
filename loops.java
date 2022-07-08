package com.kartik;
import java.util.*;
public class loops {
//for loop 1
/*
    public static void main (String args[])
    {
        for (int count = 0; count < 20; count = count + 1)
            System.out.println ("Hello world");
    }

*/
//for loop 2
/*
public static void main (String args[])
{

    for (int count = 0; count <=10; count++)

        System.out.println (count);

}
*/

//while loop
    /*
public static void main (String args[]){
    int i = 0;
    while (i < 11){
        System.out.println (i);
        i++;
        }
    }
    */
//do while
    /*
    public static void main (String args[]){
        int i = 0;
        do{
            System.out.println (i);
            i++;
        }
        while (i < 11);
    }
    */
//sum of n numbers using while
    /*
public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int i = 1;
    while (i <= n){
        sum = sum + i;
        i++;
    }
    System.out.println (sum);
}
*/

// table of n
public static void main (String args[])
{
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int i = 1;
    while (i <= 10)
    {
        System.out.println (n * i);
        i++;
    }
}
}
