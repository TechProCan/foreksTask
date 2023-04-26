package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ElementHelper;


public class OneCikanVarantlarPage {
    ElementHelper elementHelper;

    By OneCikanVarantlarPageTitle = By.id("foreks.android:id/layoutForeksToolbar_textView_title");
    By TopTabs = By.id("foreks.android:id/layoutSymbolDetailTab_textView");
    By YukAlis = By.id("foreks.android:id/rowWarrantSymbolList_textView_column3");


    public OneCikanVarantlarPage(WebDriver driver){
        this.elementHelper=new ElementHelper(driver);
    }

    public void check_OneCikanVarantlarPage_Title(){
        elementHelper.checkElement(OneCikanVarantlarPageTitle);
    }
    public void clickYukselenler(){
        elementHelper.clickElementWithText(TopTabs,"YÜKSELENLER");
    }

    public void checkOrderYukselen(){
        elementHelper.CompareDescList(YukAlis);
    }
    public void clickDusenler(){
        elementHelper.clickElementWithText(TopTabs,"DÜŞENLER");
    }

    public void checkOrderDusenler(){
        elementHelper.CompareDescList(YukAlis);
    }


}
