package TestNGDemo.DemoListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassOne {
    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }

    @Test //(enabled = false)
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
        Assert.assertEquals(true,false,"this is failed");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
