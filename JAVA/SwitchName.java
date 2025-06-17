public class SwitchName {
    public static void main(String[] args) {
        String name = "Shravani";

        switch (name) {
            case "Shravani":
                System.out.println("Hello, Shravani!");
                break;
            case "Ankit":
                System.out.println("Hey Ankit, welcome back!");
                break;
            case "Riya":
                System.out.println("Hi Riya, have a great day!");
                break;
            default:
                System.out.println("Hello, guest!");
        }
    }
}
