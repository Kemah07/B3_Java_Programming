package day09_a_scanner;

import java.util.Scanner;

/*
    create a Scanner object
    ask the user to enter 2 numbers
    check if the numbers are equal to each other
 */
public class CompareNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: " ) ;
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        boolean areNumsEqual =  num1 == num2;
        System.out.println("Are numbers equal? " + areNumsEqual);
    }
}
