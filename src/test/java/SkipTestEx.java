import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestEx  {

    @Test
    public void TestA(){
        System.out.println("This is testA");
    }

    @Test(enabled = false)
    public void TestB(){
        System.out.println("This is testB");
    }

    @Test
    public void TestC(){
        System.out.println("This is testC");
    }

    @Test
    public void TestD(){
        boolean Test = false;
        if(!Test){
            throw  new SkipException("This is testD skip exception.");
        }
    }
}
