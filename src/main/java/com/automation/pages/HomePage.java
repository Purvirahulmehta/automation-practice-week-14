package com.automation.pages;

import com.automation.utility.Utility;
import com.github.dockerjava.api.model.Links;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
//    1.HomePage -
//    WOMEN, DRESSES, T-SHIRTS and Sign in Links and logo locatores
//    and create appropriate methods for it.
    @FindBy(xpath="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womenTab;
    @FindBy(xpath ="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement dressesTab;
    @FindBy(xpath ="//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tshirtsTab;
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement singInTab;
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement logoTab;


    public String clickOnWomenTab() {
        Reporter.log("getting WomenTab text from "+womenTab.toString()+"<br>");
        return getTextFromElement(womenTab);
    }
    public void clickOnDressesTab(){
        Reporter.log("Clicking on DressesTab"+ dressesTab.toString()+ "<br>");
        clickOnElement(dressesTab);
    }
    public void clickOnTshirtTab(){
        Reporter.log("Clicking onTshirtTab"+ tshirtsTab.toString()+ "<br>");
        clickOnElement(tshirtsTab);
    }
    public void clickOnDressesInTab(){
        Reporter.log("Clicking on DressesInTab"+ dressesTab.toString()+ "<br>");
        clickOnElement(dressesTab);
    }
    public void clickOnLogoTab(){
        Reporter.log("Clicking on LogoTab"+ logoTab.toString()+ "<br>");
        clickOnElement(logoTab);
    }

}
