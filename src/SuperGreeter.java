import java.util.Scanner;

public class SuperGreeter {
    public void start() {
        System.out.println("Det virker");
    }

    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();

        System.out.print("Hvad er dit navn? ");
        Scanner keyboard = new Scanner(System.in);
        String navn = keyboard.next();
        System.out.println("Hej " + navn);

        System.out.print("Hvad er din alder så? ");
        int askAboutage = keyboard.nextInt();
        System.out.println("Hej igen " + navn + " som er " + askAboutage);
    }



}
