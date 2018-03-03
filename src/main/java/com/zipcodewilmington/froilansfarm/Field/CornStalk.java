package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class CornStalk extends Crop {

    protected EarCorn earCorn = new EarCorn();

    public CornStalk(){

    }


    public Object yields(){
        return earCorn;
    }

}
