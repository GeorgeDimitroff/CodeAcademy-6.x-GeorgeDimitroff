package mypac;

import java.util.Scanner;

/*
Напишете програма, която прочита число от конзолата и отпечатва дали то е четно или нечетно.
(Подсказка: използвайте оператора ?:)
 */
public class ReadAndPrintSecondTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();

        boolean isEven = number%2 == 0;
        String result = isEven ? "Even" : "Odd";
        System.out.println(result);
    }
}
