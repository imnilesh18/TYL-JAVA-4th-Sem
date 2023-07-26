package qb1;

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        int middleIndex = words.length / 2;
        int middleLength = words[middleIndex].length();

        // Handle the case when there are two middle elements
        if (words.length % 2 == 0) {
            int nextMiddleLength = words[middleIndex - 1].length();
            if (nextMiddleLength > middleLength) {
                middleLength = nextMiddleLength;
            }
        }

        System.out.println("Length of the middle word(s): " + middleLength);
    }
}
