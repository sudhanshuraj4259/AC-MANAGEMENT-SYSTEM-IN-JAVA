package Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        String operator;
        System.out.print("");
        num1 = input.nextInt();
        System.out.print("");
        num2 = input.nextInt();
        System.out.print("");
        operator = input.next();
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid arithmetic operators");
                return;
        }
        System.out.println(" " + result);
    }
}