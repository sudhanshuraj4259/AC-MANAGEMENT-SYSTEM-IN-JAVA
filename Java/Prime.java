package Java;

import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        int x, i, count = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        x = s.nextInt();
        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                count++;
                break;
            }
        }

        if (count == 0)
            System.out.println("It is a Prime Number.");
        else
            System.out.println("It is not a Prime Number.");
    }

}
