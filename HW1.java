package com.kartik;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW1 {
    public static void main(String args[]){
        //area of a circle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius:");
        float rad = sc.nextFloat();
        float area = (22*rad*rad)/7;
        System.out.println(area);
    }
}
