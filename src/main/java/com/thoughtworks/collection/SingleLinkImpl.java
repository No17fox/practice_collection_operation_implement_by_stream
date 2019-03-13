package com.thoughtworks.collection;

public class SingleLinkImpl<T> implements SingleLink {
    private LinkNode<T> head;
    private LinkNode<T> tail;
    private int size = 0;

    public SingleLinkImpl() {
        this.head = new LinkNode<T>();
        this.head.setNext(null);
        this.tail = this.head;
    }

    @Override
    public Object getHeaderData() {
        if (this.isEmpty()) {
            return null;
        }
        return this.head.getData();
    }

    @Override
    public Object getTailData() {
        if (this.isEmpty()) {
            return null;
        }
        return this.tail.getData();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return null == this.head.getData();
    }

    @Override
    public boolean deleteFirst() {
        if (this.isEmpty()) {
            return false;
        }
        this.head = this.head.getNext();
        this.size--;
        return true;
    }

    @Override
    public boolean deleteLast() {
        if (this.isEmpty()) {
            return false;
        }
        LinkNode node = this.head;
        while (node.getNext() != this.tail) {
            node = node.getNext();
        }
        node.setNext(null);
        this.tail = node;
        this.size--;
        return true;
    }

    @Override
    public void addHeadPointer(Object item) {
        LinkNode<T> node = new LinkNode<>((T) item);
        if (this.isEmpty()) {
            this.head = node;
            this.tail = this.head;
        } else {
            LinkNode<T> oldHead = this.head;
            node.setNext(oldHead);
            this.head = node;
        }
        this.size++;
    }

    @Override
    public void addTailPointer(Object item) {
        LinkNode<T> node = new LinkNode<>((T)item);
        if (this.isEmpty()) {
            this.head = node;
            this.tail = this.head;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
        this.size++;
    }

    @Override
    public Object getNode(int index) {
        if (this.isEmpty()) {
            return null;
        }
        int position = 1;
        LinkNode node = this.head;
        while (position != index) {
            node = node.getNext();
            position++;
        }
        return node.getData();
    }
}
