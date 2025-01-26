import java.util.*;
public class HeadsOrTailsGame {
    public static class HeadsOrTails {
        public String getHeadsOrTails() {
            Random random = new Random();
            int tossResult = random.nextInt(2); 
            return switch (tossResult) {
                case 0 -> "Heads";
                case 1 -> "Tails";
                default -> throw new IllegalStateException("Unexpected value: " + tossResult);
            };
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an instance of HeadsOrTails
        HeadsOrTails coin = new HeadsOrTails();
        System.out.println("Guess the coin toss outcome (Heads/Tails): ");
        String userGuess = scanner.nextLine().trim().toLowerCase();
        String tossResult = coin.getHeadsOrTails().toLowerCase();
        if (userGuess.equals(tossResult)) {
            System.out.println("You won! The coin landed on " + tossResult + ".");
        } else {
            System.out.println("You lost. The coin landed on " + tossResult + ".");
        }
        
        scanner.close();
    }
}
