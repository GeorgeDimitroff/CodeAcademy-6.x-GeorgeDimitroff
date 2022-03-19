package mypac;

import java.util.Scanner;

/*
Напишете програма, която чете 1 число от конзолата, изчислява му корен квадратен и отпечатва резултата на екрана, с точност до 5-тия знак след запетаята.
 */

public class ReadAndPrintFirstTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        double sqrtNum = Math.sqrt(number);
        System.out.printf("%.5f\n", sqrtNum);
    }
}
