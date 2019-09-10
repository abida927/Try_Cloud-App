package com.TrycloudApp.pages.files;

import com.TrycloudApp.Utilities.BasePage;
import com.TrycloudApp.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFile extends BasePage {
    public UploadFile(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']//li//a[@aria-label='Files']")
    public WebElement fileModule;


    @FindBy(xpath = "//div[@class='actions creatable']/a[@class='button new']")
    public WebElement addFileBtn;

    @FindBy(css = "label[data-action='upload']")
    public WebElement uploadFileBtn;

}
