// Calculator class with basic operations
class Calculator {
    // Method to add two numbers
    void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    // Method to subtract two numbers
    void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    // Method to multiply two numbers
    void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    // Method to divide two numbers
    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

// Main class to test calculator
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int x = 20, y = 5;

        calc.add(x, y);
        calc.subtract(x, y);
        calc.multiply(x, y);
        calc.divide(x, y);
    }
}
