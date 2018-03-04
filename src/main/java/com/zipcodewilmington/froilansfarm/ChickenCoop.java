package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class ChickenCoop  {

    ArrayList<Chicken> chickensInCoop;


    public  ChickenCoop(int numberOfChickens){

        chickensInCoop = new ArrayList<Chicken>();

        setNumberOFChickens(numberOfChickens);
    }


    public void setNumberOFChickens(int numberOfChickens){

        chickensInCoop.clear();

        for(int i = 0; i < numberOfChickens; i++){
            chickensInCoop.add(new Chicken());
        }
    }

}
