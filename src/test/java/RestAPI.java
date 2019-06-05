import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RestAPI {

    private static Assertion assertion = new Assertion();

    @DataProvider(name="cityList")
    private Object[] testDataForMethods() throws java.io.IOException{
        Path path = Paths.get("/home/naren/IdeaProjects/SeleniumPOC_test/TestData/listOfCities");
        return Files.lines(path).toArray();
    }

    @Test(dataProvider = "cityList")
    public void test_ResponseHeaderData_ShouldBeCorrect(String city) {
        RestAssured.baseURI = "http://api.openweathermap.org";
        Response response =
                RestAssured.given().
                when().queryParams("q",city,"APPID", "65853764b49928015a5208340fb5557d").
                get("/data/2.5/weather").thenReturn();
        String resp = response.getBody().asString();
        assertion.assertTrue(response.getStatusCode() == 200);
        assertion.assertTrue(Integer.parseInt(TemperatureConversion.convertKtoC(Json.getFloatFromJsonPath(resp, "main.temp")))  > 0);
        assertion.assertTrue( Integer.parseInt(TemperatureConversion.convertKtoF(Json.getFloatFromJsonPath(resp, "main.temp")))  > 32);
        assertion.assertTrue( (Json.getStringFromJsonPath(resp, "name")).toLowerCase().equals(city));
    }

}