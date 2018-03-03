package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FarmBuildings.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {


    public String makeNoise() {
        return "Chuga chuga";
    }

    public void canRide() {
        this.hasRider = true;
    }

    public void stopRide() {
        this.hasRider = false;
    }

    public void operate(Field field) {
//       if(hasRider){
//           for (CropRow cropRows : field.getCropRow()){
//               for (Crop crops; cropRows.getCropRow()){
//                   crops.setHasBeenFertilized();
//               }
//           }
//       }
    }
}
