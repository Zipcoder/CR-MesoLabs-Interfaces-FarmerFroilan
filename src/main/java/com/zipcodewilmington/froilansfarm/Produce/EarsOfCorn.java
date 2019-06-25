package com.zipcodewilmington.froilansfarm.Produce;

public class EarsOfCorn extends Bounty<EarOfCorn> {

    public EarOfCorn[] store() {
        EarOfCorn[] food = bounty.toArray(new EarOfCorn[0]);
        return food;
    }
}
