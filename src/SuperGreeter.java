import java.util.Scanner;

public class SuperGreeter {
    public void start() {
        System.out.println("Det virker");
    }

    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();

        System.out.println("Hvad er dit navn?");
        Scanner keyboard = new Scanner(System.in);
        String navn = keyboard.next();

    }



}
