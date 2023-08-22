package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P01_register;
import pages.P03_homePage;

import static base.TestBase.driver;

public class D01_registerStepDef extends TestBase {
    P03_homePage HomePageObject =new P03_homePage(driver);
    P01_register P01_registerObject = new P01_register(driver);

    @Given("User is in home page")
    public void user_is_in_home_page() {
        HomePageObject.navigateToHomePage();
    }
    @When("User Clicks on Register Button")
    public void user_clicks_on_register_button() {
        HomePageObject.clickOnRegisterButton();
    }
    @When("User select gender type")
    public void user_select_gender_type() {
        P01_registerObject.selectGenderMale();
    }
    @When("User enter first name")
    public void user_enter_first_name() {
        P01_registerObject.enterFristName();
    }
    @When("User enter last name")
    public void user_enter_last_name() {
        P01_registerObject.enterLastName();
    }
    @When("User Select Day Of Birth")
    public void user_select_day_of_birth() {
        P01_registerObject.selectDay();
    }
    @When("User Select Month Of Birth")
    public void user_select_month_of_birth() {
        P01_registerObject.selectMonthh();
    }
    @When("User Select Years Of Birth")
    public void user_select_years_of_birth() {
        P01_registerObject.selectYear();
    }
    @When("User Enter Email")
    public void user_enter_email() {
        P01_registerObject.enterEmail();
    }
    @When("user Enter Password")
    public void user_enter_password() {
        P01_registerObject.enterPassword();
    }
    @When("User Enter Confirm Password")
    public void user_enter_confirm_password() {
        P01_registerObject.enterConfirmPassword();
    }
    @Then("User Clicks On Register")
    public void user_clicks_on_register() {
        P01_registerObject.clickOnRegisterButton();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='result']")).getText(),"Your registration completed");
    }
}
