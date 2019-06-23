package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;


    public class Horse implements Animal, Rideable, NoiseMaker, Eater {
        public boolean makesNoise() {
            return false;
        }

        public boolean vehicleRideable() {
            return false;
        }

}
