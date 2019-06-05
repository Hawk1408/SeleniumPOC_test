import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PetStoreStroreAPI {
    String url = "https://petstore.swagger.io";

    @Test(groups = {"perorder", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorretInventory() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        get("/v2/store/inventory").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
    @Test(groups = {"perorder", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorret() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        body("{\n" +
                                "  \"id\": 0,\n" +
                                "  \"petId\": 0,\n" +
                                "  \"quantity\": 0,\n" +
                                "  \"shipDate\": \"2019-06-04T06:28:00.665Z\",\n" +
                                "  \"status\": \"placed\",\n" +
                                "  \"complete\": false\n" +
                                "}").
                        post("/v2/store/order").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
    @Test(groups = {"perorder", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorretInventoryOrder() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        get("/v2/store/order/12345").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
    @Test(groups = {"perorder", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorretInventoryDelete() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        delete("/v2/store/order/12345").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
}
