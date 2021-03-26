package com.zipcodewilmington.froilansfarm.Farm;

import java.util.LinkedHashMap;
import java.util.Map;

public class Field {
    CropRow cropRow = new CropRow();
    public Map<Integer, CropRow> fieldMap = new LinkedHashMap<Integer, CropRow>();


    public Field() {}

    public Field(int numOfRows, CropRow row) {
        for (int i = 1; i <= numOfRows; i++) {
            tillLand(i, row);
        }
    }

    public void tillLand(int rowNum, CropRow row) {
        if (!fieldMap.containsKey(rowNum)) {
            fieldMap.put(rowNum, row);
        } else {
            System.out.println("You already have crops there!");
        }
    }

    public int fieldSize() {
        return fieldMap.size();
    }

    public int harvestRow(int rowNum) {
        int numOfVeg = 0;
        for (int i = 0; i < fieldMap.get(rowNum).cropsPerRow(); i++) {
            numOfVeg += cropRow.harvestCrop(fieldMap.get(rowNum).cropType(i));
        }
        return numOfVeg;
    }

}
