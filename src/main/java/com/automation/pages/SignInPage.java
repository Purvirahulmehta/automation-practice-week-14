package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    //    Email address, Password, Sign In Button Create an account button and "AUTHENTICATION" text, "CREATE AN ACCOUNT" text Locators
//and create appropriate methods for it.
//"AUTHENTICATION" text, "CREATE AN ACCOUNT" text Locators
//and create appropriate methods for it.
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInTab;
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signinButton;
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createAnAccountButton;
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createAnAccountText;
    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    WebElement errorMessage;
//    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
//    WebElement signOut;


    public void enterEmailField(String email) {
        Reporter.log("Enter email " + email + " to email field " + emailField.toString());//for testng report
        sendTextToElement(emailField, email);

    }

    public void enterPasswordField(String password) {
        Reporter.log("Enter PasswordField"+password+ " to email field "+password.toString() + "<br>");
        sendTextToElement(passwordField,password);
    }

    public String clickOnSignInButton() {
        Reporter.log("getting SignInButton text from "+signinButton.toString()+"<br>");
        return getTextFromElement(signinButton);
    }

    public void clickOnCreateAnAccountButton() {
        Reporter.log("Clicking on CreateAnAccountButton"+ createAnAccountText.toString()+ "<br>");
        clickOnElement(createAnAccountButton);
    }

    public String getAuthentication() {
        Reporter.log("getting Authentication text from "+authenticationText.toString()+"<br>");
       return getTextFromElement(authenticationText);
    }

    public String setCreateAnAccount() {
        Reporter.log("getting CreateAnAccount text from "+createAnAccountText.toString()+"<br>");
       return getTextFromElement(createAnAccountButton);
    }
    public String getOnErrorMessage(){
        Reporter.log("getting ErrorMessage text from "+errorMessage.toString()+"<br>");
        return getTextFromElement(errorMessage);
    }


    public void loginToApplication(String email,String password){
        enterEmailField(email);
        enterPasswordField(password);
        clickOnSignInButton();
    }
    public void sinInToApplication(String username, String password) {
        enterEmailField(username);
        enterPasswordField(password);

        clickOnSignInButton();
    }

}





