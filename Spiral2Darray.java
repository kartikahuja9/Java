package com.kartik;
import java.util.*;
public class Spiral2Darray {
    public static void main(String[] args) {
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

        System.out.println("The spiral order 2D array is as follows: ");
        //output
        int row_start=0, col_start=0, row_end=m-1, col_end=n-1;

        while(row_start<=row_end && col_start<=col_end)
        {
            for(int col=col_start;col<=col_end;col++){ //printing (0,col)
                System.out.print(matrix[row_start][col]+" ");
            }
            row_start++;
            for(int row=row_start;row<=row_end;row++){ //printing (row,col_end)
                System.out.print(matrix[row][col_end]+" ");
            }
            col_end--;
            for(int col=col_end;col>=col_start;col--){ //printing (row_end,col) backwards
                System.out.print(matrix[row_end][col]+" ");
            }
            row_end--;
            for(int row=row_end;row>=row_start;row--){ //printing (row,col_start) upwards
                System.out.print(matrix[row][col_start]+" ");
            }
            col_start++;
            System.out.println("");
        }
    }
}
