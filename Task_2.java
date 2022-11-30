package Homeworks.Homework_4;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */
public class Task_2 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        printNumbers(numbers);
    }

    private static void printNumbers(int[] numbers) {
        Queue<Integer> queue = new LinkedList<>();
        for (int number : numbers) queue.add(number);
        while (!queue.isEmpty()) System.out.println(queue.remove());
    }
}
