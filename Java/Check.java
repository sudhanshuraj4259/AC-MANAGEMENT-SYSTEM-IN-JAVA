package Java;

import java.util.Scanner;

class Check {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int x = s.nextInt();
        if (x % 2 == 0)
            System.out.println(x + " is even");
        else
            System.out.println(x + " is odd");
        System.out.println("Enter your name");
        String name = s.next();
        System.out.println("Name is:-" + name);
        System.out.println("Enter your Gender");
        char g = s.next().charAt(0);
        System.out.println("Your Gender is:-" + g);

    }
}