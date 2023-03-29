// Task_4. *
// +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;
public class Task_4 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner iScanner = new Scanner (System.in);
        System.out.println("Введите уравнение:");
        String equation = iScanner.nextLine();

        String[] value = equation.split(" ");
        String first_term = value[0];
        String second_term = value[2];
        int result = Integer.parseInt(value[4]);
        int count = 0;


        int index_first_term = first_term.indexOf('?');

        
        if (index_first_term == 0){
            for (int i = 0; i < 10; i++){
                int first_part_term_one = i * 10;
                char second = first_term.charAt(1);
                int second_part_term_one = Character.digit(second,10);

                int index_second_term = second_term.indexOf('?');
                if (index_second_term == 0){
                    for (int j = 0; j < 10; j++){
                        int first_part_term_two = j * 10;
                        char second_two = second_term.charAt(1);
                        int second_part_term_two = Character.digit (second_two, 10);

                        if (first_part_term_one + second_part_term_one + first_part_term_two + second_part_term_two == result){
                            System.out.println((first_part_term_one + second_part_term_one) + "+" + (first_part_term_two + second_part_term_two) + "=" + result);
                            count++;
                            break;
                        }
                    }
                }

                if (index_second_term == 1){
                    for (int j = 0; j < 10; j++){
                        char first_two = second_term.charAt(0);
                        int first_part_term_two = Character.digit (first_two, 10)*10;
                        int second_part_term_two = j;

                        if (first_part_term_one + second_part_term_one + first_part_term_two + second_part_term_two == result){
                            System.out.println((first_part_term_one + second_part_term_one) + "+" + (first_part_term_two + second_part_term_two) + "=" + result);
                            count++;
                            break;
                        }
                    }
                }

                if (index_second_term == -1) {
                    int second_term_int = Integer.parseInt(second_term);

                    if (first_part_term_one + second_part_term_one + second_term_int == result){
                        System.out.println((first_part_term_one + second_part_term_one) + "+" + second_term_int + "=" + result);
                        count++;
                        break;
                    }
                }
            }
        }
    
        if (index_first_term == 1){

            for (int i = 0; i < 10; i++){
                char first = first_term.charAt(0);
                int first_part_term_one = Character.digit(first, 10)*10;
                int second_part_term_one = i;

                
                int index_second_term = second_term.indexOf('?');
                if (index_second_term == 0){
                    for (int j = 0; j < 10; j++){
                        int first_part_term_two = j * 10;
                        char second_two = second_term.charAt(1);
                        int second_part_term_two = Character.digit (second_two, 10);

                        if (first_part_term_one + second_part_term_one + first_part_term_two + second_part_term_two == result){
                            System.out.println((first_part_term_one + second_part_term_one) + "+" + (first_part_term_two + second_part_term_two) + "=" + result);
                            count++;
                            break;
                        }
                    }
                }

                if (index_second_term == 1){
                    for (int j = 0; j < 10; j++){
                        char second_one = second_term.charAt(0);
                        int first_part_term_two = Character.digit (second_one, 10)*10;
                        int second_part_term_two = j;

                        if (first_part_term_one + second_part_term_one + first_part_term_two + second_part_term_two == result){
                            System.out.println((first_part_term_one + second_part_term_one) + "+" + (first_part_term_two + second_part_term_two) + "=" + result);
                            count++;
                            break;
                        }
                    }
                }

                if (index_second_term == -1) {
                    int second_term_int = Integer.parseInt(second_term);

                    if (first_part_term_one + second_part_term_one + second_term_int == result){
                        System.out.println((first_part_term_one + second_part_term_one) + "+" + second_term_int + "=" + result);
                        count++;
                        break;
                    }
                }
            }
        }

        if (index_first_term == -1) {

            int first_term_int = Integer.valueOf(first_term);
                
            int index_second_term = second_term.indexOf('?');
            if (index_second_term == 0){
                for (int j = 0; j < 10; j++){
                    int first_part_term_two = j * 10;
                    char second_two = second_term.charAt(1);
                    int second_part_term_two = Character.digit (second_two, 10);

                    if (first_term_int + first_part_term_two + second_part_term_two == result){
                        System.out.println(first_term_int + "+" + (first_part_term_two + second_part_term_two) + "=" + result);
                        count++;
                        break;  
                    }
                }
            }

            if (index_second_term == 1){
                for (int j = 0; j < 10; j++){
                    char second_one = second_term.charAt(0);
                    int first_part_term_two = Character.digit (second_one, 10)*10;
                    int second_part_term_two = j;

                    if (first_term_int + first_part_term_two + second_part_term_two == result){
                        System.out.println(first_term_int + "+" + (first_part_term_two + second_part_term_two) + "=" + result);
                        count++;
                        break;
                    }
                }
            }
        }

        if (count == 0) {
            System.out.println("Решения нет");
        }

        iScanner.close();
    }
}

