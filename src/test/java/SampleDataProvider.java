import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleDataProvider {

    @Test(dataProvider ="feedData")
    public  void printMyDetails(String name ,int age ){
        System.out.printf("My Name is %s and My Age  is %d .\n",name,age);
    }

    @DataProvider
    public Object[][] feedData(){
        return new Object[][]{
                new Object[]{"Dilmi",23},
                new Object[]{"Pahasara",24},
                new Object[]{"Kamal",26},
                new Object[]{"Sunil",28},
        };
    }
}
