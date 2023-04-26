package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter order of matrix: ");
        int n = in.nextInt();

        int [][] matrix = new int [10][10]; // declaration of the matrix
        int i ,j;

        for(i = 1; i <= n; i++){ // puts n on the secondary diagonal
            for(j = 1; j <= n; j++)
                if(i + j == n + 1){
                    matrix[i][j] = n;
                }
        }

        for(i = 1; i <= n; i++) { // calculates the elements above the secondary diagonal
            int k = 1;
            for (j = n - 1; j >= 1; j--) {
                if (i + j < n + 1) {
                    matrix[i][j] = n - k;
                    k++;
                }
            }
        }


        for(i = n; i > 1; i--){ // calculates the elements that are under the secondary diagonal
            int k = 1;
            for(j = 2; j <= n; j++){
                if(i + j > n + 1){
                    matrix[i][j] = k;
                    k ++;
                }
            }
        }

        System.out.println("The matrix is: ");
        for(i = 1; i <= n; i++){
            for(j = 1; j <= n; j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
    }
}
