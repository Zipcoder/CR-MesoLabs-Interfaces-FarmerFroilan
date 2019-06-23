package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Field;

import java.util.List;

    public class CropRow<T> extends Field {

        private List<T> tplant;

        public CropRow(List<T> tplantsInACropRow) {
            this.tplant = tplantsInACropRow;
        }

        public static void addCrops(Crops crops) {
        }

        public CropRow getTplant() {
            return tplant;
        }

        public void setTplant(List<T> tplant) {
            this.tplant = tplant;
        }
}
