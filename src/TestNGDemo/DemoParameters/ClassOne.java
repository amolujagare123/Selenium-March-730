package TestNGDemo.DemoParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classOneTest1(String url1,String username1,String password1)
    {
        String url=url1;
        String username=username1;
        String password=password1;
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
    }

    @Test //(enabled = false)
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
