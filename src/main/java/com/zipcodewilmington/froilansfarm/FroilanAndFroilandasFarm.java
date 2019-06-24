package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.Froilan;
import com.zipcodewilmington.froilansfarm.Animal.Froilanda;
import com.zipcodewilmington.froilansfarm.Animal.Person;

public class FroilanAndFroilandasFarm {


        private static final FroilanAndFroilandasFarm INSTANCE = new FroilanAndFroilandasFarm();
        private Froilanda froilanda;
        private Froilan froilan;
        private FoodStorage silo;
        private Market froilanFleaMarket;
        private Farm farm;

        private FroilanAndFroilandasFarm() {
//            froilanda = fetchFroilanda();
//            froilan = fetchFroilan();
//            silo = fetchFoodStorage();
//            froilanFleaMarket = fetchMarket();
//            sheltersCreation();
//            fieldCreation();
//            farmCreation();

        }

        public FroilanAndFroilandasFarm fetchFarm() {
            return new FroilanAndFroilandasFarm();
        }

        public FroilanAndFroilandasFarm fetchInstance() {
            return INSTANCE;
        }

        public Froilan fetchFroilan() {
            return new Froilan(new Farm());
        }

        public Froilanda fetchFroilanda() {
            return new Froilanda();
        }

        public void farmCreation() {
            farm = froilan.fetchFarm();
        }


}
