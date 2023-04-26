package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.VarantPage;
import utils.DriverManager;

public class VarantPageSteps {
    VarantPage varantPage=new VarantPage(DriverManager.getDriver());



    @And("user should see the Varant Page")
    public void userShouldSeeTheVarantPage() {
       varantPage.Check_VarantPageTitle();
    }

    @And("user click OneCikan Varantlar")
    public void userClickOneCikanVarantlar() {
        varantPage.click_OneCikanVarantlarButton();
    }



}
