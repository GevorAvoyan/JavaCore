package homeworks.employee;

public class EmployeeStorage {
    public static Object company;
    private static String[] array = new String[10];
    private static int size = 0;

    public static void searchById(String keyword1) {
        for (int i = 0; i < size; i++) {
            String Stri = array[i];
            System.out.println("Your id" + keyword1);
        }

    }

    public static void searchByCompany(String keyword) {


        for (int i = 0; i < size; i++) {
            String string = array[i];

            System.out.println(keyword);
        }

    }


    public void add(String value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        String[] newArray = new String[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }
}