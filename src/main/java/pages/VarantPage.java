package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class VarantPage {
    ElementHelper elementHelper;

    By varantTitle = By.id("foreks.android:id/layoutForeksToolbar_textView_title");
    By OneCikanvarantlarButton = By.xpath("//android.widget.TextView[@content-desc=\"Yükselen, Düşen ve İşlem Görenler\"]");





    public VarantPage(WebDriver driver){
        this.elementHelper=new ElementHelper(driver);
    }
    public void Check_VarantPageTitle(){
        elementHelper.checkElement(varantTitle);
    }
    public void click_OneCikanVarantlarButton(){
        elementHelper.click(OneCikanvarantlarButton);
    }
}
