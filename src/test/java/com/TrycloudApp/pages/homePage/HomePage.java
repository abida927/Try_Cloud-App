package com.TrycloudApp.pages.homePage;

import com.TrycloudApp.Utilities.BasePage;
import com.TrycloudApp.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@id='expand']//div//img")
    public WebElement homePageUserName;

    @FindBy(css = "[id='expanddiv'] li[data-id='logout']")
    public WebElement userLogOutBtn;

}
