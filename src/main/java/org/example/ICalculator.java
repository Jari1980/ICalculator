package org.example;

import java.util.Scanner;

public interface ICalculator {

    Scanner scan = new Scanner(System.in);

    double addition(double num1, double num2);
    double subtraction(double num1, double num2);
    double multiplication(double num1, double num2);
    double division(double num1, double num2);

    static String takeInput(){
        String inp = scan.nextLine();
        return inp;
    }

    default double calculate(){
        double num;
        System.out.println("Choose operation: (add/minus/mult/div)");
        String operand = takeInput();
        System.out.println("First number: ");
        double num1 = Double.parseDouble(takeInput());
        System.out.println("Second number: ");
        double num2 = Double.parseDouble(takeInput());
        switch(operand){
            case "add":
                num = addition(num1, num2);
                break;
            case "minus":
                num = subtraction(num1, num2);
                break;
            case "mult":
                num = multiplication(num1, num2);
                break;
            case "div":
                if(num2 == 0) throw new RuntimeException("Cant divide with 0");
                num = division(num1, num2);
                break;
            default:
                throw new RuntimeException("There is no such operand");
        }
        return num;
    }

}
