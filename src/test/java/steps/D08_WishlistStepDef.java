package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.P03_homePage;

public class D08_WishlistStepDef extends TestBase {
    P03_homePage P03_homePageObject = new P03_homePage(driver);
    @Given("User in Home Pagee")
    public void user_in_home_pagee() {
        P03_homePageObject.navigateToHomePage();
    }
    @When("User Click On Wishlist Button On This Product \"HTC One M8 Android L {double} Lollipop")
    public void user_click_on_wishlist_button_on_this_product_htc_one_m8_android_l_lollipop(Double double1) {
        P03_homePageObject.clickOnWishlistButton();
    }
    @Then("User Should See Success Message")
    public void user_should_see_success_message() {
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='bar-notification success']")).getText(),"The product has been added to your wishlist");
    }
}
