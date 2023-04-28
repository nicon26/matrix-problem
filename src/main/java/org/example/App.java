package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int choice;

        boolean ok = true;
        while(ok) { ///// get input from the user
            System.out.println("Select your action: ");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();

            switch (choice) {
                case 1: // simple matrix
                    System.out.println("You chose a simple matrix.");
                    int rows1, columns1;
                    rows1 = in.nextInt();
                    columns1 = in.nextInt();
                    Matrix matrix = new Matrix(rows1, columns1);
                    matrix.calculateMatrix();
                    matrix.print();
                    break;
                case 2: // square matrix
                    System.out.println("You chose a square matrix.");
                    int rows2;
                    rows2 = in.nextInt();
                    SquareMatrix squareMatrix = new SquareMatrix(rows2);
                    squareMatrix.calculateMatrix();
                    squareMatrix.print();
                    break;
                case 3: // letter matrix
                    System.out.println("You chose a letter matrix.");
                    LettersMatrix lettersMatrix = new LettersMatrix();
                    lettersMatrix.calculateMatrix();
                    lettersMatrix.print();
                    break;
                case 4: // transpose of a matrix
                    System.out.println("You chose to transpose a matrix.");

                    int rows4, columns4;
                    int [][] matrix1 = new int [10][10];
                    rows4 = in.nextInt();
                    columns4 = in.nextInt();

                    System.out.println("Enter your matrix!");
                    int i,j;
                    for(i = 0; i < rows4; i++)
                        for(j = 0; j < columns4; j++) {
                            matrix1[i][j] = in.nextInt();
                        }
                    TransposedMatrix transposedMatrix = new TransposedMatrix(rows4, columns4, matrix1);
                    transposedMatrix.calculateMatrix(matrix1);
                    transposedMatrix.print();
                    break;
                case 5: // exit menu
                    ok = false;
                    break;
                default:
                    System.out.println("Wrong input!!!");
                    break;
            }
        }
    }
}
