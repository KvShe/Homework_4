package Homeworks.Homework_4;

import java.util.Stack;

/**
 * Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
 */

public class Task_1 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        printNumbers(numbers);
    }

    private static void printNumbers(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int number : numbers) stack.add(number);
        while (!stack.empty()) System.out.println(stack.pop());
    }
}
