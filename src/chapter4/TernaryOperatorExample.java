package chapter4;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
        //Ternary Operator-karch if-else
        int x = 70;
        int y = 50;
        int z = x > y ? x : y;
        System.out.println(z);

    }

}
