package com.zipcodewilmington.froilansfarm.Animal;

    import com.zipcodewilmington.froilansfarm.Crops.CropRow;
    import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
    import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;
    import com.zipcodewilmington.froilansfarm.Tomato;
    import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

    import java.util.List;

    public class Farmer implements Botanist {

        Tomato tomato=new Tomato();
        public Tomatoes harvest(CropRow<TomatoPlant> tomatorow){
            Tractor tractor = new Tractor();
            Tomatoes tomatoes = new Tomatoes();
            List<TomatoPlant> tomatoPlantsInTheRow = tomatorow.getTplant();
            for (TomatoPlant tomatoPlantInTheRow:tomatoPlantsInTheRow)
            {
               // tomatoes.addTomatoes(tractor.harvest(tomatoPlantInTheRow));
            }return tomatoes;
        }
        // public Tomatoes tomatoesStorage(){
        // FoodStorage<tomato> tomnotostorage;
//tomnotostorage.add(tomato)

    }

