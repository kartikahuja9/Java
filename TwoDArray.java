package com.kartik;
import java.util.*;
public class TwoDArray
{
    public static void main(String[] args) {
        /*
        //printing a 2D array
        Scanner s = new Scanner(System.in);

        System.out.println("Enter rows and columns");
        int rows = s.nextInt();
        int cols = s.nextInt();

        int[][] matrix = new int[rows][cols];
        //input
        //rows
        System.out.println("Enter elements");
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                matrix[i][j] = s.nextInt();
            }
        }
        //output
        System.out.println("Array is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }
         */
        /***************
        //Searching for a number x in a 2D array and printing its indices
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int rows = s.nextInt();
        int cols = s.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elememts");
        //input elements
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("The 2D array is as follows: ");
        //output array
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }

        System.out.print("Enter number to find in the 2D array: ");
        int x = s.nextInt(); //element to be found

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==x){ //Searching for element
                    System.out.println("Indices of x are: "+ i+","+j); //printing indices
                }
            }
        }
         */

        //For a given matrix of N x M, print its transpose.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] matrix = new int[m][n];

        System.out.println("Enter elements");
        //input elements
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("Array is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }

        System.out.println("Transpose of array: ");
        //output
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
