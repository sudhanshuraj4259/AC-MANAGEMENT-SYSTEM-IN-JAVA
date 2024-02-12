package Java;

class Operators {
    public static void main(String args[]) {
        byte b = 10, c = 20, d;
        d = (byte) (b + c);
        System.out.println(d);
        byte k = (byte) 468;
        System.out.println(k);
        short s = 7, t = 11, u;
        u = (short) (s + t);
        System.out.println(u);
        System.out.println(-34 >>> 3);
        int x = 10, y = 5;
        while (x-- > 7 || ++y < 8)
            ;
        System.out.println(x);
        System.out.println(y);
    }

}
