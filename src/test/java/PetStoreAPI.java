import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static io.restassured.RestAssured.post;
import static io.restassured.RestAssured.when;

public class PetStoreAPI {
    private static Assertion assertion = new Assertion();
    String url = "https://petstore.swagger.io";
    @Test(groups = {"petstore", "petALL"})
    public  void test_ResponseHeaderData_ShouldBeCorrect() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        body("{\"id\":0,\"category\":{\"id\":0,\"name\":\"string\"},\"name\":\"doggie\",\"photoUrls\":[\"string\"],\"tags\":[{\"id\":0,\"name\":\"string\"}],\"status\":\"available\"}").
                        post("/v2/pet").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());

}
        @Test(groups = {"petstore", "petALL"})
        public void test_ResponseHeaderData_ShouldBeCorrectPUT() {
            RestAssured.baseURI = url;
            Response response =
                    RestAssured.given().
                            when().header("Content-Type", "application/json").
                            body("{\n" +
                                    "  \"id\": 0,\n" +
                                    "  \"category\": {\n" +
                                    "    \"id\": 0,\n" +
                                    "    \"name\": \"string\"\n" +
                                    "  },\n" +
                                    "  \"name\": \"doggie\",\n" +
                                    "  \"photoUrls\": [\n" +
                                    "    \"string\"\n" +
                                    "  ],\n" +
                                    "  \"tags\": [\n" +
                                    "    {\n" +
                                    "      \"id\": 0,\n" +
                                    "      \"name\": \"string\"\n" +
                                    "    }\n" +
                                    "  ],\n" +
                                    "  \"status\": \"available\"\n" +
                                    "}").
                            put("/v2/pet").
                            thenReturn();
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody().prettyPrint());

        }

    @Test(groups = {"petstore", "petALL"})
    public void test_ResponseHeaderData_ShouldBeCorrectGET() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        get("/v2/pet/findByStatus").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());
        //assertion.assertTrue(response.getStatusCode() == 200);
//        assertion.assertFalse(response.getStatusCode() == 400);

    }
    @Test(groups = {"petstore", "petALL"})
    public  void test_ResponseHeaderData_ShouldBeCorrectGETPet() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        body("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                                "<Pet>\n" +
                                "\t<id>0</id>\n" +
                                "\t<Category>\n" +
                                "\t\t<id>0</id>\n" +
                                "\t\t<name>string</name>\n" +
                                "\t</Category>\n" +
                                "\t<name>doggie</name>\n" +
                                "\t<photoUrl>\n" +
                                "\t\t<photoUrl>string</photoUrl>\n" +
                                "\t</photoUrl>\n" +
                                "\t<tag>\n" +
                                "\t\t<Tag>\n" +
                                "\t\t\t<id>0</id>\n" +
                                "\t\t\t<name>string</name>\n" +
                                "\t\t</Tag>\n" +
                                "\t</tag>\n" +
                                "\t<status>available</status>\n" +
                                "</Pet>").
                        get("/v2/pet/12345").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());

    }
    @Test(groups = {"petstore", "petALL"})
    public  void test_ResponseHeaderData_ShouldBeCorrectGETPetPost() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        post("/v2/pet/12345").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());

    }

    @Test(groups = {"petstore", "petALL"})
    public  void test_ResponseHeaderData_ShouldBeCorrectGETPetDelete() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        delete("/v2/pet/12345").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());

    }
    @Test(groups = {"petstore", "petALL"})
    public  void test_ResponseHeaderData_ShouldBeCorrectGETPetPostPet() {
        RestAssured.baseURI = url;
        Response response =
                RestAssured.given().
                        when().header("Content-Type", "application/json").
                        post("/v2/pet/12345/uploadImage").
                        thenReturn();
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody().prettyPrint());

    }


    }