package practical.pom.ParallelExecutionTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestA {
    long startTime;

    @BeforeClass
    public void startTimer(){
        startTime = System.currentTimeMillis();

    }

    @AfterClass
    public void endTimer(){
        System.out.println("Execution Timer :"+ (System.currentTimeMillis()-startTime));
    }

    @Test
    public void method1() throws InterruptedException {
        System.out.println("TestA method1 started at thread :"+ Thread.currentThread().getId());
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(2000);
            System.out.println("Method 1 :" + i);
        }
    }  @Test
    public void method2() throws InterruptedException {
        System.out.println("TestA method2 started at thread :"+ Thread.currentThread().getId());
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("Method 2 :" + i);
        }
    }  @Test
    public void method3() throws InterruptedException {
        System.out.println("TestA method3 started at thread :"+ Thread.currentThread().getId());
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1500);
            System.out.println("Method 3 :" + i);
        }
    }  @Test
    public void method4() throws InterruptedException {
        System.out.println("TestA method4 started at thread :"+ Thread.currentThread().getId());
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(2500);
            System.out.println("Method 4 :" + i);
        }
    }  @Test
    public void method5() throws InterruptedException {
        System.out.println("TestA method5 started at thread :"+ Thread.currentThread().getId());
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(500);
            System.out.println("Method 5 :" + i);
        }
    }
}
