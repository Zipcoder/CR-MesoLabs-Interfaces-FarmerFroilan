package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.producers.produce.Corn;

public class CornSilo implements Storage<Corn> {
    public Integer numberOfCorn;

    public CornSilo(){}

    public CornSilo(Integer numberOfCorn){}

    public void add(Corn storageObject) {

    }

    public void retrieve(Corn storageObject) {
    }

    public Integer getCount() {
        return null;
    }
}
