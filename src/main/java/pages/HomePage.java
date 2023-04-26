package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {
    ElementHelper elementHelper;
By kapatButton=By.id("foreks.android:id/activityTutorial_textView_close");
By title =By.id("foreks.android:id/layoutForeksToolbar_textView_title");
By varantTabButton =By.xpath("//android.widget.TextView[@content-desc=\"Varant\"]");

    public HomePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void checkHomePage() {
        elementHelper.click(kapatButton);
        elementHelper.checkElement(title);
    }

    public void clickVarantTab(){
        elementHelper.click(varantTabButton);
    }

}
