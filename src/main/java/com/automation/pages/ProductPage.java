package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductPage extends Utility {
   public ProductPage() {
       PageFactory.initElements(driver, this);
   }

   @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement size;
    @FindBy(xpath = "//label[contains(text(),'Color')]")
    WebElement colour;
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCart;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/p[1]/a[2]/span[1]/i[1]")
    WebElement addQuntity;
    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    WebElement popUpDisplay;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeButton;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
   WebElement blouse;
   @FindBy(xpath = "//h1[contains(text(),'Printed Dress')]")
   WebElement printedDress;
    @FindBy(xpath = "//h1[contains(text(),'Printed Chiffon Dress')]")
    WebElement chiffonPrintedDress;
   @FindBy(xpath = "//h1[contains(text(),'Printed Summer Dress')]")
    WebElement summerDress;
@FindBy(xpath = "//a[@id='color_8']")
WebElement whiteColour;
    @FindBy(xpath = "//a[@id='color_13']")
    WebElement orangeColour;
    @FindBy(xpath = "//a[@id='color_14']")
    WebElement blueColour;
    @FindBy(xpath = "//a[@id='color_37']")
    WebElement greenColour;
    public void clickOnPlus() {
        Reporter.log("Clicking on Plus"+ addQuntity.toString()+ "<br>");
        clickOnElement(addQuntity);
    }
    public void clearQuantity() {
        Reporter.log("clear Quantity"+ quantity.toString()+ "<br>");
        clearTextToElement(quantity);
    }
    public void enterQuantity(String quant) {
        Reporter.log("Enter email"+quant+ " to email field "+quantity.toString() + "<br>");
        sendTextToElement(quantity, quant);
    }
    public void selectSize(String sizefromDD) {
        Reporter.log("Selecting Size" + sizefromDD + " from dropdown " + size.toString() + "<br>");
        selectByVisibleTextFromDropDown(size, sizefromDD);
    }
     public void clickOncolor() {
        Reporter.log("Clicking on color"+ colour.toString()+ "<br>");
        clickOnElement(colour);
    }
    public void clickOnAddToCart() {
        Reporter.log("Clicking on AddToCart"+ addToCart.toString()+ "<br>");
        clickOnElement(addToCart);
    }
    public void changeQuantity(String numbers) {
        Reporter.log("Enter  change Quantity"+numbers+ " to email field "+quantity.toString() + "<br>");

        sendTextToElement(quantity, numbers);
    }
    public String verifyProductAddedToCartMessage() {
        Reporter.log("getting Product Added To CartMessage from "+popUpDisplay.toString()+"<br>");
        return getTextFromElement(popUpDisplay);
    }
    public void clickOnCloseButton() {
        Reporter.log("Clicking on CloseButton"+ closeButton.toString()+ "<br>");
        clickOnElement(closeButton);
    }

    public void selectProduct(String text) {
        if (text == "Blouse") {
            Reporter.log("Clicking on Blouse " + blouse.toString()+ "<br>");
            clickOnElement(blouse);
        }
        if (text == "Printed Dress") {
            Reporter.log("Clicking on Printed Dress " + printedDress.toString()+ "<br>");
            clickOnElement(printedDress);
        }
        if (text == "Printed Chiffon Dress") {
            Reporter.log("Clicking on Printed Chiffon Dress " + chiffonPrintedDress.toString()+ "<br>");
            clickOnElement(chiffonPrintedDress);
        }
        if (text == "Printed Summer Dress with Price $28.98") {
            Reporter.log("Clicking on Printed Summer Dress with Price tag $28.98 " + summerDress.toString()+ "<br>");
            clickOnElement(summerDress);
        }
    }

    public void selectColour(String text) {
        if (text == "White") {
            Reporter.log("Clicking on Colour"+ whiteColour.toString()+ "<br>");
            clickOnElement(whiteColour);
        } else if (text == "Orange") {
            Reporter.log("Clicking on Colour"+ orangeColour.toString()+ "<br>");
            clickOnElement(orangeColour);
        } else if (text == "Green") {
            Reporter.log("Clicking on Colour"+ greenColour.toString()+ "<br>");
            clickOnElement(greenColour);
        } else if (text == "Blue") {
            Reporter.log("Clicking on Colour"+ blueColour.toString()+ "<br>");
            clickOnElement(blueColour);
        }
    }
}
