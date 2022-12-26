package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i] + " կենտ է։");
            } else {
                System.out.println(array[i] + " զույգ է։");
            }
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum + " էլեմենտների գումարը։");

        System.out.println(array.length + " էլեմենտների քանակը։");

        int a = sum / array.length;
        System.out.println(a + " Միջին թվաբանականը");

        System.out.println();

        System.out.println(array[0] + " Առաջին էլեմենտ։");
        int lastElement = array.length - 1;
        System.out.println(array[5] + " Մեջտեղի էլեմենտ։");
        System.out.println(array[lastElement] + " վերջին էլեմենտ։");


    }
}