package courseWork_1;

public class Employee {
    private final String firstName;
    private final String secondName;
    private final String surName;
    private String department;
    private double salary;
    public static int count;
    private final int id;

    public Employee() {
        firstName = "имя";
        secondName = "фамилия";
        surName = "отчество";
        department = "отдел";
        salary = 0;
        id = 0;
    }

    public Employee(String firstName, String secondName, String surName, String department, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
        count++;
        id = count-1;
    }


    public  String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getSurName() {
        return surName;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment (String department) {
        this.department = department;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }
    public String toString() {
        return id + " ФИО: " + firstName + " " + secondName + " " + surName + " Отдел: " + department + " Зарплата: " + salary;
    }
    public static double sumSalary (Employee[] employees) {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee minSalary(Employee[] employees) {
        double min = 0;
        int index = 0;
        for (Employee employee : employees) {
            if (employee.salary < min) {
                min = employee.getSalary();
                index = employee.getId();
            }
        }
        return employees[index];
    }
    public static Employee maxSalary(Employee[] employees) {
        double max = 0;
        int index = 0;
        for (Employee employee : employees) {
            if (employee.salary > max) {
                max = employee.salary;
                index = employee.id;
            }
        }
        return employees[index];
    }
    public static double averageSalary(Employee[] employees) {
        int average = 0;
        double sum = sumSalary(employees);
        double count = employees.length;
        if (count == 0) return 0;
        average = (int) (sum/count);
        return average;
    }
}

