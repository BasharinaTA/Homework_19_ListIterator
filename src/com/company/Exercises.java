package com.company;

public class Exercises {
    // Метод нахождения среднеарифметического значения элементов списка
    // Вариант 1
    public static double task01_1(List<Integer> list) {
        ListIterator<Integer> listIterator = new ListIterator<>(list);
        var sum = new helperClass();
        listIterator.forEachRemaining(node -> {
            sum.setValue(sum.getValue() + node.getValue());
        });
        return (double) sum.getValue() / list.getLength();
    }

    // Вариант 2
    public static double task01_2(List<Integer> list) {
        ListIterator<Integer> listIterator = new ListIterator<>(list);
        int sum = 0;
        while (listIterator.hasNext()) {
            sum += listIterator.next().getValue();
        }
        return (double) sum / list.getLength();
    }

    // Метод переноса в начало списка его последнего элемента
    public static <T> void task02(List<T> list) {
        ListIterator<T> listIterator = new ListIterator<>(list);
        Node<T> previousNode = null;
        var lastNode = listIterator.getTmpNode();
        while (listIterator.hasNext()) {
            previousNode = lastNode;
            lastNode = listIterator.next();
        }
        lastNode.setNextNode(list.getHead());
        assert previousNode != null;
        previousNode.setNextNode(null);
        list.setHead(lastNode);
    }

    // Метод переноса в конец списка его первого элемента
    public static <T> void task03(List<T> list) {
        ListIterator<T> listIterator = new ListIterator<>(list);
        var lastNode = listIterator.getTmpNode();
        var secondNode = list.getHead().getNextNode();
        while (listIterator.hasNext()) {
            lastNode = listIterator.next();
        }
        if (lastNode != list.getHead()) {
            lastNode.setNextNode(list.getHead());
            list.getHead().setNextNode(null);
            list.setHead(secondNode);
        }
    }

    // Метод, переворачивающий список наоборот
    public static <T> void task10(List<T> list) {
        ListIterator<T> listIterator = new ListIterator<>(list);
        Node<T> previousNode = null;
        while (listIterator.hasNext()) {
            var currentNode = listIterator.next();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
        }
        list.setHead(previousNode);
    }
}
