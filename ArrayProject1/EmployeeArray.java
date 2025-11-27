package src.ArrayProject1;

import java.util.Arrays;

public class EmployeeArray {
    public static void main(String[] args) {
        Employ[] employees = new Employ[10];
        employees[0] = new Employ("Alice", 101, 25, 40000);
        employees[1] = new Employ("Bob", 102, 32, 50000);
        employees[2] = new Employ("Charlie", 103, 29, 55000);
        employees[3] = new Employ("David", 104, 28, 35000);
        employees[4] = new Employ("Eve", 105, 30, 60000);
        employees[5] = new Employ("Frank", 106, 26, 45000);
        employees[6] = new Employ("Grace", 107, 40, 70000);
        employees[7] = new Employ("Hank", 108, 24, 30000);
        employees[8] = new Employ("Ivy", 109, 35, 65000);
        employees[9] = new Employ("Jack", 110, 27, 48000);

        // a) Access all employees
        System.out.println("All Employees");
        for (Employ emp : employees){
            System.out.println(emp);
        }
        System.out.println("==============================================");

        // b) Print and count all employees with age < 30 years
        int countAge = 0;
        for (Employ emp:employees){
            if (emp.getAge()<30){
                System.out.println(emp);
                countAge++;
            }
        }
        System.out.println("Total employees with age < 30: "+countAge);
        System.out.println("==============================================");
        // c) Employee with highest and least salary
        Employ highest = employees[0];
        Employ lowest = employees[0];

        for (Employ emp : employees){
            if (emp.getSalary()>= highest.getSalary()){
                highest = emp;
            }
            if (emp.getSalary() < lowest.getSalary()) {
                lowest = emp;
            }
        }
        System.out.println("\nEmployee with Highest Salary:");
        System.out.println(highest);
        System.out.println("Employee with Lowest Salary:");
        System.out.println(lowest);

        System.out.println("==============================================");
        // d) Search employee by ID
        int searchId = 108;
        boolean foundById = false;
        for (Employ emp : employees) {
            if (emp.getId() == searchId) {
                System.out.println("\nEmployee found by ID " + searchId + ":");
                System.out.println(emp);;
                foundById = true;
                break;
            }
        }
        if (!foundById) {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }

        System.out.println("==============================================");
        // e) Search employee by Name
        String searchName = "Eve";
        boolean foundByName = false;
        for (Employ emp : employees) {
            if (emp.getName().equalsIgnoreCase(searchName)) {
                System.out.println("\nEmployee found by Name " + searchName + ":");
                System.out.println(emp);;
                foundByName = true;
                break;
            }
        }
        if (!foundByName) {
            System.out.println("\nEmployee with name " + searchName + " not found.");
        }

        System.out.println("==============================================");
        // f) Employees with salary > average salary
        double totalSalary = 0;
        for (Employ emp : employees) {
            totalSalary += emp.getSalary();
        }
        double avgSalary = totalSalary / employees.length;

        System.out.println("\nAverage Salary: " + avgSalary);
        System.out.println("Employees with salary > average salary:");
        int countAboveAvg = 0;
        for (Employ emp : employees) {
            if (emp.getSalary() > avgSalary) {
                System.out.println(emp);
                countAboveAvg++;
            }
        }
        System.out.println("Total employees with salary above average: " + countAboveAvg);
    }
}
