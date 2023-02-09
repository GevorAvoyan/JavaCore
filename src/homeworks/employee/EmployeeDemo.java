package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee by company name");
            System.out.println("Please input 4 for search employee by ID");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;

                case "1":
                    System.out.println("Please employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee id ");
                    String id = scanner.nextLine();
                    System.out.println("Please input employee company name");
                    String companyname = scanner.nextLine();
                    System.out.println("Please input your position");
                    String position = scanner.nextLine();
                    System.out.println("Please input your salary");
                    String salary = scanner.nextLine();
                    //  String scan = scanner.nextLine();
                    Employee employee = new Employee(name, surname, id, Double.parseDouble(salary), companyname, position);
                    employeeStorage.add(String.valueOf(employee));
                    System.out.println("Employee Joined");
                    System.out.println();
                    break;


                case "2":
                    employeeStorage.print();
                    break;

                case "3":
                    // search employee by company name
                    System.out.println("please input company name");
                    String keyword = scanner.nextLine();
                    EmployeeStorage.searchByCompany(keyword);


                    break;
                // default:
                // System.out.println("Wrong command");

                case "4":
                    System.out.println("Please input id");
                    String keword1 = scanner.nextLine();
                    EmployeeStorage.searchById(keword1);
                    //for search employee by ID
                    break;
            }
        }
    }
}
