package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreatAccountPage extends Utility {
    public CreatAccountPage() {
        PageFactory.initElements(driver, this);
    }
  //  All the fields locators and create appropriate method for it.
    @FindBy(xpath ="//input[@id='id_gender1']")
    WebElement titleRadioButton;
    @FindBy(xpath="//input[@id='customer_firstname']")
    WebElement firstNameField ;
  @FindBy(xpath="//input[@id='customer_lastname']")
    WebElement lastNameField;
  @FindBy(xpath="//input[@id='email']")
    WebElement emailField;
  @FindBy(xpath="//input[@id='passwd']")
    WebElement passwordField;
  @FindBy(xpath="//select[@id='days']")
    WebElement dayOfBirth;
  @FindBy(xpath="//select[@id='months']")
    WebElement monthOfBirth;
  @FindBy(xpath="//select[@id='years']")
    WebElement yearOfBirth;
    @FindBy(xpath="//input[@id='newsletter']")
    WebElement newslettersCheckBox ;
    @FindBy(xpath="//input[@id='optin']")
    WebElement speicalOffersCheckBox;
    @FindBy(xpath="//input[@id='firstname']")
    WebElement addressFirstName;
    @FindBy(xpath="//input[@id='lastname']")
    WebElement addressLastName;
    @FindBy(xpath="//input[@id='company']")
    WebElement addressCompany;
    @FindBy(xpath="//input[@id='address1']")
    WebElement address1;
    @FindBy(xpath="//input[@id='address2']")
    WebElement address2;
    @FindBy(xpath="//input[@id='city']")
    WebElement city;
    @FindBy(xpath="//select[@id='id_state']")
    WebElement state;
    @FindBy(xpath="//input[@id='postcode']")
    WebElement postcode;
    @FindBy(xpath="//select[@id='id_country']")
    WebElement country;
    @FindBy(xpath="//textarea[@id='other']")
    WebElement additionalInformation;
    @FindBy(xpath="//input[@id='phone']")
    WebElement phoneNumber;
    @FindBy(xpath="//input[@id='phone_mobile']")
    WebElement mobilePhone;
    @FindBy(xpath="//input[@id='alias']")
    WebElement assignAnAddress;
    @FindBy(xpath="//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement register;

    public void clickOnTitleButton(){
        clickOnElement(titleRadioButton);
    }
    public void enterFirstNameField(String text){
        Reporter.log("Enter FirstNameField"+text+ " to email field "+emailField.toString() + "<br>");
        sendTextToElement(firstNameField,text);
    }
    public void enterLastNameField(String text){
        Reporter.log("Enter email"+text+ " to email field "+emailField.toString() + "<br>");
        sendTextToElement(lastNameField,text);
    }
    public void enterEmailField(String text){
        Reporter.log("Enter email"+text+ " to email field "+emailField.toString() + "<br>");
        sendTextToElement(emailField,text);
    }
    public void enterPasswordField(String text){
        Reporter.log("Enter email"+text+ " to email field "+emailField.toString() + "<br>");
        sendTextToElement(passwordField,text);
    }
    public void clickOnDays(String text){
        Reporter.log("Selecting Days"+ text+" from dropdown "+dayOfBirth.toString() + "<br>");

        selectByValueFromDropDown(dayOfBirth,text);
         }
         public void clickOnMoth(String text){

             Reporter.log("Selecting Moth"+text+" from dropdown "+monthOfBirth.toString() + "<br>");
             selectByValueFromDropDown(monthOfBirth,text);
         }
     public void clickOnYear(String text){
         Reporter.log("Selecting Year"+text+" from dropdown "+yearOfBirth.toString() + "<br>");
        selectByValueFromDropDown(yearOfBirth,text);
     }
     public void clickOnNewsLettersField(){
         Reporter.log("Clicking on NewsLettersField"+ newslettersCheckBox.toString()+ "<br>");
        clickOnElement(newslettersCheckBox);
     }
     public void clickOnSpecialOffers(){
         Reporter.log("Clicking on SpecialOffers"+ speicalOffersCheckBox.toString()+ "<br>");
        clickOnElement(speicalOffersCheckBox);
     }
     public void enterAddressFirstName(String text){
         Reporter.log("Enter AddressFirstName"+text+ " to AddressFirstName field "+addressFirstName.toString() + "<br>");
        sendTextToElement(addressFirstName,text);
     }
     public void enterAddressLastName(String text){
         Reporter.log("Enter AddressLastName"+text+ " to AddressLastName field "+addressLastName.toString() + "<br>");
        sendTextToElement(addressLastName,text);
     }
     public void enterAddressCompany(String text){
         Reporter.log("Enter AddressCompany"+text+ " to AddressCompany field "+addressCompany.toString() + "<br>");
        sendTextToElement(addressCompany,text);
         }
         public void enterAddress1(String text){
             Reporter.log("Enter Address1"+text+ " to Address1 field "+address1.toString() + "<br>");
        sendTextToElement(address1,text);
         }
         public void enterAddress2(String text){
             Reporter.log("Enter Address2"+text+ " to Address2 field "+address2.toString() + "<br>");
        sendTextToElement(address2,text);
         }
         public void enterCity(String text){
             Reporter.log("EnterCity"+text+ " to City field "+city.toString() + "<br>");
        sendTextToElement(city,text);
         }
         public void clickOnState(String text){
             Reporter.log("Selecting State"+text+" from dropdown "+state.toString() + "<br>");
        selectByValueFromDropDown(state,text);
         }
         public void enterPostcode(String text){
             Reporter.log("Enter Postcode"+text+ " to Postcode field "+postcode.toString() + "<br>");
        sendTextToElement(postcode,text);
         }
         public void clickOnCountry(String text){
             Reporter.log("Selecting Country"+text+" from dropdown "+country.toString() + "<br>");
        selectByValueFromDropDown(country,text);
         }
         public void enterAdditionalInformation(String text){
             Reporter.log("Enter AdditionalInformation"+text+ " to AdditionalInformation field "+additionalInformation.toString() + "<br>");
        sendTextToElement(additionalInformation,text);
         }
         public void enterHomePhone(String text){
             Reporter.log("Enter HomePhone"+text+ " to HomePhone field "+phoneNumber.toString() + "<br>");
        sendTextToElement(phoneNumber,text);
         }
         public void enterMobilePhone(String text) {
             Reporter.log("Enter MobilePhone"+text+ " to MobilePhone field "+mobilePhone.toString() + "<br>");
        sendTextToElement(mobilePhone, text);
         }
         public void enterAssignAnAddress(String text){
             Reporter.log("Enter AssignAnAddress"+text+ " AssignAnAddress field "+additionalInformation.toString() + "<br>");
        sendTextToElement(additionalInformation,text);
         }
         public void clickOnRegister(){
             Reporter.log("Clicking on Register"+ register.toString()+ "<br>");
        clickOnElement(register);
         }

}
