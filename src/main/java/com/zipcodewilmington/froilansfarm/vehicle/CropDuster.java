package com.zipcodewilmington.froilansfarm.vehicle;
import com.zipcodewilmington.froilansfarm.plants.Field;

public class CropDuster extends FarmVehicle implements Aircraft {

    @Override
    public String makeNoise() {
        return "Look I'm in the sky!";
    }

    @Override
    boolean operate(Field field) {
      if (isFlying()) {
          //fertalize that field
          return true;
      }
        return false;
    }

    @Override
    public boolean isMounted() {
        return false;
    }

    @Override
    public boolean isFlying() {
        return true;
    }
}
