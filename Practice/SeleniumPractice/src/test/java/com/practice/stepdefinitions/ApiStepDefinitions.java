package com.practice.stepdefinitions;

import static org.junit.Assert.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.cucumber.java.en.*;

public class ApiStepDefinitions {

    Response response; // Correct import

    @Given("the API endpoint {string} is available")
    public void the_api_endpoint_is_available(String url) {
        RestAssured.baseURI = url;
    }

    @When("I send a GET request to the API")
    public void i_send_a_get_request_to_the_api() {
        response = RestAssured.get(); // No casting needed
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer expectedStatusCode) {
        assertEquals(expectedStatusCode.intValue(), response.getStatusCode());
    }

    @Then("the {string} field should be {string}")
    public void the_field_should_be(String fieldName, String expectedValue) {
        String actualValue = response.jsonPath().getString(fieldName); // No casting
        assertEquals(expectedValue, actualValue);
    }
}
