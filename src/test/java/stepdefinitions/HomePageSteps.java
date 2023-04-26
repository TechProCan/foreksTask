package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverManager;

public class HomePageSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver());

    @Given("user should see the Home Page")
    public void user_should_see_the_categories_page() {
    homePage.checkHomePage();
    }


    @When("user cliclk Varant Tab")
    public void userCliclkVarantTab() {
        homePage.clickVarantTab();
    }


}
