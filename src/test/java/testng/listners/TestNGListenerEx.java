package testng.listners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNGListenerEx {
    @Test
    public void TestA(){
        System.out.println("This is testA");
    }

    @Test
    public void TestB(){
    Assert.fail("This is testB");
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
