package lesson7;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by User on 28.12.2017.
 */
@Listeners({MyTestListeners.class})
public class AssertExample {

    @Test
    public void someAsserts(){
        Assert.assertEquals(5,5);
        Assert.assertEquals("Jack","Jack");
        Assert.assertTrue(5>8, "Проверка 5>8");
    }


    }

