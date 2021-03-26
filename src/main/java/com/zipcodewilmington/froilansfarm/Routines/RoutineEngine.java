package com.zipcodewilmington.froilansfarm.Routines;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.EdiblePackage.ChickenFood;
import com.zipcodewilmington.froilansfarm.EdiblePackage.EarCorn;
import com.zipcodewilmington.froilansfarm.EdiblePackage.HorseFood;

public class RoutineEngine implements DailyRoutine{
    public boolean mount (Horse horse) { return false;}
    public boolean dismount (Horse horse) {return false;}
    public boolean feedHorse(Horse horse, HorseFood food) {return false;}
    public boolean feedChickens(Chicken chicken, ChickenFood chickFood) {
        chicken.eat(chickFood);
        return true;}




    public void Monday () {}
    public void Tuesday () {}
    public void Wednesday () {}
    public void Thursday () {}
    public void Friday () {}
    public void Saturday () {}
    public void Sunday () {}
}
