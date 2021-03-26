package com.zipcodewilmington.froilansfarm.fieldsAndCrops;

import java.util.HashMap;
import java.util.Map;

public class CropRow {

    private Map<Integer, Crop> rows;

    public CropRow() {
        this.rows = new HashMap<Integer, Crop>();
    }

    public Map setOneRow(int rowNum, Crop crop) {
        this.rows.put(rowNum, crop);
        return this.rows;
    }

    public Map getRows() {
        return this.rows;
    }

    public Crop getOneRow(int row) {
        return this.rows.get(row);
    }

}
