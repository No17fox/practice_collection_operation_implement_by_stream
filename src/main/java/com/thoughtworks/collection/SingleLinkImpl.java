package com.thoughtworks.collection;

import java.util.Arrays;

public class SingleLinkImpl<T> implements SingleLink {
    private T[] t;

    public void setT(T[] t) {
        this.t = t;
    }

    @Override
    public Object getHeaderData() {
        if (this.isEmpty()) {
            return null;
        }
        return t[0];
    }

    @Override
    public Object getTailData() {
        if (this.isEmpty()) {
            return null;
        }
        return t[this.size() - 1];
    }

    @Override
    public int size() {
        return this.t.length;
    }

    @Override
    public boolean isEmpty() {
        return 0 == this.size();
    }

    @Override
    public boolean deleteFirst() {
        if (this.isEmpty()) {
            return false;
        }
        T[] arrayT = Arrays.copyOfRange(this.t, 1, this.size());
        this.t = arrayT;
        return true;
    }

    @Override
    public boolean deleteLast() {
        if (this.isEmpty()) {
            return false;
        }
        T[] arrayT = Arrays.copyOfRange(this.t, 0, this.size() - 1);
        this.t = arrayT;
        return true;
    }

    @Override
    public void addHeadPointer(Object item) {
        T[] arrayT = (T[]) new Object[this.size() + 1];
        arrayT[0] = (T) item;
        for (int i = 0; i < this.t.length; i++) {
            arrayT[i + 1] = this.t[i];
        }
        this.t = arrayT;
    }

    @Override
    public void addTailPointer(Object item) {
        T[] arrayT = Arrays.copyOf(this.t, this.size() + 1);
        arrayT[this.size()] = (T) item;
        this.t = arrayT;
    }

    @Override
    public Object getNode(int index) {
        return this.t[index];
    }
}
