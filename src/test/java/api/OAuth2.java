package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class OAuth2 {
  @Test
  public void testOAuth2(){

    //Authorization with Bearer token
    Response authResponse = RestAssured.given()
            .baseUri("https://shell-b2b.test.aurocraft.com/api/v1")
            .basePath("/oauth")
            .contentType(ContentType.JSON)
            .body("{\n" +
                    "  \"username\": \"johndou\",\n" +
                    "  \"password\": \"111\"\n" +
                    "}")
            .when().post()
            .then()
            .statusCode(200)
            .extract()
            .response();
    authResponse.getBody().print();
  }

//Использование токена в тесте
  private static Response authResponse = RestAssured.given()
          .baseUri("https://shell-b2b.test.aurocraft.com/api")
          .basePath("/v1/oauth")
          .contentType(ContentType.JSON)
          .body("{\n" +
                  "  \"username\": \"johndou\",\n" +
                  "  \"password\": \"111\"\n" +
                  "}")
          .when().post()
          .then()
          .statusCode(200)
          .extract()
          .response();
  String token = authResponse.jsonPath().get("token");

  @Test
  public void testGetFuelSearch() {
    RestAssured.baseURI = "https://shell-b2b.test.aurocraft.com/api/v1";
    RequestSpecification httpRequest = RestAssured.given().log().all().auth().oauth2(token);
    //тело теста
  }
}
