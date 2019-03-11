package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Container<T> {
    private List<T> list;

    public Container() {
        this.list = new ArrayList<T>();
    }

    public void add(T t) {
        list.add(t);
    }

    public void remove(T t) {
        list.remove(t);
    }

    public int size() {
        return list.size();
    }

    public List<T> getList() {
        return list;
    }

}
