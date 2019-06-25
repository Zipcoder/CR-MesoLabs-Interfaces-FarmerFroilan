package com.zipcodewilmington.froilansfarm.Vehicles;
import com.zipcodewilmington.froilansfarm.Animal.Driver;
import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Animal.Pilot;
import com.zipcodewilmington.froilansfarm.Animal.Rider;
import com.zipcodewilmington.froilansfarm.Crops.*;


public class CropDuster implements FarmVehicle,NoiseMaker, Flyable {
    Pilot pilot;


    public String makeNoise(){return "vrooom";}

    public CropRow fertilize(CropRow cropRow){
        cropRow.fertilize();
        return cropRow;
    }


    public void fly() {
        CropRow cropRow=new CropRow();
        if(this instanceof Flyable)
            this.fertilize(cropRow);

    }


    public boolean flying(){
        this.fly();
        return true;

    }

    public boolean land() {
        if(flying()==true)
        return false;
        else
            return true;
    }

    @Override
    public boolean isPilot(Rider rider) {
        if(rider instanceof Pilot)
            return true;
        else
        return false;
    }


    public Vehicle operate(Rider rider) {
        if(rider instanceof Pilot)
            return (Vehicle) this;
        else
        return null;
    }

}



