package com.zipcodewilmington.froilansfarm;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {
    public static void main(String[] args) {
       Farmer froilan = new Farmer();
       Pilot froilanda = new Pilot();
       froilan.sundayChore();
       froilanda.mondayChores(froilan.getFarm());
       froilan.tuesdayChores();

    }

}
