package chapter5;

public class If_Else_If {
    public static void main(String[] args) {
        int month = 10;
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "Зиме";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "Весне";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "Лету";
        } else if (month == 9 || month == 10 || month == 11) {
            season="Осени";

        }else{
            season ="Вымышленным месяцам";
        }
        System.out.println(season);
    }
}
