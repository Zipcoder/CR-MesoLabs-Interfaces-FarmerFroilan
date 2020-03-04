package Crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.CarrotRoot;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import org.junit.Assert;
import org.junit.Test;

public class CarrotRootTest {
     CarrotRoot testCarrotRoot = new CarrotRoot();


    @Test
    public void carrotRootTest(); {
        Assert.assertTrue(testCarrotRoot instanceof Crop);
    }

    @Test
    public void carrotRootTest2() {
        Assert.assertTrue(testCarrotRoot instanceof Produce);
    }


        }
