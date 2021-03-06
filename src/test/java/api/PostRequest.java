package api;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostRequest {

  //Array in Array

  /*  {
    "firstName": "John",
    "lastName": "Smith",
    "middleName": "Smith",
    "email": "john.smith@example.com",
    "phones": [
    {
      "number": "+380976543311", // смотреть сюда
      "number": "+380976543312"
    }
  ],
    "carsNumbers": [
    {
      "number": "AI000000",
      "number": "AI000001"
    }
  ],
    "status": "active",
          "note": "string"
  }*/

  @Test
  public void testPostRequest() {
    //Specify base URI
    RestAssured.baseURI = "https://shell-b2b.test.aurocraft.com/api/v1";

    //Request object
    RequestSpecification httpsRequest = RestAssured.given();

    //Request body sending along with post request
    //ArrayList in Request
    JSONObject phoneNumber = new JSONObject();
    phoneNumber.put("number", "+380987165555");
    phoneNumber.put("number", "+380987165551");
    JSONArray ja = new JSONArray();
    ja.add(phoneNumber);

    JSONObject carNumber = new JSONObject();
    carNumber.put("number", "carsNumber");
    carNumber.put("number", "AA12345HH");
    JSONArray carNumbers = new JSONArray();
    carNumbers.add(carNumber);

    JSONObject requestParam = new JSONObject();
    requestParam.put("firstName", "firstName");
    requestParam.put("lastName", "lastName");
    requestParam.put("middleName", "middleName");
    requestParam.put("email", "test@test.test");
    requestParam.put("phones", ja);
    requestParam.put("carsNumbers", carNumbers);
    requestParam.put("status", "status");
    requestParam.put("note", "note");

    EncoderConfig.encoderConfig().encodeContentTypeAs("charset=utf-8", ContentType.TEXT);
    httpsRequest.header("Content-Type", "application/json");
    httpsRequest.body(requestParam.toJSONString()); //attach above data to request

    //Response object
    Response response = httpsRequest.request(Method.POST, "/drivers/create");

    //Print response in console window
    String responseBody = response.getBody().asString();
    System.out.println("Response Body is: " + responseBody);
    Assert.assertEquals(responseBody.contains("firstName"), true);

    //Status code validation
    int statusCode = response.getStatusCode();
    System.out.println("Status Code is: " + statusCode);
    Assert.assertEquals(statusCode, 200);

    //Success code validation
    String successCode = response.jsonPath().get("SuccessCode");
    Assert.assertEquals(successCode, "OPERATION_SUCCESS");

    // Delete after test
    String id = response.jsonPath().get("id");
    Response responseForDelete = httpsRequest.request(Method.POST, "/drivers/delete/" + id);
  }


  // Object in Array
/*  {
    "items": [
    {
      "id": "550e8400-e29b-41d4-a716-446655440000", // смотреть сюда
            "volume": 100
    }
  ]
  }*/

  @Test
  public void testSuppliesSendPostWithActualDataReturn200() {
    //Specify base URI
    RestAssured.baseURI = "https://shell-b2b.test.aurocraft.com/api/v1";

    //Request object
    RequestSpecification httpsRequest = RestAssured.given();

    String id = "38b6cc1c-e323-4f53-b052-fb5b5e731ae7";
    String volume = "300";

    JSONObject itemsBody = new JSONObject();
    itemsBody.put("id", id);
    itemsBody.put("volume", volume);

    JSONArray items = new JSONArray();
    items.add(itemsBody);

    JSONObject requestParam = new JSONObject();
    requestParam.put("items", items);

    EncoderConfig.encoderConfig().encodeContentTypeAs("charset=utf-8", ContentType.TEXT);
    httpsRequest.header("Content-Type", "application/json");
    httpsRequest.body(requestParam.toJSONString());

    Response responseCreateFormAmount = httpsRequest.request(Method.POST, "/invoice/supplies");

    String responseBody = responseCreateFormAmount.getBody().asString();
    System.out.println("Response Body is: " + responseBody);

    int statusCode = responseCreateFormAmount.getStatusCode();
    System.out.println("Status Code is: " + statusCode);
    Assert.assertEquals(statusCode, 200);
  }
}
