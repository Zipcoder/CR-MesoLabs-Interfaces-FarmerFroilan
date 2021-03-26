package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class CornStalk extends Crop{

    public CornStalk(){

    }

    public Edible yield() {
        return new Corn();
    }

    @Override
    public String toString(){
        return "Corn Stalk";
    }
}
