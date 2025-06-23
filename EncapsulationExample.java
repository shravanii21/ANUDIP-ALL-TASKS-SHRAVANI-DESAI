// Encapsulation example with my name

public class EncapsulationExample {
    // Private data member
    private String name;

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }

    // Main method
    public static void main(String[] args) {
        EncapsulationExample info = new EncapsulationExample();
        info.setName("Shravani");

        System.out.println("My Name is: " + info.getName());
    }
}
