package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int choice;

        /*switch (choice){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
        }*/

        LettersMatrix matrix = new LettersMatrix();

        matrix.calculateMatrix();
        matrix.print();
    }
}
