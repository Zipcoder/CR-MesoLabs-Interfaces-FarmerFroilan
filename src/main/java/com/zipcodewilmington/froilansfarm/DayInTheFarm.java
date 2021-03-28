package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.shelter.*;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

public class DayInTheFarm{

    /*This class will be passed  a day, and return the events of the day that
    occured based on the class
    interactions First, we create instances of the farm and everything on it.
    I know I could make factory classes for this nonsense. But.....nah.*/
    String day;
    DayInTheFarm(String dayOfWeek){day=dayOfWeek;}

    Tractor tractor=new Tractor("Dumb tractor");
    CropDuster duster=new CropDuster("A stupid plane");
    Farm theFarm=new Farm();
    Farmer froilan=new Farmer("Froilan");
    Pilot froilana=new Pilot("Froilana");

    Horse h1=new Horse("SeaBiscuit");
    Horse h2=new Horse("Black Beauty");
    Horse h3=new Horse("Zorro's horse");
    Horse h4=new Horse("Tina's Favorite");
    Horse h5=new Horse("Applejack");
    Horse h6=new Horse("Clipclop");
    Horse h7=new Horse("That one horse from Shadow of the Colossus");
    Horse h8=new Horse("Elmer");
    Horse h9=new Horse("Look guys, there's only so many horse names I can think up.");
    Horse h10=new Horse("The Last horseName");
    Chicken c1 = new Chicken("Oh god we're naming the chickens");
    Chicken c2 = new Chicken("Eggmaker Deluxe");
    Chicken c3 = new Chicken("Usopp");
    Chicken c4 = new Chicken("The lion, like from Wizard of oz.");
    Chicken c5 = new Chicken("Hercule");
    Chicken c6 = new Chicken("Mr. Satan");
    Chicken c7 = new Chicken("Get it? They're all Cowardly.");
    Chicken c8 = new Chicken("So they're all chickens. Anime Chickens.");
    Chicken c9 = new Chicken("Hoo boy, still got a lot to name, huh?");
    Chicken c10 = new Chicken("Beaky");
    Chicken c11 = new Chicken("Squawker");
    Chicken c12 = new Chicken("Omlette");
    Chicken c13 = new Chicken("The Colonel");
    Chicken c14 = new Chicken("Mr. Bawk b-gawk");
    Chicken c15 = new Chicken("The last of the chickens");

    Field theField=new Field();


    public void justBuildTheStupidFarmAlready(){
        //First our farmers moe into the Farmhouse.
        theFarm.moveIn(froilan);
        theFarm.moveIn(froilana);

        //They build coops, and fill them with the 15 chicken they bought.
        theFarm.addCoop(new ChickenCoop());
        theFarm.addCoop(new ChickenCoop());
        theFarm.addCoop(new ChickenCoop());
        theFarm.addCoop(new ChickenCoop());
        theFarm.getChickenCoops().get(0).add(c1);
        theFarm.getChickenCoops().get(0).add(c2);
        theFarm.getChickenCoops().get(0).add(c3);
        theFarm.getChickenCoops().get(0).add(c4);
        theFarm.getChickenCoops().get(1).add(c5);
        theFarm.getChickenCoops().get(1).add(c6);
        theFarm.getChickenCoops().get(1).add(c7);
        theFarm.getChickenCoops().get(1).add(c8);
        theFarm.getChickenCoops().get(2).add(c9);
        theFarm.getChickenCoops().get(2).add(c10);
        theFarm.getChickenCoops().get(2).add(c11);
        theFarm.getChickenCoops().get(2).add(c12);
        theFarm.getChickenCoops().get(3).add(c13);
        theFarm.getChickenCoops().get(3).add(c14);
        theFarm.getChickenCoops().get(3).add(c15);

        //They then built stables, to store their 10 horses.
        theFarm.addStable(new Stables());
        theFarm.addStable(new Stables());
        theFarm.addStable(new Stables());
        theFarm.getStables().get(0).add(h1);
        theFarm.getStables().get(0).add(h2);
        theFarm.getStables().get(0).add(h3);
        theFarm.getStables().get(0).add(h4);
        theFarm.getStables().get(1).add(h5);
        theFarm.getStables().get(1).add(h6);
        theFarm.getStables().get(1).add(h7);
        theFarm.getStables().get(1).add(h8);
        theFarm.getStables().get(2).add(h9);
        theFarm.getStables().get(2).add(h10);


        //They make rows in the field to plant the crops
        theField.add(new CropRow());
        theField.add(new CropRow());
        theField.add(new CropRow());
        theField.add(new CropRow());
        theField.add(new CropRow());

        //they plant 10 corn in row 1, 10 tomato in row 2, and
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(0).add(new CornStalk());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(1).add(new TomatoPlant());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(2).add(new CornStalk());
        theField.get(3).add(new TomatoPlant());
        theField.get(3).add(new TomatoPlant());
        theField.get(3).add(new TomatoPlant());
        theField.get(3).add(new TomatoPlant());
        theField.get(3).add(new TomatoPlant());
        theField.get(3).add(new TomatoPlant());
        theField.get(3).add(new TomatoPlant());
        theField.get(3).add(new TomatoPlant());
        theField.get(3).add(new TomatoPlant());
        theField.get(3).add(new TomatoPlant());
        theField.get(3).add(new TomatoPlant());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());
        theField.get(4).add(new CornStalk());

    }


}
