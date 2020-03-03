package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.Rideable;

public interface Rider {

        public void mount(Rideable rideable);
        public void dismount(Rideable rideable);
        public void ride(Rideable rideable);

    }
