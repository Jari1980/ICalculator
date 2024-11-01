package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Casio calc = new Casio();
        while(true){
            double num = calc.calculate();
            System.out.format("The result is: %.2f", num);
            System.out.println();
            System.out.println("-------------");
            System.out.println("Do you want to calculate again (y/n)?:");
            String ans = scan.nextLine();
            if(ans.equals("n")) break;
        }
    }
}