package Crop;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.PotatoRoot;
import org.junit.Assert;
import org.junit.Test;

public class PotatoRootTest {
    PotatoRoot testPotatoRoot = new PotatoRoot();

    @Test
    public void potatoRootTest() {
        Assert.assertTrue(testPotatoRoot instanceof Crop);
    }

    @Test
    public void potatoRootTest2() {
        Assert.assertTrue(testPotatoRoot instanceof Produce);
    }
}
