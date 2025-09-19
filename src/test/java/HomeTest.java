import org.testng.annotations.Test;

public class HomeTest {

    @Test
    public void makeFoundation(){
        System.out.println("Make foundation. Foundation created.");
    }

    @Test(dependsOnMethods = "makeFoundation")
    public void makeWalls(){
        System.out.println("Make walls. Walls created.");
    }

    @Test(dependsOnMethods = "makeWalls")
    public void supplyWater(){
        System.out.println("Supply water. Water supply granted.");
    }

    @Test(dependsOnMethods = "makeWalls")
    public void makeRoof(){
        System.out.println("Make roof. Roof created.");
    }

    @Test(dependsOnMethods = {"makeWalls","makeRoof"})
    public void fixDoorsAndWindows(){
        System.out.println("Fix doors and windows. Doors and windows added.");
    }

    @Test(dependsOnMethods = {"makeWalls","makeRoof"})
    public void supplyElectricity(){
        System.out.println("Supply electricity. Electricity granted.");
    }
}
