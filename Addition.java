public class Addition {
    int num1;
    int num2;

    // Parameterized Constructor
    Addition(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // Method to perform addition
    void add() {
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        // Creating object and passing values 30 and 40
        Addition obj = new Addition(30, 40);
        obj.add();  // Output: Sum: 70
    }
}
