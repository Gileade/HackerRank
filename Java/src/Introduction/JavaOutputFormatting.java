package Introduction;

import java.util.Scanner;

/**
 * Input Format
 * <p>
 * Every line of input will contain a String followed by an integer.
 * Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.
 * <p>
 * Output Format
 * <p>
 * In each line of output there should be two columns:
 * The first column contains the String and is left justified using exactly 15 characters.
 * The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
 * <p>
 * Sample Input
 * <p>
 * java 100
 * cpp 65
 * python 50
 * Sample Output
 * <p>
 * ================================
 * java           100
 * cpp            065
 * python         050
 * ================================
 * Explanation
 * <p>
 * Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16 character, and each integer that was less than 3 digits now has leading zeroes.
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = scanner.next();
            int x = scanner.nextInt();
            System.out.println(String.format("%-15.15s", s1) + String.format("%03d", x));
        }
        System.out.println("================================");

    }
}
