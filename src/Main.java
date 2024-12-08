import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Task number 1");

        int [] expense = {15000, 14525, 9568, 17000, 5668};
        int sum = 0;
        for (int i = 0; i < expense.length; i++) {
            sum += expense[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println();
        System.out.println("Task number 2");

        int [] weekExpense = {4230, 7596, 1253, 6654, 3251};
        int maxExpense = 0;
        int minExpense = 100000;
        for (int i = 0; i < weekExpense.length; i++) {
            if (weekExpense[i] > maxExpense) {
                maxExpense = weekExpense[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");

        for (int i = 0; i < weekExpense.length; i++) {
            if (weekExpense[i] < minExpense) {
                minExpense = weekExpense[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");

        System.out.println();
        System.out.println("Task number 3");

        double monthSum = 0;
        int [] weekSum = {2959, 7888, 4555, 3784, 8868};
        for (int i = 0; i < weekSum.length; i++) {
            monthSum += weekSum[i];
        }
        monthSum = monthSum / 5;
        System.out.println("Средняя сумма трат за месяц составила " + monthSum + " рублей.");

        System.out.println();
        System.out.println("Task number 4");

        char [] reverseFullName = {'n', 'a', 'v', 'I' ,' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//        for (int i = reverseFullName.length - 1; i >= 0; i--) {
//            System.out.print(reverseFullName[i]);
//        }

        char temp;
        for (int i = 0, j = reverseFullName.length - 1; i < reverseFullName.length / 2; i++, j--) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[j];
            reverseFullName[j] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}