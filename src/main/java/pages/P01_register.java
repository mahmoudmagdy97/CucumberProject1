package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P01_register extends PageBase{
    By genderMale=By.id("gender-male");
    By fristNameField=By.id("FirstName");
    By lastNmae=By.id("LastName");
    By selectDay=By.name("DateOfBirthDay");
    By selectMonth=By.name("DateOfBirthMonth");
    By selectyear=By.name("DateOfBirthYear");
    By emailField=By.id("Email");
    By passwordField=By.id("Password");
    By confirmPasswordField=By.id("ConfirmPassword");
    By rigisterButton=By.id("register-button");
    public P01_register(WebDriver driver) {
        super(driver);
    }
    public void selectGenderMale(){

        clickOnElement(genderMale);
    }
    public void enterFristName(){

        setElementText(fristNameField,"automation");
    }
    public void enterLastName(){

        setElementText(lastNmae,"tester");
    }
    public void selectDay(){
        Select Day=new Select(driver.findElement(selectDay));
        Day.selectByIndex(1);
    }
    public void selectMonthh(){
        Select Month=new Select(driver.findElement(selectMonth));
        Month.selectByIndex(8);
    }
    public void selectYear(){
        Select Year=new Select(driver.findElement(selectyear));
        Year.selectByValue("1997");
    }
    public void enterEmail(){
        setElementText(emailField,"test@example.com");
    }
    public void enterPassword(){
        setElementText(passwordField,"P@ssw0rd");
    }
    public void enterConfirmPassword(){
        setElementText(confirmPasswordField,"P@ssw0rd");
    }
    public void clickOnRegisterButton(){
        clickOnElement(rigisterButton);
    }
}
