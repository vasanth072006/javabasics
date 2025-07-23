import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        try (Scanner value = new Scanner(System.in)) {   // auto‑closes
            String a = value.nextLine();

            if (a.equalsIgnoreCase("true")) {
                System.out.println("hi how are you");
            } else {
                System.out.println("go away!");
            }
        }
    }
}
