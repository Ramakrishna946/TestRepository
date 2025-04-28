package com.practice.stepdefinitions;



import io.cucumber.java.en.*;

public class SearchSteps {

    @Given("User is on the Home Page")
    public void user_is_on_the_home_page() {
        System.out.println("User navigated to Home Page");
    }

    @When("User searches for {string}")
    public void user_searches_for(String productName) {
        System.out.println("Searching for product: " + productName);
    }

    @Then("Product results for {string} are shown")
    public void product_results_for_are_shown(String productName) {
        System.out.println("Results shown for: " + productName);
    }
}

