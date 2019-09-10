package com.TrycloudApp.Utilities;

import com.TrycloudApp.pages.files.UploadFile;
import com.TrycloudApp.pages.homePage.HomePage;
import com.TrycloudApp.pages.loginPage.LoginPage;

public class Pages {
    private LoginPage loginPage;
    private HomePage homePage;
    private UploadFile uploadFile;


    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

    public UploadFile uploadFile() {
        if (uploadFile == null) {
            uploadFile = new UploadFile();
        }
        return uploadFile;
    }

}
