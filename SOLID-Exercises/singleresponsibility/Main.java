package singleresponsibility;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 5000.0);


        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.calculateSalary(employee);


        DataBaseManager databaseManager = new DataBaseManager();
        databaseManager.saveToDatabase(employee);
    }

}