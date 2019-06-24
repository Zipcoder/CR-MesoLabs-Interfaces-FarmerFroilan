package com.zipcodewilmington.froilansfarm;


import java.util.ArrayList;
import java.util.List;

public class Field<CropRow> {
    List<CropRow> field = new ArrayList();

    public Boolean isEmpty() {
        return null;
    }

    public Boolean atCapacity() {
        if (field.size() == 5) {
            return true;
        }
        return false;
    }

    public Boolean add() {
        return null;
    }

    public Integer itemCount() {
        return field.size();
    }

    public Boolean remove() {
        return null;
    }
}

