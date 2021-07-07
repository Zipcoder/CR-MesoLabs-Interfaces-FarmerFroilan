package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.FieldRelated.*;
import com.zipcodewilmington.froilansfarm.FieldRelated.CornStalk;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;
import com.zipcodewilmington.froilansfarm.FieldRelated.PotatoPlant;
import com.zipcodewilmington.froilansfarm.FieldRelated.TomatoPlant;
import com.zipcodewilmington.froilansfarm.VehicleRelated.CropDuster;

public class farmersLife {
    public Farm getFarm() {
        return this.farm;
    }

    private Farm farm = new Farm();


    public void sunday() {
        System.out.println("Its sunday!");
        farm.everyday();
        farm.getFroilan().plants(new CornStalk(), farm.getField().getCropRows().get(0),5);
        farm.getFroilan().plants(new PotatoPlant(),farm.getField().getCropRows().get(1),5);
        farm.getFroilan().plants(new TomatoPlant(),farm.getField().getCropRows().get(2),5);
    }

    public void monday() {
        System.out.println("Its Monday");
        farm.everyday();
        farm.getFroilanda().fly(farm.getCropDuster());
        for (int i = 0; i <farm.getCropRows().size(); i++) {
            System.out.println("Row "+ (i+1) + ":" );
            farm.getCropDuster().fertilize(farm.getCropRows().get(i));

        }
        //cropDuster
    }
    public void tuesday() {
        System.out.println("Its Tuesday");
        farm.everyday();
        farm.getFroilan().ride(farm.getTractor());
        Integer i = 1;
        for (CropRow row: farm.getCropRows()
             ) {
            System.out.println("Row "+ (i) + ":" );
            if (row.getCrop().getClass().equals(CornStalk.class)) {
                farm.getTractor().harvest(row, farm.getCornBasket());
                System.out.println("harvested some corn!");
            } else if (row.getCrop().getClass().equals(PotatoPlant.class)) {
                farm.getTractor().harvest(row, farm.getPotatoBasket());
                System.out.println("harvested some potatoes!");
            } else if (row.getCrop().getClass().equals(TomatoPlant.class)) {
                farm.getTractor().harvest(row, farm.getTomatoBasket());
                System.out.println("harvested some tomatoes!");
            }
            i++;
        }
    }
    public void wednesday() {
        System.out.println("Its Wednesday");
        farm.everyday();
    }
    public void thursday() {
        System.out.println("Its Thursday");
        farm.everyday();
    }
    public void friday() {
        System.out.println("Its Friday");
        farm.everyday();
    }
    public void saturday() {
        System.out.println("Its Saturday");
        farm.everyday();
    }


}
