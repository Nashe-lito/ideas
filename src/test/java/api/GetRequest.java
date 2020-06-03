package api;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetRequest {

  @Test
  public void testGetRequest() {
    //Specify base URI
    RestAssured.baseURI = "https://shell-b2b.test.aurocraft.com/api/v1";

    //Request object
    RequestSpecification httpsRequest = RestAssured.given();

    //Response object
    Response response = httpsRequest.request(Method.GET, "/company/dashboard");

    //Print response in console window
    String responseBody = response.getBody().asString();
    System.out.println("Response Body is: " + responseBody);

    Assert.assertEquals(responseBody.contains("Text"), true);

    //Status code validation
    int statusCode = response.getStatusCode();
    System.out.println("Status Code is: " + statusCode);
    Assert.assertEquals(statusCode, 200);

    //Status line validation
    String statusLine = response.statusLine();
    System.out.println("Status line is: " + statusLine);
    Assert.assertEquals(statusLine, "Https/1.1 200 OK");

    //Validating headers
    String contentType = response.header("Content-Type"); //Capture details of Content-Type header
    System.out.println("Content type is: " + contentType);
    Assert.assertEquals(contentType, "application/xml, charset=UTF-8");

    String contentEncoding = response.header("Content-Type"); //Capture details of ContentEncoding header
    System.out.println("contentEncoding is: " + contentEncoding);
    Assert.assertEquals(contentEncoding, "application/xml, charset=UTF-8");

    Headers allheaders = response.headers(); // Capture all the headers from response
    for (Header header:allheaders)
    {
      System.out.println(header.getName() + "   " + header.getValue());
    }

    JsonPath jsonpath = response.jsonPath();
    System.out.println(String.valueOf(jsonpath.get("username")));
    System.out.println(String.valueOf(jsonpath.get("middlename")));
    System.out.println(String.valueOf(jsonpath.get("tel")));

    Assert.assertEquals(jsonpath.get("username"), "johndou");
  }
}
