package com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles;

public class EdibleFactory {

    public static Edible createEdible(EdibleType edibleToCreate){

        switch(edibleToCreate){
            case EGG:
                return new Egg();

            case HAY:
                return new Hay();

            case CHICKENFEED:
                return new ChickenFeed();

            case EARCORN:
                return new EarCorn();

            case TOMATO:
                return new Tomato();

            default:
                return new Vegetable();
        }

    }

}
