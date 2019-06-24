package com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;


public interface Rider extends Person{

        public void mount(Rideable rideable);
        public void dismount(Rideable rideable);
}
