package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;


public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {

    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {

    }


    @Given("the user login as {string}")
    public void the_user_login_as(String usertype) {

        BrowserUtils.waitFor(5);

        LoginPage loginPage= new LoginPage();

        if(usertype== "driver"){
          //loginPage.login(ConfigurationReader.get("driver_username"), ConfigurationReader.get("driver_password"));
            loginPage.userName.sendKeys("driver_username");
            loginPage.password.sendKeys("driver_password");
            loginPage.
        }else if (usertype=="storemanager"){
            loginPage.login(ConfigurationReader.get("store_manager_username"), ConfigurationReader.get("store_manager_password"));
        }else if ((usertype=="salesmanager")){
            loginPage.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
        }

        }


    }


