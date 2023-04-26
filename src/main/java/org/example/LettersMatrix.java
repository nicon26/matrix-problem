package org.example;

public class LettersMatrix {
    private char [][] matrix = new char [27][27];

    char[][] calculateMatrix(){ // method that calculates the matrix

        int i ,j;

        for(i = 1; i <= 26; i++){ // puts 'z' letter on the secondary diagonal
            for(j = 1; j <= 26; j++)
                if(i + j == 27){
                    matrix[i][j] = 'z';
                }
        }

       for(i = 1; i <= 26; i++) { // calculates the elements above the secondary diagonal
            int k = 1;
            for (j = 25; j >= 1; j--) {
                if (i + j < 27) {
                    matrix[i][j] = (char) ('z' - k);
                    k++;
                }
            }
        }

        for(i = 26; i > 1; i--){ // calculates the elements that are under the secondary diagonal
            int k = 97; // ascii cod for the first letter in the alphabet
            for(j = 2; j <= 26; j++){
                if(i + j > 27){
                    matrix[i][j] = (char) k;
                    k ++;
                }
            }
        }

        return matrix;
    }

    void print(){
        System.out.println("The matrix is: ");
        for(int i = 1; i <= 26; i++){
            for(int j = 1; j <= 26; j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
    }
}
