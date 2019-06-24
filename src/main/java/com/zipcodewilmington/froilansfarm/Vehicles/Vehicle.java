package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;

public interface Vehicle extends NoiseMaker, Rideable {
    public void operate();
}
