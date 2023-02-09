package homeworks.employee;

public class Employee {
    private String name;
    private String surname;
    private String emplyeeId;
    private double salary;
    private String company;
    private String position;

    public Employee() {

    }

    public Employee(String name, String surname, String emplyeeId,
                    double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.emplyeeId = emplyeeId;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmplyeeId() {
        return emplyeeId;
    }

    public void setEmplyeeId(String emplyeeId) {
        this.emplyeeId = emplyeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public String toString() {
        return "{(Employee" + " " + "name-" + name + ")" + "  " + "(surname-" + surname + ")" + " " + "(emplyeeID-" +
                emplyeeId + ")" + " " + "(salary-" + salary + ")" + " " + "(company-" + company + ")" + " " + "(position-" + position + ")}";

    }

}

