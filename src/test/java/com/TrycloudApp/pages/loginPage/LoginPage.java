package com.TrycloudApp.pages.loginPage;

import com.TrycloudApp.Utilities.BasePage;
import com.TrycloudApp.Utilities.ConfigurationReader;
import com.TrycloudApp.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="user")
    public WebElement userNameInput;

    @FindBy(id="password")
    public WebElement passwordInput;

    @FindBy(id="submit")
    public WebElement loginBtn;


    public void goToTheLandingPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    public void login(String username, String password){
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }






}
