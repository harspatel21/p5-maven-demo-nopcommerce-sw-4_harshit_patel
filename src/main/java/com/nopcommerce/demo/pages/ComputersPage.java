package com.nopcommerce.demo.pages;
// **** Created By Harshit Patel ****

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ComputersPage extends Utility {

    By clickComputer = By.xpath("//a[@href='/computers']");
    By clickDesktop = By.xpath("//a[@title='Show products in category Desktops']");

    By sort = By.id("products-orderby");

    By listProducts = By.xpath("//h2[@class='product-title']");


    public void clickOnComputerAndDesktop() {
        clickOnElement(clickComputer);
        clickOnElement(clickDesktop);
    }

    public void sortComputerDesktops(String value) {
        selectByValueFromDropDown(sort, value);
    }

    public ArrayList gettingListBeforeSorting(){
        selectByVisibleTextFromDropDown(By.id("products-orderby"), "Position");

        List<WebElement> products = driver.findElements(listProducts);
        ArrayList<String> beforeSortingZToA = new ArrayList<>();
        for (WebElement list : products) {
            beforeSortingZToA.add(list.getText());
        }
        return beforeSortingZToA;

    }
    public ArrayList gettingListOfProduct() {
        List<WebElement> products = driver.findElements(listProducts);
        ArrayList<String> sortedList = new ArrayList<>();
        for (WebElement list : products) {
            sortedList.add(list.getText());
        }
        return sortedList;
    }

}
