package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WomenCategoryPage extends Utility {
    public WomenCategoryPage(){
        PageFactory.initElements(driver,this);
    }
//    WOMEN text, TOPS and DRESSES links, SortBy drop down, ProductsList Locators
//    and create appropriate methods for it.
    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement womenText;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement topsLink;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement dressesLink;
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortByDropDown;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[3]/div[1]/ul[1]/li[3]/a[1]/i[1]")
    WebElement productListViewButton;
    @FindBy(xpath = "//div[@class='product-container']")
    WebElement verifyProducts;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
    WebElement blouse;
    @FindBy(xpath = "//h1[contains(text(),'Printed Dress')]")
    WebElement printedDress;
    @FindBy(xpath = "//h1[contains(text(),'Printed Chiffon Dress')]")
    WebElement chiffonPrintedDress;
    @FindBy(xpath = "//h1[contains(text(),'Printed Summer Dress')]")
    WebElement summerDress;

    public void selectProduct(String text){

        if(text == "Blouse") {
            Reporter.log("Clicking on Blouse " + blouse.toString());
            clickOnElement(blouse);
        }

        if(text == "Printed Dress") {
            Reporter.log("Clicking on Printed Dress " + printedDress.toString());
            clickOnElement(printedDress);
        }
        if(text == "Printed Chiffon Dress") {
            Reporter.log("Clicking on Printed Chiffon Dress " + chiffonPrintedDress.toString());
            clickOnElement(chiffonPrintedDress);
        }
        if(text == "Printed Summer Dress with Price $28.98") {
            Reporter.log("Clicking on Printed Summer Dress with Price tag $28.98 " + summerDress.toString());
            clickOnElement(summerDress);
        }
    }

    public String getWomenText(){
        Reporter.log("getting WomenText from "+womenText.toString()+"<br>");
        return getTextFromElement(womenText);
    }
    public void clickOntopsLink(){
        Reporter.log("Clicking on topsLink"+ topsLink.toString()+ "<br>");
        clickOnElement(topsLink);
    }
    public void clickOnDressesLink(){
        Reporter.log("Clicking on DressesLink"+ dressesLink.toString()+ "<br>");
        clickOnElement(dressesLink);
    }
    public void clickOnSortByDropDown(String text){

        Reporter.log("Selecting SortByDropDown"+text+" from dropdown "+sortByDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(sortByDropDown,text);
    }
    public void clickOnProductList(){
        Reporter.log("Clicking on ProductList"+ productListViewButton.toString()+ "<br>");
        clickOnElement(productListViewButton);
    }
    public String clickOnProduct(){
        Reporter.log("Clicking on Product"+ verifyProducts.toString()+ "<br>");

        return getTextFromElement(verifyProducts);
    }

    }





