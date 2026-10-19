package Practice;

import java.util.Random;
import java.util.Scanner;

class Game {

    private int number;
    private int inputNumberl;
    private int noofGuesses = 0;


    public Game() {
        Random random = new Random();
        number = random.nextInt(100) + 1;
    }

    public void takeUserInput() {
        Scanner s = new Scanner(System.in);

        System.out.println(" Guess the Number (1- 100) : ");
        inputNumberl = s.nextInt();

        noofGuesses++;
    }

    public boolean isCorrectNumber() {
        if (inputNumberl == number) {
            System.out.println(" Congratulation! Your gass is correct ...");
        } else if (inputNumberl < number) {
            System.out.println(" Your guess is to low!");
        } else {
            System.out.println(" Yout guess is wrong ");
        }
        return false;
    }

    public int getNoofGuesses() {
        return noofGuesses;
    }

    public void setNoofGuesses(int noofGuesses) {
        this.noofGuesses = noofGuesses;
    }

}
public class changles {

    public static void main(String[] args) {

        Game game = new Game();

        boolean correct = false;

        while (!correct) {
            game.takeUserInput();
            correct = game.isCorrectNumber();
        }

        System.out.println("Number of guesses: " + game.getNoofGuesses());
    }

}
