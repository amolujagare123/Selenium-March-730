package TestNGDemo.DemoParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {



    @Parameters({"myUrl","myUsername","myPassword"})
    @Test
    public void classThreeTest1(String url1,String username1,String password1)
    {
        String url=url1;
        String username=username1;
        String password=password1;
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
    }

    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
