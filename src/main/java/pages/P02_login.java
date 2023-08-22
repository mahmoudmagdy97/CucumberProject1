package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login extends PageBase{
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginButton = By.xpath("//button[@class='button-1 login-button']");
    public P02_login(WebDriver driver) {
        super(driver);
    }
    public void enterValidEmail(){
        setElementText(emailField,"test@example.com");
    }
    public void enterInvalidEmail(){
        setElementText(emailField, "wrong@example.com");
    }
    public void enterPassword(){
        setElementText(passwordField,"P@ssw0rd");
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
}
