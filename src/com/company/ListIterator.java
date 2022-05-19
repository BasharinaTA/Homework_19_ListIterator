package com.company;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<Node<T>> {
    private final List<T> list;
    private Node<T> tmpNode;
    private int size;

    public ListIterator(List<T> list) {
        this.list = list;
        this.tmpNode = list.getHead();
        this.size = 0;
    }

    public Node<T> getTmpNode() {
        return tmpNode;
    }

    public void setTmpNode(Node<T> tmpNode) {
        this.tmpNode = tmpNode;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return this.size < list.getLength();
    }

    @Override
    public Node<T> next() {
        Node<T> tmp = this.tmpNode;
        this.size++;
        this.tmpNode = this.tmpNode.getNextNode();
        return tmp;
    }
}
