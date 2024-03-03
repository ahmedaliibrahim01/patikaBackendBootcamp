import java.util.Scanner;

public class Main {
    static boolean isPalindromik(String str){
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            reverse.append(str.charAt(i));
        }
        return str.equals(reverse.toString());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Word : ");
        String string = scanner.nextLine();

        String print = isPalindromik(string) ? "The word you entered is Palindromic " : "The word you entered isn't Palindromic";
        System.out.println(print);
    }
}