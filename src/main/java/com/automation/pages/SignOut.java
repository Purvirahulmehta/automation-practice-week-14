package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignOut extends Utility {
    public SignOut() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    WebElement signOut;
    public String getOnSignOut(){
        Reporter.log("getting SignOut text from "+signOut.toString()+"<br>");
        return getTextFromElement(signOut);
    }
}
