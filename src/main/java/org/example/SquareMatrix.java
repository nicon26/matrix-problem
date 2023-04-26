package org.example;

public class SquareMatrix {
    private int n;
    private int [][] matrix = new int [10][10];

    SquareMatrix(int n){ // constructor
        this.n = n;
    }

    int[][] calculateMatrix(){ // method that calculates the matrix

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
            int k1 = 1;
            for(j = 2; j <= n; j++){
                if(i + j > n + 1){
                    if(i + j > 10){
                        matrix[i][j] = k1;
                        k1++;
                    }
                    else{
                        matrix[i][j] = n + k;
                        k++;}
                }
            }
        }
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

