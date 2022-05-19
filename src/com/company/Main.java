package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{7, 10, 1, 5, 42};
        List<Integer> list = new List<>(arr);
/*
        ListIterator listIterator = new ListIterator(list);
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next().getValue() + " ");
        }
        System.out.println();
        ListIterator listIteratorForEach = new ListIterator(list);
        listIteratorForEach.forEachRemaining(node -> {
                System.out.print(node.getValue() + " ");
        });
        System.out.println();
*/
// Задание 1.
// Найти среднее арифметическое значение элементов списка.
// Вариант 1.
        System.out.println("Задание 1 \nВариант 1");
        System.out.println("Среднеарифметическое значение равно " + Exercises.task01_1(list));
// Вариант 2.
        System.out.println("Вариант 2");
        System.out.println("Среднеарифметическое значение равно " + Exercises.task01_2(list));

// Задание 2.
// Перенести в начало списка его последний элемент.
        System.out.println("Задание 2 \nПервоначальный список");
        list.printList();
        Exercises.task02(list);
        System.out.println("Переносим последний элемент в начало списка");
        list.printList();

// Задание 3.
// Перенести в конец списка его первый элемент.
        System.out.println("Задание 3 \nПервоначальный список");
        list.printList();
        Exercises.task03(list);
        System.out.println("Переносим первый элемент в конец списка");
        list.printList();

// Задание 10.
// Перевернуть список наоборот.
        System.out.println("Задание 10 \nПервоначальный список");
        list.printList();
        Exercises.task10(list);
        System.out.println("Перевернутый список");
        list.printList();
    }
}
