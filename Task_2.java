// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа.
// Выведите на экран результат умножения построчно.

// Sample Input:
// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:
// 2
// 4
// 6
// 10


import java.util.Scanner;
public class Task_2 {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите количество чисел:");
        String number_count = iScanner.nextLine();
        int num_count = Integer.parseInt(number_count);

        int [] arr = new int [num_count];
        for (int i = 0; i < num_count; i++){
            System.out.printf("Введите число:");
            String number = iScanner.nextLine();
            int num = Integer.parseInt(number);
            arr[i] = num;
        }

        System.out.printf("Введите число, на которое надо умножить все отсальные числа:");
        String number_factor = iScanner.nextLine();
        int num_factor = Integer.parseInt(number_factor);
        System.out.println();
        System.out.println("Получаем:");

        for (int j = 0; j < num_count; j++){
            System.out.println(arr[j]*num_factor);
        }

        iScanner.close();
        }
}
