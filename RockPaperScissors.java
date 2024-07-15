package Week_02.Project;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    //Създаваме си три константи за: "Камък", "Хартия" и "Ножица"
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Опциите, от които може да избира играча
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        String playerMove = scan.nextLine();

        //Проверяваме дали играча е:
        // въвел една от трите възможни опции (камък, хартия, ножица)
        // или е въвел невалидна стойност
        if (playerMove.equals("r") || playerMove.equals("rocks")) {
            playerMove = "Rock";
        } else if (playerMove.equals("p") || playerMove.equals("paper")) {
            playerMove = "Paper";
        } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
            playerMove = "Scissors";
        } else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }

        //Създаваме променлива, която ни помага за избора на произволно число
        Random randomNumber = new Random();
        //Генерираното произволното число е в граници от 0 до 2
        int computerRandomNumber = randomNumber.nextInt(3);

        //Създаваме променлива за избора на комптютъра от 3 възможни варианта:
        //Камък, хартия, ножица
        String computerMove = "";

        //Switch -> възоснова на произволното число, като всяко число съответства на определен избор на компютъра
        // 0 -> Камък, 1 -> Хартия и 2 -> Ножица
        switch (computerRandomNumber) {
            case 0:
                computerMove = "Rock";
                break;
            case 1:
                computerMove = "Paper";
                break;
            case 2:
                computerMove = "Scissors";
                break;
        }
        //Отпечатваме произволния избор на компютъра
        System.out.printf("The computer chose %s.%n", computerMove);

        //Проверяваме кой печели играта:
        //1. Потребителя печели
        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            System.out.println("You win.");
        //2. Компютъра печели
        } else if ((playerMove.equals("Rock") && computerMove.equals("Paper")) ||
                (playerMove.equals("Paper") && computerMove.equals("Scissors")) ||
                (playerMove.equals("Scissors") && computerMove.equals("Rock"))) {
            System.out.println("You lose.");
        //3. Няма победител, тоест има равенство между потребителя и компютъра
        } else {
            System.out.println("This game was a draw.");
        }
    }
}
//14 stranica -> Use Git Bash (Option 2)