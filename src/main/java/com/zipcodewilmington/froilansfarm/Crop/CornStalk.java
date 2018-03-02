package com.zipcodewilmington.froilansfarm.Crop;

import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */

public class CornStalk extends Crop<CornStalk> implements Produce {
    public EarCorn yield() {
        return new EarCorn();
    }
}
