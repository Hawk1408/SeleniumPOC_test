import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PetStoreUserAPI {
    String url = "https://petstore.swagger.io";

    @Test(groups = {"peruser", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorrect() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        body("{\n" +
                                "  \"id\": 0,\n" +
                                "  \"username\": \"string\",\n" +
                                "  \"firstName\": \"string\",\n" +
                                "  \"lastName\": \"string\",\n" +
                                "  \"email\": \"string\",\n" +
                                "  \"password\": \"string\",\n" +
                                "  \"phone\": \"string\",\n" +
                                "  \"userStatus\": 0\n" +
                                "}").
                        post("/v2/user").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
    @Test(groups = {"peruser", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorrectArray() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        body("[\n" +
                                "  {\n" +
                                "    \"id\": 0,\n" +
                                "    \"username\": \"string\",\n" +
                                "    \"firstName\": \"string\",\n" +
                                "    \"lastName\": \"string\",\n" +
                                "    \"email\": \"string\",\n" +
                                "    \"password\": \"string\",\n" +
                                "    \"phone\": \"string\",\n" +
                                "    \"userStatus\": 0\n" +
                                "  }\n" +
                                "]").
                        post("/v2/user/createWithArray").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
    @Test(groups = {"peruser", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorrectList() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        body("[\n" +
                                "  {\n" +
                                "    \"id\": 0,\n" +
                                "    \"username\": \"string\",\n" +
                                "    \"firstName\": \"string\",\n" +
                                "    \"lastName\": \"string\",\n" +
                                "    \"email\": \"string\",\n" +
                                "    \"password\": \"string\",\n" +
                                "    \"phone\": \"string\",\n" +
                                "    \"userStatus\": 0\n" +
                                "  }\n" +
                                "]").
                        post("/v2/user/createWithList").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
    @Test(groups = {"peruser", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorrectLogin() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json") .
                        get("/v2/user/login").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
    @Test(groups = {"peruser", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorrectLogOut() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json") .
                        get("/v2/user/logout").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
    @Test(groups = {"peruser", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorrectUseName() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json") .
                        get("/v2/user/12345").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
    @Test(groups = {"peruser", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorrectUseNamePut() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json") .
                        body("{\n" +
                                "  \"id\": 0,\n" +
                                "  \"username\": \"string\",\n" +
                                "  \"firstName\": \"string\",\n" +
                                "  \"lastName\": \"string\",\n" +
                                "  \"email\": \"string\",\n" +
                                "  \"password\": \"string\",\n" +
                                "  \"phone\": \"string\",\n" +
                                "  \"userStatus\": 0\n" +
                                "}").
                        put("/v2/user/12345").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
    @Test(groups = {"peruser", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorrectDelete() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        put("/v2/user/12345").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
    }
}

