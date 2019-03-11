package com.zipcodewilmington.froilansfarm;


public class Field extends Container<CropRow> {

    private boolean flyOverTheField = false;
    public boolean getFlyOverTheField() {
        return flyOverTheField;
    }

    public void setFlyOverTheField(boolean flyOverTheField) {
        this.flyOverTheField = flyOverTheField;
    }

}
