import java.util.*;

public class Number_game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 50;
        int maxChances = 3;
        int rounds = 0;

        while (true) {
            int chances = 0;
            rounds++;

            System.out.println("Round " + rounds);
            while (chances < maxChances) {
                System.out.println("Guess num : ");
                int guess_num = sc.nextInt();

                if (num == guess_num) {
                    System.out.println("Correct!.....You won!!");
                    break;
                } else if (guess_num > num + 10) {
                    System.out.println("Guess is too high");
                } else if (guess_num < num - 10) {
                    System.out.println("Guess is too low");
                } else {
                    System.out.println("You are close!");
                }
                chances++;
            }

            if (chances == maxChances) {
                System.out.println("You lost this round");
            }

            System.out.println("Do you want to play another round? (yes/no)");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
    }
}
