package org.example;

public class TransposedMatrix {
    private int n, m;
    private int [][] matrix = new int [10][10];

    TransposedMatrix(int n, int m, int matrix[][]){
        this.n = n;
        this.m = m;
        this.matrix = matrix;
    }

    int[][] calculateMatrix(int matrix[][]){

        return matrix;
    }

    void print(){
        System.out.println("The transpose of the matrix is: ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
    }
}
