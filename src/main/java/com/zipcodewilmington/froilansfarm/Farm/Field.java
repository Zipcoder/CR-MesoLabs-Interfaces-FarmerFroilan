package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crop.CropRow;

import java.util.ArrayList;
import java.util.List;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class Field {
    private static final int fDEFAULT_NUMBER_OF_ROWS = 5;
    List<CropRow> cropRows;

    public Field() {
        this(fDEFAULT_NUMBER_OF_ROWS);
    }

    public Field(int numberOfCropRows) {
        cropRows = new ArrayList<>(numberOfCropRows);
    }

    public List<CropRow> getCropRows() {
        return cropRows;
    }

    public void addCropRow(CropRow row) {
        cropRows.add(row);
    }

    public int getNumberOfCropRows() {
        return cropRows.size();
    }
}
