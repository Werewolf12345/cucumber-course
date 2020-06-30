package com.cucumber.junit.pages;

import org.openqa.selenium.By;

public class DocsPage extends BasePage {

    private static final String PAGE_TITLE_PATTERN = "//*[@class='page-header']/*[contains(@class,'title') and " +
            "contains(text(),'%s')]";

    public boolean isPageWithTitleDisplayed(String title) {
        return isElementDisplayed(By.xpath(String.format(PAGE_TITLE_PATTERN, title)));
    }
}
