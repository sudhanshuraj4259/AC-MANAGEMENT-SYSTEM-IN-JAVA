package Java;

import java.util.Scanner;

class Statement {
    static int x;

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter a number 1::");
        int x = s.nextInt();
        System.out.println("enter a number 2::");
        int y = s.nextInt();
        if (x == y) {
            int z = x + y;
            System.out.println("sum is ::" + z);

        } else {
            if (x > y) {
                int z = x - y;
                System.out.println("answer is::" + z);
            } else {
                int z = y - x;
                System.out.println("answer is::" + z);
            }

        }

    }
}