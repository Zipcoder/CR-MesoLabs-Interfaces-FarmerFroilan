package com.zipcodewilmington.froilansfarm;

public class FarmBuilder {
    private Integer numberFields;
    private Integer numberCropRows;
    private Integer numberStables;
    private Integer numberChickenCoops;
    private Integer numberFarmHouses;
    private Integer numberGarages;
    private Integer numberFoodStorage;


    public FarmBuilder setNumberFields(Integer numberFields) {
        this.numberFields = numberFields;
        return this;
    }

    public FarmBuilder setNumberCropRows(Integer numberCropRows) {
        this.numberCropRows = numberCropRows;
        return this;
    }

    public FarmBuilder setNumberStables(Integer numberStables) {
        this.numberStables = numberStables;
        return this;
    }

    public FarmBuilder setNumberChickenCoops(Integer numberChickenCoops) {
        this.numberChickenCoops = numberChickenCoops;
        return this;
    }

    public FarmBuilder setNumberFarmHouses(Integer numberFarmHouses) {
        this.numberFarmHouses = numberFarmHouses;
        return this;
    }

    public FarmBuilder setNumberGarages(Integer numberGarages) {
        this.numberGarages = numberGarages;
        return this;
    }

    public FarmBuilder setNumberFoodStorage(Integer numberFoodStorage) {
        this.numberFoodStorage = numberFoodStorage;
        return this;
    }


}
