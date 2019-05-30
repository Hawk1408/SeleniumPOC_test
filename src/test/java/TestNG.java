import org.testng.annotations.*;
import org.testng.asserts.Assertion;

import java.lang.reflect.Method;

public class TestNG {
    private static Assertion assertion = new Assertion();

    @DataProvider(name="testData")
    public Object[][] testDataForMethods(){
        return new Object[][]{
                {"Username1","Password1"},
                {"Username2","Password2"},
                {"Username3","Password3"},
                {"Username4","Password4"},
                {"Username5","Password5"},
        };
    }

    @BeforeGroups(groups = "testnggroup")
    private static void beforeTest(){
        System.out.println("Before groups execution");
    }
    @AfterGroups(groups = "testnggroup")
    private static void afterTest(){
        System.out.println("After groups execution");
    }

    @BeforeMethod(groups = "testnggroup")
    private static void beforeMethod(Method method){
        System.out.println("Running test: " + method);
    }

    @AfterMethod(groups = "testnggroup")
    private static void afterMethod(Method method){
        System.out.println("Test performed: " + method + "\n");
    }

    @Test(groups = "testnggroup")
    public static void methodOne(){
        System.out.println("method 1 executed");
    }

    @Test(groups = "testnggroup", dependsOnMethods = "methodOne")
    public static void methodTwo(){
        System.out.println("method 2 executed");
    }

    @Test(dataProvider = "testData",groups = "testnggroup",priority = 2)
    public static void methodThree(String username, String pasword){
        System.out.println("method 3 executed\nUsername: " + username +"\nPassword: " + pasword);
    }

    @Test(priority = 3)
    public static void methodFour(){
        System.out.println("method 4 executed");
    }

    @Test(priority = 4)
    public static void methodFive(){
        System.out.println("method 5 executed");
    }
}