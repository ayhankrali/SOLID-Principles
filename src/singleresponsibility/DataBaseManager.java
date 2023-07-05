package singleresponsibility;

public class DataBaseManager {
    public void saveToDatabase(Employee employee) {
        System.out.println("Employee " + employee.getName() + " saved to the database");
    }
}
