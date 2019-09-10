package com.TrycloudApp.Step_Definitions;

import com.TrycloudApp.Utilities.BrowserUtils;
import com.TrycloudApp.Utilities.Pages;
import cucumber.api.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

public class UploadFileStep_Definition {

    Pages  pages = new Pages();


    @Then("navigate to the {string}")
    public void navigate_to_the(String module) {

        pages.uploadFile().navigateToModule(module);

    }

    @Then("unload file")
    public void unload_file() {
//        BrowserUtils.waitFor(2);
        pages.uploadFile().addFileBtn.click();
        BrowserUtils.waitFor(1);
        pages.uploadFile().uploadFileBtn.sendKeys("C:\\Users\\bahti\\upload2.exe", Keys.ENTER);
        BrowserUtils.waitFor(3);

    }

}
