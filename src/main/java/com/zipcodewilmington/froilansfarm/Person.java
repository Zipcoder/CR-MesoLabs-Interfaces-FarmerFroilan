package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public abstract class Person extends Animal implements Rider{

    public abstract void doMorningChores(Farm farm);

    public abstract void eatBreakfast();

    public abstract String makeNoise();
}
