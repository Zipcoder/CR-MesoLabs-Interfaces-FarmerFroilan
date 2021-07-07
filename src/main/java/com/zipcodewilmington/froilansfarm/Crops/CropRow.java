package com.zipcodewilmington.froilansfarm.Crops;

//import com.zipcodewilmington.froilansfarm.Field;

import java.util.List;

    public class CropRow<T> {

        private List<T> tplant;

        private boolean fertilized = false;

        public CropRow() {
        }

        public boolean fertilize() {
            fertilized = true;
            return true;
        }

        public CropRow(List<T> tplantsInACropRow) {
            this.tplant = tplantsInACropRow;
        }


        public static void addCrops(Crops crops) {
        }

        public List<T> getTplant() {
            return tplant;
        }

        public void setTplant(List<T> tplant) {
            this.tplant = tplant;
        }
}
