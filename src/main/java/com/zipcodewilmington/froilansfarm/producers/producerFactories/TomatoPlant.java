package com.zipcodewilmington.froilansfarm.producers.producerFactories;

import com.zipcodewilmington.froilansfarm.producers.produce.Crop;
import com.zipcodewilmington.froilansfarm.storage.TomatoSilo;

public class TomatoPlant extends Crop {
        private Boolean isFertilized;
        private Integer numberOfTomatoes;

        public TomatoPlant(){
            this.isFertilized = false;
            this.numberOfTomatoes = 0;
        }

        public TomatoPlant(Boolean isFertilized, Integer numberOfTomatoes){
            this.isFertilized = isFertilized;
            this.numberOfTomatoes = numberOfTomatoes;
        }

        public Boolean getIsFertilized(){
            return this.isFertilized;
        }

        public Integer getNumberOfTomatoes(){
            return this.numberOfTomatoes;
        }

        public void setIsFertilized(Boolean isFertilized){
            this.isFertilized = isFertilized;
        }

        public void setNumberOfTomatoes (Integer numberOfTomatoes){
            this.numberOfTomatoes = numberOfTomatoes;
        }

        @Override
        public void yield(){
            this.numberOfTomatoes = numberOfTomatoes + 1;
        }

    }
