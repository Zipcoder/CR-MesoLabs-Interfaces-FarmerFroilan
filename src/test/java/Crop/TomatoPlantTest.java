package Crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {
    TomatoPlant testTomatoPlant = new TomatoPlant();

    @Test
    public void tomatoPlantTest1() {
        Assert.assertTrue(testTomatoPlant instanceof Crop);
    }

    @Test
    public void tomatoPlantTest2() {
        Assert.assertTrue(testTomatoPlant instanceof Produce);
    }

}

