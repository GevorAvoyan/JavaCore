package chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();

        myBox.width = 4.5;
        myBox.depth = 3;
        myBox.height = 8.9;
        myBox.color = "red";
        System.out.println(myBox.height);
        System.out.println("color is " + myBox.color);
        System.out.println(myBox.width);
        System.out.println(myBox.depth);

    }
}
