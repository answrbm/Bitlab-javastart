package bitlab.javastart.chapter3;

import java.util.Locale;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double num = in.nextDouble();
        double sum = 1;

        while (num != 0) {
            sum *= num;
            num = in.nextDouble();
        }

        sum = (double)Math.round(sum * 1000)/1000;

        System.out.print(sum);
    }
}
