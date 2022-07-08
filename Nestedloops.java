package com.kartik;

public class Nestedloops {
    public static void main(String args[]){
//Rectangle
        /*
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
         */
//Hollow rectangle
              /*int n=4;
                int m=5;
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=m;j++){
                        if(j==1||i==1||j==m||i==n){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                */
//Half pyramid
/*
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

 */
//Inverted half pyramid

        int n=4;
        for(int i=1;i<=n;i++){ // Number of rows
            for(int j=0;j<n-i;j++){ // Number of spaces in each row
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){ // Number of stars in each rows
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
