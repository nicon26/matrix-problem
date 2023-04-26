package org.example;

public class Matrix {

    private int n, m;
    private int [][] matrix = new int [10][10];

    Matrix(int n, int m){ // constructor
        this.n = n;
        this.m = m;
    }

    int[][] calculateMatrix() { // method that calculates the matrix

        int i , j;

        return matrix;
    }

    void print(){
        System.out.println("The matrix is: ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
    }
}
