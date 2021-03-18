package Introduction;

import java.util.Scanner;

/**
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the number of queries.
 * Each line i of the q subsequent lines contains three space-separated integers describing the respective ai,bi , and ni values for that query.
 * <p>
 * Constraints
 * 0 <= q <= 500
 * 0 <= a,b <= 500
 * 1 <= n <= 15
 * Output Format
 * <p>
 * For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of n space-separated integers.
 * <p>
 * Sample Input
 * <p>
 * 2
 * 0 2 10
 * 5 3 5
 * Sample Output
 * <p>
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 * Explanation
 * <p>
 * We have two queries:
 * s0 = 0 + 1 * 2 = 2
 * s1 = 0 + 1 * 2 + 2 * 2 = 6
 * s2 = 0 + 1 * 2 + 2 * 2 + 4 * 2 = 14
 * <p>
 * We use a=5, b=3 , and n=5 to produce some series :
 * <p>
 * ... and so on.
 * <p>
 * Once we hit n=10, we print the first ten terms as a single line of space-separated integers.
 * <p>
 * We use a = 5, b = 3 , and n = 5 to produce some series s0, s1, ......, sn-1:
 * s0 = 5 + 1 * 3 = 8
 * s1 = 5 + 1 * 3 + 2 * 3 = 14
 * s2 = 5 + 1 * 3 + 2 * 3 + 4 * 3 = 26
 * s3 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 = 50
 * s4 = 5 + 1 * 3 + 2 * 3 + 4 * 3 + 8 * 3 + 16 * 3 = 98
 * <p>
 * We then print each element of our series as a single line of space-separated values.
 */

public class JavaLoopsII {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int j = 0;
            int c = 0;
            int valor = 0;

            while (j < n) {
                c++;

                valor = a + (c * b);
                c = c * 2;

                System.out.print(valor + " ");

                j++;
            }
            System.out.println("");
        }
        in.close();
    }
}
