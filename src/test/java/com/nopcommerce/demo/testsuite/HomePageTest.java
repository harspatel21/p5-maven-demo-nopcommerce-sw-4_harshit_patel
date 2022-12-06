package com.nopcommerce.demo.testsuite;
// **** Created By Harshit Patel ****

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


    HomePage homePage = new HomePage();

    @Test
    public void verifyPageNavigation(){

        String actClick = homePage.selectMenu("Computers");
        String expClick = "Computers";
        Assert.assertEquals(actClick,expClick,"Not matching");

    }
}
