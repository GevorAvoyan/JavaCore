package student;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input student Name");
        String name = scanner.nextLine();
        System.out.println("Please input student PhoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student CourseName");
        String couurseName = scanner.nextLine();


        Student student = new Student(name, phoneNumber, couurseName);
        System.out.println(student.name);
        System.out.println(student.phoneNumber);
        System.out.println(student.courseName);
        System.out.println("Student Registered!");
    }
}
