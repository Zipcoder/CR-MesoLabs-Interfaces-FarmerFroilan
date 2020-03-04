package com.zipcodewilmington.froilansfarm.Production;

public class CornStalk extends Crop {


    public CornStalk() {

    }

    public EarCorn yield() {
        if (this.getHasBeenFertilized()) {
            return new EarCorn();
        } else {
            System.out.println("CornStalk not fertilized.");
            return null;
        }
    }

}
