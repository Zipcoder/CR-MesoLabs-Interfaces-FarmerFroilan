package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class CropRow<T> extends Field {

    private List<T> tplant;

    public CropRow(List<T> tplantsInACropRow) {
        this.tplant = tplantsInACropRow;
    }

    public List<T> getTplant() {
        return tplant;
    }

    public void setTplant(List<T> tplant) {
        this.tplant = tplant;
    }
}
