import org.testng.annotations.Test;

public class TestNGGroups {


    @Test(groups = {"smoke"})
    public void testMethod1() {
        System.out.println("TestMethod 1");
    }
    @Test(groups = {"regression"})
    public void testMethod2() {
        System.out.println("TestMethod 2");
    }
    @Test(groups = {"smoke"})
    public void testMethod3() {
        System.out.println("TestMethod 3");
    }
    @Test(groups = {"regression"})
    public void testMethod4() {
        System.out.println("TestMethod 4");
    }

    @Test(groups = {"smoke", "regression"})
    public void testMethod5() {
        System.out.println("TestMethod 5");
    }

}
