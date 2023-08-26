package courseWork_1;

import courseWork_1.Employee;

public class Main {
    public static void writeAllEmployees(Employee[] employees) {
        for (int i = 0; i < 10; i++) {
            System.out.println(employees[i].toString());
        }
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Виноградов", "Влас", "Эльдарович", "маркетинг", 5000);
        employees[1] = new Employee("Романов", "Аввакум", "Лукьянович", "кадры", 30000);
        employees[2] = new Employee("Соколов", "Климент", "Парфеньевич", "маркетинг", 40000);
        employees[3] = new Employee("Ершов", "Виссарион", "Оскарович", "финансы", 25000);
        employees[4] = new Employee("Козлов", "Савелий", "Рубенович", "кадры", 28000);
        employees[5] = new Employee("Мельникова", "Марфа", "Аркадьевна", "контроль качества", 50000);
        employees[6] = new Employee("Белова", "Алия", "Мэлоровна", "продажи", 36000);
        employees[7] = new Employee("Фокина", "Диодора", "Витальевна", "финансы", 28060);
        employees[8] = new Employee("Анисимова", "Валерия", "Наумовна", "контроль качества", 48500);
        employees[9] = new Employee("Петрова", "Кристина", "Георгиевна", "маркетинг", 52900);

        writeAllEmployees(employees);
        System.out.println("\nСумма затрат на зарплаты в месяц: " + Employee.sumSalary(employees));
        System.out.println("Сотрудник с минимальной зарплатой: " + Employee.minSalary(employees).toString());
        System.out.println("Сотрудник с максимальной зарплатой: " + Employee.maxSalary(employees).toString());
        System.out.println("Средняя зарплата всех сотрудников за месяц: " + Employee.averageSalary(employees));
    }
}