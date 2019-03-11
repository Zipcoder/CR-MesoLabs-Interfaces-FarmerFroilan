package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Rider, Botanist {
    boolean hasRodeAllHorses;

    Farm farm;

    public Farmer() {
        farm = new Farm();
    }

    public Farm getFarm() {
        return this.farm;
    }

    public void plant(Crop crop, CropRow cropRow) {
        cropRow.add(crop);
    }

    public void mount(Rideable rideable) {
        rideable.setRideStatus(true);
    }

    public void unmount(Rideable rideable) {

    }


    public void doMorningChores(Farm farm) {
        ArrayList<Horse> horses = farm.getHorses();

        for (Horse h : horses) {
            mount(h);
            unmount(h);
            h.eat(new EarCorn());
            h.eat(new EarCorn());
            h.eat(new EarCorn());
        }
        eatBreakfast();
    }

    public void eatBreakfast() {
        eat(new EarCorn());
        eat(new Tomato());
        eat(new Tomato());
        for (int i = 0; i < 5; i++) {
            eat(new Egg());
        }
    }

    public void sundayChore() {
        doMorningChores(farm);

        CropRow cropRow1 = farm.getField().getList().get(0);
        CornStalk cornStalk1 = new CornStalk();
        cropRow1.add(cornStalk1);

        CropRow cropRow2 = farm.getField().getList().get(1);
        TomatoPlant tomatoPlant2 = new TomatoPlant();
        cropRow2.add(tomatoPlant2);


        CropRow cropRow3 = farm.getField().getList().get(2);
        OtherVegetation otherVegetation3 = new OtherVegetation();
        cropRow3.add(otherVegetation3);

    }

    public String makeNoise() {
        return "Ey aye ey aye oh";
    }
    public void tuesdayChores(){
        Tractor tractor = farm.getTractor();
        /*for(CropRow cropRow:farm.getField().getList()) {
            tractor.harvest(cropRow);
        }*/
        for(int i=0;i<farm.getField().size();i++){
            tractor.harvest(farm.getField().getList().get(i));
        }
    }
}