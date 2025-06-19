// First interface
interface Writer {
    void write();
}

// Second interface
interface Reader {
    void read();
}

// Class implementing both interfaces
class Shravani implements Writer, Reader {
    public void write() {
        System.out.println("Shravani is writing Java code.");
    }

    public void read() {
        System.out.println("Shravani is reading Java notes.");
    }
}

// Main class
public class MultipleInheritance {
    public static void main(String[] args) {
        Shravani s = new Shravani();
        s.write();
        s.read();
    }
}
