import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Bruh Bruh Bruh");

        int bestNumberWeGotYet = 10;

        System.out.println("Cool number " + bestNumberWeGotYet + " Bruh program");

        boolean toggle = false;

        toggle = !toggle;

        if (!toggle) {
            System.out.println("This is now off...");
        } else {
            System.out.println("Now on! Yay!");
        }

        newHello();
    }

    public static void newHello() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age to continue to access bruh mode!: ");
        int age = scanner.nextInt();

        if (age >= 13) {
            System.out.println("You are now old enough to access bruh mode");
        } else {
            System.out.println("Sorry, you aren't old enough to access bruh mode, come back later!");
        }
    }

}
