package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    ProductPage productPage;
    CreatAccountPage creatAccountPage;
    WomenCategoryPage womenCategoryPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        productPage = new ProductPage();
        creatAccountPage = new CreatAccountPage();
        womenCategoryPage = new WomenCategoryPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully(){
        SoftAssert softAssert=new SoftAssert();
        homePage.clickOnWomenTab();
        Assert.assertEquals(homePage.clickOnWomenTab(),"Page is not in displayed");
        softAssert.assertAll();
    }
    @Test(dataProvider = "productchoice",dataProviderClass = TestData.class,groups = {"smoke","regression"})
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String
            size, String colour) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        //  Assert.assertEquals();

        homePage.clickOnWomenTab();
        //womenCategoryPage.clickOnProduct();
        womenCategoryPage.selectProduct(product);

        productPage.clearQuantity();
        productPage.enterQuantity(qty);
        productPage.selectSize(size);
        productPage.selectColour(colour);
        Thread.sleep(2000);
        productPage.clickOnAddToCart();
        softAssert.assertEquals(productPage.verifyProductAddedToCartMessage(), "Product successfully added to your shopping cart", "");
        productPage.clickOnCloseButton();

        productPage.clickOnAddToCart();


    }
    }

