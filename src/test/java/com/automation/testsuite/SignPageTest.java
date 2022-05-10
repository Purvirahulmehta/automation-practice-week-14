package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import com.google.common.base.Verify;
import org.omg.CORBA.DynAnyPackage.Invalid;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;
import sun.security.util.Password;

public class SignPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    ProductPage productPage;
    CreatAccountPage creatAccountPage;
    WomenCategoryPage womenCategoryPage;
    SignOut signOut;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        productPage = new ProductPage();
        creatAccountPage= new CreatAccountPage();
        womenCategoryPage = new WomenCategoryPage();
        signOut=new SignOut();

    }
    @Test(groups = {"sanity","smoke","regression"})
    public void userShouldNavigateToSignInPageSuccessFully(){
        SoftAssert softAssert=new SoftAssert();
        signInPage.clickOnSignInButton();
                softAssert.assertEquals(signInPage.getAuthentication(),"Authentication","Authentication is not valid");
        softAssert.assertAll();
    }
    @Test(dataProvider = "credentials",dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,String message) {
        SoftAssert softAssert = new SoftAssert();
        signInPage.clickOnSignInButton();
        signInPage.loginToApplication(password, password);
        // softAssert.assertEquals(signInPage.clickOnErrorMessage(),message,"Page is not displayed with error");
        softAssert.assertEquals(signInPage.getOnErrorMessage(),message,"Page is not displayed");
        softAssert.assertAll();
    }
    @Test(groups = {"regression"})
        public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
            SoftAssert softAssert = new SoftAssert();
            signInPage.enterEmailField("Prime456@gmail.com");
            signInPage.enterPasswordField("prime456");
            signInPage.clickOnSignInButton();
            signOut.getOnSignOut();
            softAssert.assertEquals(signOut.getOnSignOut(), "Page is not found");
            softAssert.assertAll();
        }
    @Test(groups = {"regression"})
        public void verifyThatUserShouldLogOutSuccessFully(){
          SoftAssert softAssert = new SoftAssert();
           signInPage.enterEmailField("Prime456@gmail.com");
          signInPage.enterPasswordField("prime456");
          signInPage.clickOnSignInButton();
          signOut.getOnSignOut();
          signInPage.clickOnSignInButton();
          softAssert.assertEquals(signInPage.clickOnSignInButton(),"sign in page is not on displayed");
          softAssert.assertAll();

    }

}
