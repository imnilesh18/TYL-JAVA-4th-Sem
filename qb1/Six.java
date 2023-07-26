package qb1;
import java.util.Scanner;

public class Six {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String st;

        System.out.print("Enter a string: ");
        st = sc.nextLine();

        // Convert the input string to lowercase to handle both uppercase and lowercase vowels
        st = st.toLowerCase();

        // Remove the vowels from the string and update the input string
        st = removeVowels(st);

        System.out.println("String after removing vowels: " + st);
    }

    // Helper function to remove vowels from a string and return the new string
    public static String removeVowels(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)==false) {
                result += ch;
            }
        }

        return result;
    }

    // Helper function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
