package com.zipcodewilmington.froilansfarm.farm;
import com.zipcodewilmington.froilansfarm.animal.Chicken;
import java.util.ArrayList;

public class Stable {

    ArrayList<Chicken> horses = new ArrayList<Chicken>();

    public void addChickens(Chicken chickToadd){
        this.horses.add(chickToadd);
    }

    public void removeChicken(Chicken chickenToRemove){
        this.horses.remove(chickenToRemove);
    }

    public ArrayList<Chicken> getChickens(){
        return this.horses;
    }

    public Integer getNumOfChickens(){
        return this.horses.size();
    }
}
