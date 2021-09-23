import java.util.Random;
import java.util.Scanner;

public class rollingADice {
    public static void main(String[] args) {

        System.out.println("Welcome to java dice rolling program");
        System.out.print("Do you want to roll the dice[Y/N]? ");
        Scanner userInput1 = new Scanner(System.in);
        char c1 = userInput1.next().charAt(0);

        if (c1 == 'Y' || c1 == 'y') {

            rollTheDice r = new rollTheDice();
            r.roll();

        } else if (c1 == 'n' || c1 == 'N') {
            System.out.println("Ok, program ended!");
        } else {
            System.out.println("Entere");
        }

    }
}

class rollTheDice {

    public void roll() {
        Random r = new Random();
        int number = r.nextInt(6) + 1;
        System.out.println("You got: " + number);

        System.out.println(" ");
        System.out.print("Do you want to roll again[Y/N]? ");
        Scanner userInput2 = new Scanner(System.in);
        char c2 = userInput2.next().charAt(0);
        if (c2 == 'y' || c2 == 'Y') {

            this.roll();
        } else {
            System.out.println("Thanks for using the program");
        }
    }
}