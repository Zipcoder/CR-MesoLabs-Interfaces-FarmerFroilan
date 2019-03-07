package com.zipcodewilmington.froilansfarm.storage;

public interface Storage <T>{
    void add(T storageObject);

    T retrieve(Integer objectId);
}
