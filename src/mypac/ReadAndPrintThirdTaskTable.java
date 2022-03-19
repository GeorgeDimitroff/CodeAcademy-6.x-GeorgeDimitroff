package mypac;

/*
Нека имате ученици със следните оценки:
Иванчо - 2
Ани - 5
Марийка - 6
Пенчо - 4
Бориславчо - 5.
Използвайте printf да отпечатате оценките им в табличен вид, всеки ученик - на отделен ред.
 */

public class ReadAndPrintThirdTaskTable {
    public static void main(String[] args) {
        String name1 = "Ivancho";
        int grade1 = 2;
        String name2 = "Ani";
        int grade2 = 5;
        String name3 = "Mariya";
        int grade3 = 6;
        String name4 = "Pencho";
        int grade4 = 4;
        String name5 = "Borislavcho";
        int grade5 = 5;

        System.out.printf(String.format("+%-13s+%-5s+\n", " ", " ").replace(' ', '-'));
        System.out.printf("|%-13s|%-5d|\n", name1, grade1);
        System.out.printf(String.format("+%-13s+%-5s+\n", " ", " ").replace(' ', '-'));
        System.out.printf("|%-13s|%-5d|\n", name2, grade2);
        System.out.printf(String.format("+%-13s+%-5s+\n", " ", " ").replace(' ', '-'));
        System.out.printf("|%-13s|%-5d|\n", name3, grade3);
        System.out.printf(String.format("+%-13s+%-5s+\n", " ", " ").replace(' ', '-'));
        System.out.printf("|%-13s|%-5d|\n", name4, grade4);
        System.out.printf(String.format("+%-13s+%-5s+\n", " ", " ").replace(' ', '-'));
        System.out.printf("|%-13s|%-5d|\n", name5, grade5);
        System.out.printf(String.format("+%-13s+%-5s+\n", " ", " ").replace(' ', '-'));
    }
}
