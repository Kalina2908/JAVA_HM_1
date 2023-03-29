// Task_3.
// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.

import java.util.Scanner;
public class Task_3 {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner (System.in);
        System.out.printf("Введите число:");
        String first_number = iScanner.nextLine();
        int first_num = Integer.parseInt(first_number);
        String operator = "";
        String plus = "+";
        String minus = "-";
        String multiplication = "*";
        String division = "/";
        String equal = "=";
        int result = first_num;

        while (operator.equals(equal) == false){
            
            System.out.printf("Введите операцию:");
            operator = iScanner.nextLine();

            if (operator.equals(plus)){
                System.out.printf("Введите число:");
                String next_number = iScanner.nextLine();
                int next_num = Integer.parseInt(next_number);
                result = result + next_num;
            }
            if (operator.equals(minus)){
                System.out.printf("Введите число:");
                String next_number = iScanner.nextLine();
                int next_num = Integer.parseInt(next_number);
                result = result - next_num;
            }
            if (operator.equals(multiplication)){
                System.out.printf("Введите число:");
                String next_number = iScanner.nextLine();
                int next_num = Integer.parseInt(next_number);
                result = result * next_num;
            }
            if (operator.equals(division)){
                System.out.printf("Введите число:");
                String next_number = iScanner.nextLine();
                int next_num = Integer.parseInt(next_number);
                result = result / next_num;
            }
            if (operator.equals(equal)){
                System.out.printf ("Ответ: %s \n", result);
                break;
            }
        }
        
        iScanner.close();
        }
}