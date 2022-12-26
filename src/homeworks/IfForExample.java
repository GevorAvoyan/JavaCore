package homeworks;

//homework 1
public class IfForExample {
    public static void main(String[] args) {
        int a = 90;
        int b = 70;
        if (a < b) {
            System.out.println("max:" + b);
        } else {
            System.out.println("max:" + a);
        }

        //homework 2
        int y = 11;
        for (int x = 5; x < y; x++) {
            System.out.print(x + ",");
        }

        //homework 4
        int m = 10;
        int n = 5;
        if (m == n) {
            System.out.print("m-ն հավասար է n-ին");
        } else {
            System.out.println("\nհավասար չէ");
        }
    }

}
