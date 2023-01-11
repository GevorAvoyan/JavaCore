package chapter5;

import java.sql.SQLOutput;

public class SampleSwitch {
    public static void main(String[] args) {
        int a = 5;
        switch (a) {
            case 1:
                System.out.println("a=1");
                break;
            case 2:
                System.out.println("a=2");
                break;
            case 5:
                System.out.println("a=5");
                break;
            case 4:
                System.out.println("a=4");
            default:
                System.out.println("a !=1,2,3");
        }
        System.out.println();


        int month = 1;
        String season;
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Зима");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("весна");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("лето");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("осень");
                break;
            default:
                System.out.println("-");
        }
    }
}
