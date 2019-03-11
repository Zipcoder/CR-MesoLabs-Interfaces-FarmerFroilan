package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow extends Container<Crop> {

    private boolean hasFertilized = false;

    public boolean getHasFertilized() {
        return hasFertilized;
    }
    public void setHasFertilized(boolean hasFertilizedFlag) {
        this.hasFertilized = hasFertilizedFlag;
    }

}
