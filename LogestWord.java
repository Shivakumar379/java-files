import java.util.Scanner;

public class LogestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String longest = longestWord(sentence);
        System.out.println("Longest word: " + longest);
        scanner.close();
    }

    public static String longestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) return "";
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}