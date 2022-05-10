package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import com.google.common.base.Verify;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreatAccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    ProductPage productPage;
    CreatAccountPage creatAccountPage;
    WomenCategoryPage womenCategoryPage;
    MyAccount myAccount;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        productPage = new ProductPage();
        creatAccountPage = new CreatAccountPage();
        womenCategoryPage = new WomenCategoryPage();
        myAccount=new MyAccount();

    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(myAccount.myAccountText(),"My Account page is not in displayed");
        signInPage.clickOnCreateAnAccountButton();
        creatAccountPage.clickOnTitleButton();
        creatAccountPage.enterFirstNameField("Prime");
        creatAccountPage.enterLastNameField("Testing");
        creatAccountPage.enterEmailField("Prime456@gmail.com");
        creatAccountPage.enterPasswordField("primetesting456");
        creatAccountPage.clickOnDays("10");
        creatAccountPage.clickOnMoth("May");
        creatAccountPage.clickOnYear("1983");
        creatAccountPage.clickOnNewsLettersField();
        creatAccountPage.clickOnSpecialOffers();
        creatAccountPage.enterAddressFirstName("Prime");
        creatAccountPage.enterAddressLastName("Testing");
        creatAccountPage.enterAddressCompany("Prime Testing");
        creatAccountPage.enterAddress1("10 Downing Street");
        creatAccountPage.enterAddress2("Downing Street");
        creatAccountPage.enterCity("New York");
        creatAccountPage.clickOnState("Arizona");
        creatAccountPage.enterPostcode("55556");
        creatAccountPage.clickOnCountry("United States");
        creatAccountPage.enterAdditionalInformation("All is Well");
        creatAccountPage.enterHomePhone("9865021533");
        creatAccountPage.enterMobilePhone("2345678912");
        creatAccountPage.enterAssignAnAddress("As above");
        creatAccountPage.clickOnRegister();
        myAccount.myAccountText();

    }

}
