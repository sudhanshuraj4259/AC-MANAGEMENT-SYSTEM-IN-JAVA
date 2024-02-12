
class Variables {
    int x; // Instance Variable
    static int y; // Class Variable

    public static void main(String args[]) {
        int z; // Local Variable
        z = 10;
        Variables ob1 = new Variables();
        Variables ob2 = new Variables();
        ob1.x = 5;
        ob1.y = 7;
        ob2.y = 15;

        System.out.println(ob2.x);
        System.out.println(ob1.y);
        System.out.println(ob2.y);
        System.out.println(z);
        System.out.println(Variables.y);
    }
}
