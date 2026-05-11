package lesson_20_maven;

public class Main {

    static void main() {

        Employee employee = new Employee("Vasyl", 50000, 1);

        Employee employee2 = new Employee();

        employee2.setSalary(60000);
        employee2.getBonus();

        System.out.println(employee.isJunior());
        System.out.println(employee.getBonus());
        System.out.println(employee2.getSalary() + employee2.getBonus());
    }
}
