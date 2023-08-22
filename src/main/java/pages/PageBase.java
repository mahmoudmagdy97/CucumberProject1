package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    WebDriver driver;
    public PageBase(WebDriver driver){

        this.driver=driver;
    }
    public void clickOnElement(By elementLocator){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(elementLocator));
        driver.findElement(elementLocator).click();
    }
    public void scrollElementView(By elementLocator){
        WebElement element=driver.findElement(elementLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",element);
    }
    public void setElementText(By elementLocator,String text){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocator));
        scrollElementView(elementLocator);
        driver.findElement(elementLocator).sendKeys(text);
    }
    public void clickOnElements(By elementLocator,int Num){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocator));
        scrollElementView(elementLocator);
        driver.findElements(elementLocator).get(Num).click();
    }

}
