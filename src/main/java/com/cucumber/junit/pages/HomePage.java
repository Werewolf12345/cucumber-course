package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private static final String CUCUMBER_URL = "https://cucumber.io/";
    private static final String MENU_SELECTION = "//*[contains(@class,'nav-link')][contains(text(),'%s')]";
    private static final String CHILD_MENU_ITEM = "//a[contains(text(),'%s')]";

    public void openCucumberWebsite() {
        DriverManager.getDriver().get(CUCUMBER_URL);
    }

    public WebElement menuSection(String linkText) {
        return findElement(By.xpath(String.format(MENU_SELECTION, linkText)));
    }

    public WebElement menuItem(String linkText) {
        return findElement(By.xpath(String.format(CHILD_MENU_ITEM, linkText)));
    }
}
