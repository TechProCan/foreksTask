package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OneCikanVarantlarPage;
import utils.DriverManager;

public class OneCikanVarantlarSteps {

    OneCikanVarantlarPage oneCikanVarantlarPage=new OneCikanVarantlarPage(DriverManager.getDriver());
    @Then("user check OneCikan Varantlar Page")
    public void userCheckOneCikanVarantlarPage() {
        oneCikanVarantlarPage.check_OneCikanVarantlarPage_Title();
    }

    @And("user click Yukselenler Tab")
    public void userClickYukselenlerTab() {
        oneCikanVarantlarPage.clickYukselenler();

    }

    @When("user check Yukselen Order")
    public void userCheckYukselenOrder() {
        oneCikanVarantlarPage.checkOrderYukselen();
    }
    @And("user click Dusenler Tab")
    public void userClickDusenlerTab() {
oneCikanVarantlarPage.clickDusenler();
    }

    @When("user check Dusenler Order")
    public void userCheckDusenlerOrder() {
        oneCikanVarantlarPage.checkOrderDusenler();
    }
}
