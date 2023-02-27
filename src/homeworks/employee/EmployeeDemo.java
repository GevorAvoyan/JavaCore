package homeworks.employee;

import homeworks.employee.model.Employee;
import homeworks.employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        employeeStorage.add(new Employee("poxos","poxosyan","a001",100,"company 1 ","jr. manager"));
        employeeStorage.add(new Employee("petros","poxosyan","a002",200,"company 1 "," manager"));
        employeeStorage.add(new Employee("martiros","poxosyan","a003",300,"company 1 ","sr. manager"));
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompanyName(companyName);
                    break;
                case "5":
                    searchEmployeeBySalaryRange();
                    break;
                case "6":
                    changePositionByEmployeeId();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inactiveEmployee();
                    break;
                case "9":
                    activateEmployees();
                    break;
                default:
                    System.out.println("Wrong command.please try again!!!");
            }
        }
    }

    private static void activateEmployees() {
            employeeStorage.printByStatus(false);
            System.out.println("please choose employee id");
            String employeeid = scanner.nextLine();
            Employee employee = employeeStorage.getEmployeeById(employeeid);
            if (employee == null || employee.isActive()){
                System.out.println("Wrong employee Id or employee is active please try again!");
            }else {
                employee.setActive(true);
                System.out.println("Status changed!");
            }
        }


    private static void inactiveEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeid = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeid);
        if (employee == null || !employee.isActive()){
            System.out.println("Wrong employee Id or employee is inactive please try again!");
        }else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }
    }


    private static void changePositionByEmployeeId() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null){
            System.out.println("Wrong employee Id, please try again!");
        }else {
            System.out.println("please input new position name");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("position changed!");
        }
    }

    private static void searchEmployeeBySalaryRange() {
            System.out.println("please input minPrice,maxPrice");
          String salaryRangeStr = scanner.nextLine();
          String[] salaryRange = salaryRangeStr.split(",");
          Double minPrice = Double.parseDouble(salaryRange[0]) ;
          Double maxPrice = Double.parseDouble(salaryRange[1]) ;
          if (maxPrice < minPrice){
              System.out.println("minPrice should be less then maxPrice");
              return;
          }
          employeeStorage.searchBySalaryRange(minPrice,maxPrice);
    }

    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print employees");
        System.out.println("Please input 3 for search employee by id");
        System.out.println("Please input 4 for search employee by company name");
        System.out.println("Please input 5 for search employee by salary range");
        System.out.println("Please input 6 for change position");
        System.out.println("Please input 7 for print only active employees");
        System.out.println("Please input 8 for inactive employee by id");
        System.out.println("Please input 9 for active employee by id");
    }

    private static void getEmployeeById() {
        System.out.println("Please input employee id");
        String employeeid = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeid);
        if (employee == null) {
            System.out.println("employee width " + employeeid + " id does not exist");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() {
        System.out.println("Please input name,surname, employeeid,salary,companyName,position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employeeById = employeeStorage.getEmployeeById(employeeId);
        if (employeeById == null) {
            Employee employee = new Employee(employeeData[0], employeeData[1], employeeData[2],
                    Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5]);
            employeeStorage.add(employee);
            System.out.println("Employee was added!");
        } else {
            System.out.println("Employee with" + employeeId + " id already exists");
        }

    }
}
