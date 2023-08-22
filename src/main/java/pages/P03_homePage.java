package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class P03_homePage extends PageBase{
    By registerButton =By.linkText("Register");
    By loginButton = By.linkText("Log in");
    By currency = By.id("customerCurrency");
    By iphone14pro = By.xpath("//a[@style='display: block;']");
    By galaxys22 = By.xpath("//img[@data-thumb='https://demo.nopcommerce.com/images/thumbs/0000089_banner_02.webp']");
    By facebookIcon = By.linkText("Facebook");
    By twitterIcon = By.linkText("Twitter");
    By rssIcon = By.linkText("RSS");
    By youtubeIcon = By.linkText("YouTube");
    By wishlistButton = By.xpath("//button[@title='Add to wishlist']");
    public P03_homePage(WebDriver driver) {

        super(driver);
    }
    public void clickOnRegisterButton(){

        clickOnElement(registerButton);
    }
    public void clickOnLoginButton (){

        clickOnElement(loginButton);
    }
    public void selectEuroCurrency(){
        Select Euro = new Select(driver.findElement(currency));
        Euro.selectByIndex(1);
    }
    public void selectIphone14Pro(){

        clickOnElement(iphone14pro);
    }
    public void selectGalaxys22(){

        clickOnElement(galaxys22);
    }
    public void clickOnFacebookIcon(){
        clickOnElement(facebookIcon);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
    public void clickOnTwitterIcon(){
        clickOnElement(twitterIcon);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
    public void clickOnRssIcom(){
        clickOnElement(rssIcon);
    }
    public void clickOnYoutubeIcon(){
        clickOnElement(youtubeIcon);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
    public void navigateToHomePage(){

        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    public void clickOnWishlistButton(){
        clickOnElements(wishlistButton,2);
    }
}

