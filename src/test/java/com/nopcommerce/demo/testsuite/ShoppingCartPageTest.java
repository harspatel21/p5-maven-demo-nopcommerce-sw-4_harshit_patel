package com.nopcommerce.demo.testsuite;
// **** Created By Harshit Patel ****

import com.nopcommerce.demo.pages.ShoppingCartPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShoppingCartPageTest extends BaseTest {
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        shoppingCartPage.clickOnComputerAndDesktop();
        shoppingCartPage.sortComputerDesktops("5");
        shoppingCartPage.clickOnShoppingCart();
        assertAssert("Not Matching", shoppingCartPage.exptectedTextMessage("Build your own computer"), shoppingCartPage.actualTextToVerify(By.xpath("//h1[contains(text(),'Build your own computer')]")));
        shoppingCartPage.selectByDropDown("Selecting 2.2 GHz Intel Pentium Dual-Core E2200", By.name("product_attribute_1"), "2.2 GHz Intel Pentium Dual-Core E2200" );
        //shoppingCartPage.selectMemory8GB("8GB [+$60.00]");
        shoppingCartPage.selectByDropDown("Selecting 2.2 8GB [+$60.00] ", By.name("product_attribute_2"), "8GB [+$60.00]" );
        shoppingCartPage.selectRadioButton("Selecting 400 GB [+$100.00]",By.id("product_attribute_3_7"));
        shoppingCartPage.selectRadioButton("Selecting Vista Premium [+$60.00]",By.id("product_attribute_4_9"));
        shoppingCartPage.selectCheckBox("Selecting Microsoft Office [+$50.00]\" and \"Total Commander [+$5.00]", By.id("product_attribute_5_12"));
        Thread.sleep(3000);
        assertAssert("Not Matching",shoppingCartPage.exptectedTextMessage("$1,475.00"), shoppingCartPage.actualTextToVerify(By.xpath("//span[@id='price-value-1']")));
        shoppingCartPage.selectPressButton("ADD TO CARD", By.xpath("//button[@id='add-to-cart-button-1']"));
        assertAssert("Not Matching", shoppingCartPage.exptectedTextMessage("The product has been added to your shopping cart"), shoppingCartPage.actualTextToVerify(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]")));
        shoppingCartPage.selectPressButton("Clicking Cross button and closing bar", By.xpath("//span[@class='close']"));
        shoppingCartPage.mouseHoveronShoppingCartAndClickOnGoToCart();
        assertAssert("Not Matching", shoppingCartPage.exptectedTextMessage("Shopping cart"), shoppingCartPage.actualTextToVerify(By.xpath("//h1[contains(text(),'Shopping cart')]")));
        shoppingCartPage.changeTheQuantityTo2AndClickOnUpdateShoppingCart();
        assertAssert("Not Matching", shoppingCartPage.exptectedTextMessage("$2,950.00"), shoppingCartPage.actualTextToVerify(By.xpath("(//strong[text()='$2,950.00'])[2]")));
        shoppingCartPage.selectCheckBox("click on checkbox I agree with the terms of service", By.id("termsofservice"));
        shoppingCartPage.selectPressButton("Pressing checkout Button", By.id("checkout"));
        assertAssert("Not Matching", shoppingCartPage.exptectedTextMessage("Welcome, Please Sign In!"), shoppingCartPage.actualTextToVerify(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")));
        shoppingCartPage.selectPressButton("Click on “CHECKOUT AS GUEST”Tab", By.xpath("//button[contains(text(),'Checkout as Guest')]"));


        shoppingCartPage.fillingMandatoryFields("Fist Name", "Mohandas", By.id("BillingNewAddress_FirstName"));
        shoppingCartPage.fillingMandatoryFields("Last Name", "Gandhi", By.id("BillingNewAddress_LastName"));
        shoppingCartPage.randomEmailGeneratorAndSendText(By.id("BillingNewAddress_Email"), "Mohan", "Gandhi");
        shoppingCartPage.selectByDropDown("Selecting Country", By.id("BillingNewAddress_CountryId"), "India");
        shoppingCartPage.fillingMandatoryFields("Entering city", "Nadiad", By.id("BillingNewAddress_City"));
        shoppingCartPage.fillingMandatoryFields("Entering Address1", "305 Ghanshyam Nagar", By.id("BillingNewAddress_Address1"));
        shoppingCartPage.fillingMandatoryFields("Entering Zip Code", "387230", By.id("BillingNewAddress_ZipPostalCode"));
        shoppingCartPage.fillingMandatoryFields("Entering Phone number", "995455625", By.id("BillingNewAddress_PhoneNumber"));
        shoppingCartPage.selectPressButton("Click on Continue", By.name("save"));
        shoppingCartPage.selectRadioButton("Click on Radio Button Next Day Air($0.00)", By.id("shippingoption_1"));
        shoppingCartPage.selectPressButton("clicking CONTINUE", By.xpath("//button[@onclick='ShippingMethod.save()']"));
        shoppingCartPage.selectRadioButton("Select Radio Button Credit Card", By.id("paymentmethod_1"));
        shoppingCartPage.selectPressButton("clicking CONTINUE", By.xpath("//button[@onclick='PaymentMethod.save()']"));
        shoppingCartPage.selectByDropDown("Select Master card From Select credit card dropdown", By.id("CreditCardType"), "Master card");
        shoppingCartPage.fillingMandatoryFields("Fill the name", "Mohandas Gandhi", By.id("CardholderName"));
        shoppingCartPage.fillingMandatoryFields("Entering Credit Card number", "5289327040251694", By.id("CardNumber"));
        shoppingCartPage.selectByDropDown("Selecting Expiry Date", By.id("ExpireMonth"), "11");
        shoppingCartPage.selectByDropDown("Selecting Expiry Month", By.id("ExpireYear"), "2025");
        shoppingCartPage.fillingMandatoryFields("Entering Credit Card Code", "470", By.id("CardCode"));
        shoppingCartPage.selectPressButton("Click Continue Button", By.id("payment-info-buttons-container"));
        assertAssert("Verify Payment Method is Credit Card", shoppingCartPage.exptectedTextMessage("Payment Method:"),
                shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Payment Method:')]")));
        assertAssert("Verify Payment Method is Credit Card", shoppingCartPage.exptectedTextMessage("Credit Card"),
                shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Credit Card')]")));
        assertAssert("Verify “Shipping Method” is Next Day Air", shoppingCartPage.exptectedTextMessage("Shipping Method:"),
                shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Shipping Method:')]")));
        assertAssert("Verify “Shipping Method” is Next Day Air", shoppingCartPage.exptectedTextMessage("Next Day Air"),
                shoppingCartPage.actualTextToVerify(By.xpath("//span[contains(text(), 'Next Day Air')]")));
        assertAssert("Verify Total is $2,950.00", shoppingCartPage.exptectedTextMessage("$2,950.00"),
                shoppingCartPage.actualTextToVerify(By.xpath("(//strong[text()='$2,950.00'])[2]")));
        shoppingCartPage.selectPressButton("Click on CONFIRM", By.xpath("//button[@onclick='ConfirmOrder.save()']"));
        assertAssert("Verify the Text Thank You", shoppingCartPage.exptectedTextMessage("Thank you"),
                shoppingCartPage.actualTextToVerify(By.xpath("//h1[text()='Thank you']")));
        assertAssert("Verify the message Your order has been successfully processed!", shoppingCartPage.exptectedTextMessage("Your order has been successfully processed!"),
                shoppingCartPage.actualTextToVerify(By.xpath("//strong[contains(text(), 'fully processed!')]")));
        shoppingCartPage.selectPressButton("Click on CONTINUE", By.xpath("//button[@onclick='setLocation(\"/\")']"));
        assertAssert("Verify the text Welcome to our store", shoppingCartPage.exptectedTextMessage("Welcome to our store"),
                shoppingCartPage.actualTextToVerify(By.xpath("//h2[text()='Welcome to our store']")));
    }
}
