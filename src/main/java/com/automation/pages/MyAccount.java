package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class MyAccount extends Utility {
    public MyAccount() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myAccount;

    public String myAccountText(){
        Reporter.log("getting AccountText from "+myAccount.toString()+"<br>");
        return getTextFromElement(myAccount);
    }

}
