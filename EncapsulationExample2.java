// Encapsulation example with updated file and class name

public class EncapsulationExample2 {
    // Private data members
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Main method
    public static void main(String[] args) {
        EncapsulationExample2 student = new EncapsulationExample2();
        student.setName("Shravani");
        student.setAge(18);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}
