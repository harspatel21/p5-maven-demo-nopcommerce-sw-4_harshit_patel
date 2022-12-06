package com.nopcommerce.demo.testsuite;
// **** Created By Harshit Patel ****

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersPageTest extends BaseTest {
    ComputersPage computersPage = new ComputersPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        computersPage.clickOnComputerAndDesktop();
        computersPage.sortComputerDesktops("6");
        Assert.assertEquals(computersPage.gettingListOfProduct(), computersPage.gettingListBeforeSorting());
    }
}
