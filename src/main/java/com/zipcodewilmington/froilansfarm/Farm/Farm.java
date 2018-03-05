package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.*;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Crops.PotatoPlant;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;

import java.util.ArrayList;

public class Farm {
    private final FarmHouse farmHouse = new FarmHouse();
    private final Field field = new Field();
    private final ArrayList<Stable> stables = new ArrayList<>();
    private final ArrayList<ChickenCoop> chickenCoops = new ArrayList<>();
    private final Tractor tractor = new Tractor();
    private final CropDuster cropDuster = new CropDuster();
    private final Farmer froilan = new Farmer("Froilan", this);
    private final Farmer froilanda = new Farmer("Froilanda", this);
    private static final Farm INSTANCE = new Farm();

    private Farm(){
        Chicken chicken0 = new Chicken();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Chicken chicken4 = new Chicken();
        Chicken chicken5 = new Chicken();
        Chicken chicken6 = new Chicken();
        Chicken chicken7 = new Chicken();
        Chicken chicken8 = new Chicken();
        Chicken chicken9 = new Chicken();
        Chicken chicken10 = new Chicken();
        Chicken chicken11 = new Chicken();
        Chicken chicken12 = new Chicken();
        Chicken chicken13 = new Chicken();
        Chicken chicken14 = new Chicken();
        Horse horse0 = new Horse();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Horse horse4 = new Horse();
        Horse horse5 = new Horse();
        Horse horse6 = new Horse();
        Horse horse7 = new Horse();
        Horse horse8 = new Horse();
        Horse horse9 = new Horse();
        this.getChickenCoops().add(new ChickenCoop(chicken0, chicken1, chicken2, chicken3));
        this.getChickenCoops().add(new ChickenCoop(chicken4, chicken5, chicken6, chicken7));
        this.getChickenCoops().add(new ChickenCoop(chicken8, chicken9, chicken10, chicken11));
        this.getChickenCoops().add(new ChickenCoop(chicken12, chicken13, chicken14));
        this.getStables().add(new Stable(horse0, horse1, horse2));
        this.getStables().add(new Stable(horse3, horse4, horse5));
        this.getStables().add(new Stable(horse6, horse7, horse8, horse9));
    }

    public static Farm getINSTANCE() {
        return INSTANCE;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public Field getField() {
        return field;
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public Tractor getTractor() {
        return tractor;
    }

    public CropDuster getCropDuster() {
        return cropDuster;
    }

    public Farmer getFroilan() {
        return froilan;
    }

    public Farmer getFroilanda() {
        return froilanda;
    }
}
