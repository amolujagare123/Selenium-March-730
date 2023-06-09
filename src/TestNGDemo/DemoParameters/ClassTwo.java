package TestNGDemo.DemoParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {


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
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
