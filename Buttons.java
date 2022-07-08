package com.kartik;
import java.util.*;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter button:");
        int button = sc.nextInt();
//3 buttons using if else if
/*
        if(button==1){
            System.out.println("Hello");
        }
        else if (button == 2){
            System.out.println("Namaste");
        }
        else if (button==3) {
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid");
        }
*/

//using switch
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid");
        }
    }
}
