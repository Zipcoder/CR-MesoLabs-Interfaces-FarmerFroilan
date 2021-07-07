package com.zipcodewilmington.froilansfarm.Produce;


public class Tomatoes extends Bounty<Tomato> {

        public Tomato[] store() {
            Tomato[] food = bounty.toArray(new Tomato[0]);
            return food;
        }

}
