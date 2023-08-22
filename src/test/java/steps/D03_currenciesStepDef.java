package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D03_currenciesStepDef extends TestBase {
    P03_homePage P03_homePageObject = new P03_homePage(driver);
    @Given("Go to Home Page")
    public void go_to_home_page() {
        P03_homePageObject.navigateToHomePage();
    }
    @When("User Select Euro currency from the dropdown list on the top left of home page")
    public void user_select_euro_currency_from_the_dropdown_list_on_the_top_left_of_home_page() {
        P03_homePageObject.selectEuroCurrency();
    }
    @Then("assertion to verify Euro Symbol \\(€) is shown")
    public void assertion_to_verify_euro_symbol_€_is_shown() {
        Assert.assertEquals(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(0).getText(),"€1032.00");
        Assert.assertEquals(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(1).getText(), "€1548.00");
        Assert.assertEquals(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(2).getText(), "€210.70");
        Assert.assertEquals(driver.findElements(By.xpath("//span[@class='price actual-price']")).get(3).getText(), "€21.50");
    }
}