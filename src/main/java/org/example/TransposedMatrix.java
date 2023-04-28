package org.example;

public class TransposedMatrix {
    private int n, m;
    private int [][] matrix;
    private int [][] aux = new int [10][10];


    TransposedMatrix(int n, int m, int[][] matrix){
        this.n = n;
        this.m = m;
        this.matrix = matrix;
    }

    int[][] calculateMatrix(int[][] matrix){
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++) {
                aux[j][i] = matrix[i][j];
            }

        return aux;
    }

    void print(){
        System.out.println("The transpose of the matrix is: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++)
                System.out.print(aux[i][j]);
            System.out.println();
        }
    }
}
