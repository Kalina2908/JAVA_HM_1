// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331

import java.util.Scanner;
public class Task_1 {

    public static void main(String[] args) {

        int [] arr = new int [1000];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) Math.pow(i, 3);
        }

        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите первое число:");
        String first_number = iScanner.nextLine();
        int first_num = Integer.parseInt(first_number);
        System.out.printf("Введите второе число:");
        String second_number = iScanner.nextLine();
        int second_num = Integer.parseInt(second_number);

        System.out.printf ("Куб первого числа равен %s \n", arr[first_num]);
        System.out.printf ("Куб второго числа равен %s", arr[second_num]);

        iScanner.close();
        }
}
