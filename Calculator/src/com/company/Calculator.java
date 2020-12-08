package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer:");


        num1 = scanner.nextDouble();
        System.out.print("Enter second integer:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;
        /* Here we're testing the different operators
         * +, -, * and /
         */
        switch(operator)
        {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;

           /* if there is anything other than the
            * expected operators then display an
            * error message to user
            */
            default:
                System.out.printf("You have entered an incorrect operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }
}
