package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;


public class LoginStepDefs {

    private String usertype = "driver";


    @Given("the user is on the login page")
        public void the_user_is_on_the_login_page() throws InterruptedException {
            String url = ConfigurationReader.get("url");
            //WebDriver driver = Driver.get();
            Driver.get().get(url);

        }
    @When("the user login as described {string}")
    public void theUserLoginAsDescribed(String arg0) {

        BrowserUtils.waitFor(3);

        LoginPage loginPage = new LoginPage();

        if (usertype == "driver") {

            loginPage.login(ConfigurationReader.get("driver_username"), ConfigurationReader.get("driver_password"));

        } else if (usertype == "storemanager") {
            loginPage.login(ConfigurationReader.get("store_manager_username"), ConfigurationReader.get("store_manager_password"));
        } else if ((usertype == "salesmanager")) {
            loginPage.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
        }

    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}


