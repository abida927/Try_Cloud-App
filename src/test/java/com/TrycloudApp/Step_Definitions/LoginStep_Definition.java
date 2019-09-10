package com.TrycloudApp.Step_Definitions;

import com.TrycloudApp.Utilities.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginStep_Definition {

    Pages pages= new Pages();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {

        pages.loginPage().login(username,password);

    }

    @Then("homePage title should be {string}")
    public void homepage_title_should_be(String expectedTitle) {

        Assert.assertEquals(expectedTitle, pages.homePage().getPageTitle());
    }




    @When("user log in")
    public void user_log_in() {
        List<Map<String, String>>  credentails;
        ExcelUtil excelUtil= new ExcelUtil("C:\\Users\\bahti\\OneDrive\\Documents\\TryCloudApp\\src\\test\\resourses\\LoginCredentials.xlsx","Trycloud");
        credentails=excelUtil.getDataList();
        for(Map<String,String> data :credentails){
            pages.loginPage().userNameInput.sendKeys(data.get("UserName"));
            pages.loginPage().passwordInput.sendKeys(data.get("Password"));
            pages.loginPage().loginBtn.click();
//            pages.homePage().getPageTitle();
//            Assert.assertEquals("Try - Cloud", pages.homePage().getPageTitle());
            BrowserUtils.waitForVisibility(pages.homePage().homePageUserName,3);
            pages.homePage().homePageUserName.click();
            BrowserUtils.waitForVisibility(pages.homePage().userLogOutBtn,3);
            pages.homePage().userLogOutBtn.click();
            //found it ,and click it, but result says Unable to locate element
            BrowserUtils.waitForVisibility(pages.homePage().homePageUserName,3);
            pages.homePage().homePageUserName.click();
            //  found it ,and click it, but result says Unable to locate element
            BrowserUtils.waitForVisibility(pages.homePage().userLogOutBtn,3);
            pages.homePage().userLogOutBtn.click();

        }
    }






}
