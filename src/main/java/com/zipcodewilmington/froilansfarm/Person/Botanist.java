package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Field.*;

public class Botanist extends Farmer{

    public boolean eat() {
        return true;
    }
    @Override
    public String makeNoise() {
        return "If I were to talk to Lindsay Lohan, Id encourage her to get the hell out of acting and " +
                "into something soothing.  Take up botany or something.";
    }

    public void plant(Crop crop){
    }

}
