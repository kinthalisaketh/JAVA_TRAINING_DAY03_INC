import java.util.*;
class CheckString {
    // Method to censor bad words in the input string
    public String censor(String s) {
        String[] censorWords = {"badword", "censor0", "censor"};
        for (String word : censorWords) {                                                        
            if (s.contains(word)) {
                s = s.replaceAll(word, "*******");
            }
        }
        return s;
    }
}
public class WordModerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        CheckString checkString = new CheckString();
        
        System.out.println("Type something then press enter, or type \"end\" to end the program:");
        
        while (!(input = scanner.nextLine()).equals("end")) {
            // Call the censor method to handle bad words
            String result = checkString.censor(input);
            System.out.println("You typed: " + result);
        }
        
        System.out.println("Program Ended");
        scanner.close();
    }
}
