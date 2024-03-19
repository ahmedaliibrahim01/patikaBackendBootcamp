import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String sentence = scanner.nextLine();
        System.out.println(firstLetterBig(sentence));
    }

    public static String firstLetterBig(String str){
        String result = "";
        String[] words = str.split(" ");
        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0))
                    + word.substring(1) + " ";
        }

        return result;
    }
}