package com.company;

public class List<T> {
    private Node<T> head;
    private int length;

    public List() {
        this.head = null;
        this.length = 0;
    }

    public List(Node<T> head) {
        this.head = head;
        this.length = 1;
    }

    public List(T[] arr) {
        this.head = new Node<>(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            this.push(arr[i]);
        }
        this.length = arr.length;
    }

    public Node<T> getHead() {
        return this.head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void printList() {
        var tmpNode = this.head;
        while (tmpNode != null) {
            System.out.print(tmpNode.getValue() + " ");
            tmpNode = tmpNode.getNextNode();
        }
        System.out.println();
    }

    public void push(T value) {
        var tmpNode = this.head;
        while (tmpNode.getNextNode() != null) {
            tmpNode = tmpNode.getNextNode();
        }
        tmpNode.setNextNode(new Node<>(value));
        this.length++;
    }
}
