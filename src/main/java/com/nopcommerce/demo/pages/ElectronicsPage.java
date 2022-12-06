package com.nopcommerce.demo.pages;
// **** Created By Harshit Patel ****

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class ElectronicsPage extends Utility {
    By electronicsMenu = By.xpath("//ul[@class ='top-menu notmobile']/li/a[@href = '/electronics']");
    By cellPhone = By.xpath("//ul[@class ='top-menu notmobile']//a[@href = '/cell-phones']");

    By getTextCellPhone = (By.xpath("//h1[contains(text(),'Cell phones')]"));
    By clickOnListTab = (By.xpath("//a[contains(text(),'List')]"));
    By clickOnNokiaLumia1020 = By.xpath("//h2/a[contains(text(),'Nokia Lumia 1020')]");
    By getTextNokiaLumia1020 = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By getPriceForNokiaLumia = By.xpath("//span[@id='price-value-20']");
    By updateQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.id("add-to-cart-button-20");
    By addedToCartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By hoverToShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnGoToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By shoppingCartMessage = By.xpath("//span[contains(text(),'Shopping cart')]");

    By quantityMessage = By.xpath("//span[contains(text(),'(2)')]");

    By total698 = By.xpath("(//strong[text()='$698.00'])[2]");

    By clickOnCheck = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckout = By.xpath("//button[@id='checkout']");

    By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By clickRegister = By.xpath("//button[contains(text(),'Register')]");

    By verifyRegister = By.xpath("//h1[contains(text(),'Register')]");
    public void clickOnElectronicsMenuAndCellPhone() {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(electronicsMenu)).moveToElement(driver.findElement(cellPhone)).click().build().perform();
    }

    public String getCellPhoneText() throws InterruptedException {
        Thread.sleep(2000);
        return getTextFromElement(getTextCellPhone);
    }

    public void clickOnListTab() {
        clickOnElement(clickOnListTab);
    }

    public void clickOnNokiaLumia1020() throws InterruptedException {
        Thread.sleep(5000);
        clickOnElement(clickOnNokiaLumia1020);
    }

    public String getNokiaLumiaText() {

        return getTextFromElement(getTextNokiaLumia1020);
    }

    public String getPriceForNokiaLumia() {

        return getTextFromElement(getPriceForNokiaLumia);
    }

    public void updateQuantityTo2() {
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).clear();
        sendTextToElement(updateQuantity, "2");
    }

    public void setAddToCart() {
        clickOnElement(addToCart);
    }

    public String getAddedToCartMessage() {

        return getTextFromElement(addedToCartMessage);
    }

    public void closePopUpMessage() {
        clickOnElement(closeMessage);
    }

    public void clickOnGoToCart() {
        mouseHoverToElement(hoverToShoppingCart);
        clickOnElement(clickOnGoToCart);
    }

    public String shoppingCartMessage() {

        return getTextFromElement(shoppingCartMessage);
    }
    public String updateQuantityMessage() {

        return getTextFromElement(quantityMessage).substring(1,2);
    }
    public String verifyTotal() {
        return getTextFromElement(total698);
    }
    public void clickOnCheckBox() {
        clickOnElement(clickOnCheck);
    }
    public void setClickOnCheckoutBox() {
        clickOnElement(clickOnCheckout);
    }
    public String verifyWelcomeText() {
        return getTextFromElement(welcomeMessage);
    }
    public void clickOnRegisterLink() {
        clickOnElement(clickRegister);
    }
    public String verifyRegisterText() {
        return getTextFromElement(verifyRegister);
    }

    public void fillingMandatoryFields(String message, String sendText, By by){
        sendTextToElement(by, sendText);
    }

    public void selectRadioButton(String message, By by){
        clickOnElement(by);
    }

    public void selectByDropDown(String message, By by, String name){
        selectByVisibleTextFromDropDown(by, name);
    }

    public void randomEmailGeneratorAndSendText(By by, String firstName, String lastName){
        Random randomGenerator = new Random();
        int emailNum = randomGenerator.nextInt(9999);
        String email = firstName + "." + lastName + emailNum + "@email.com";
        sendTextToElement(by, email);
    }

    public void randomPasswordGeneratorAndSendText(By by, String lastName){
        int passNum = 209;
        String password = lastName + "#" + passNum;
        sendTextToElement(by, password);
    }

    public void selectPressButton(String message, By by){
        clickOnElement(by);
    }

    public String exptectedTextMessage(String expected) {
        System.out.println("Expected Text or Message is : " + expected);
        return expected;
    }

    public String actualTextToVerify(By by) {
        String actual = driver.findElement(by).getText();
        System.out.println("Actual Text or Message is : " + actual);
        return actual;
    }
    public void selectCheckBox(String message, By by){
        clickOnElement(by);
    }

    public void verifyCurrentURL(String urlText){
        String expectedUrl = urlText;
        String actualUrl = driver.getCurrentUrl();
        assertAssert("URL not matching", expectedUrl, actualUrl);
    }

}
