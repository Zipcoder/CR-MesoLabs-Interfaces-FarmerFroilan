package com.zipcodewilmington.froilansfarm.Animal;

    import com.zipcodewilmington.froilansfarm.Crops.CropRow;
    import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
    import com.zipcodewilmington.froilansfarm.FoodStorage;
    import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;
    import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

    import java.util.List;

    public class Farmer implements Botanist {

        FoodStorage foodStorage=new FoodStorage();

    public Tomatoes farmerHarvest(CropRow<TomatoPlant> tomatorow){
        Tractor tractor = new Tractor();
        Tomatoes tomatoes = new Tomatoes();
        List<TomatoPlant> tomatoPlants = tomatorow.getTplant();
        tomatoes= (Tomatoes) tractor.harvest((TomatoPlant) tomatoPlants);
        return tomatoes;
    }
    public void foodStore(Tomatoes tomatoes){
        foodStorage.add(tomatoes);
    }

    }

