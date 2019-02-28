package com.thoughtworks.collection;

public class LinkNode<T> {
    private T data;
    private LinkNode<T> next;

    public LinkNode() {}

    public LinkNode(T value) {
        this.data = value;
        this.next = null;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkNode getNext() {
        return this.next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}
