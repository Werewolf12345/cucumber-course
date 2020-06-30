package com.cucumber.junit.steps;

import com.cucumber.junit.pages.DocsPage;
import com.cucumber.junit.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuSteps {

    private HomePage homePage = new HomePage();
    private DocsPage docsPage = new DocsPage();

    @Given("user opens Cucumber website")
    public void OpenCucumberWebsite() {
        homePage.openCucumberWebsite();
    }

    @When("user clicks on {string} section")
    public void clickOnSection(String section) {
        homePage.menuSection(section).click();
    }

    @When("user clicks on {string} item")
    public void clicksOnItem(String item) {
        homePage.menuItem(item).click();
    }

    @Then("page with title {string} should appear")
    public void verifyPageTitlePresence(String pageTitle) {
        assertThat(docsPage.isPageWithTitleDisplayed(pageTitle))
                .overridingErrorMessage("Page with title '%s' is not displayed", pageTitle)
                .isTrue();
    }
}
