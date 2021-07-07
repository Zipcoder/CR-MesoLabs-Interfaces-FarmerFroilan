package com.zipcodewilmington.froilansfarm.Produce;

public class StringBeans extends Bounty<StringBean> {

    public StringBean[] store() {
        StringBean[] food = bounty.toArray(new StringBean[0]);
        return food;
    }
}
