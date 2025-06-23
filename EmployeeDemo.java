// Employee class
class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int empId, String empName, double empSalary) {
        id = empId;
        name = empName;
        salary = empSalary;
    }

    // Method to display employee info
    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
        System.out.println("-------------------------");
    }
}

// Main class to test
public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating multiple employee objects
        Employee e1 = new Employee(101, "Shravani", 30000);
        Employee e2 = new Employee(102, "Amit", 35000);
        Employee e3 = new Employee(103, "Neha", 28000);

        // Displaying employee information
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
