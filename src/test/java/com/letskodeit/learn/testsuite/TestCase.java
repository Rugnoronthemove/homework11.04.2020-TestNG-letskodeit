package com.letskodeit.learn.testsuite;

import com.letskodeit.learn.loadproperty.LoadProperty;
import com.letskodeit.learn.pages.HomePage;
import com.letskodeit.learn.pages.LoginPage;
import com.letskodeit.learn.pages.PracticePage;
import com.letskodeit.learn.pages.SignUpPage;
import com.letskodeit.learn.testbase.TestBase;

import org.testng.annotations.Test;

public class TestCase extends TestBase {

    //object creation
    LoadProperty loadProperty = new LoadProperty();
    HomePage homePage = new HomePage();
    PracticePage practicePage = new PracticePage();
    LoginPage loginPage = new LoginPage();
    SignUpPage signUpPage = new SignUpPage();

    String loginPageText = loadProperty.getProperty("loginPageText");
    String signUpPageText = loadProperty.getProperty("signUpPageText");
    String practicePageText = loadProperty.getProperty("practicePageText");

    //TestCases
    @Test (groups = {"Regression","Sanity"})
    public void navigateSuccessfullyToPracticePage() {
        //click on Practice link
        homePage.clickOnPracticeLink();
        //verify text on Practice page
        practicePage.verifyTextPracticePage(practicePageText);
    }

    @Test (groups = {"Regression","Smoke"})
    public void navigateSuccessfullyToLoginPage() {
        //click on Login link
        homePage.clickOnLoginLink();
        //verify text on Login page
        loginPage.verifyTextLogInToLetsKodeIt(loginPageText);
    }

    @Test (groups = {"Regression"})
    public void navigateSuccessfullyToSignupPage() {
        //click on SignUp button
        homePage.clickOnSignUpBtn();
        //verify text on SignUp page
        signUpPage.verifyTextSignUpToLetsKodeIt(signUpPageText);
    }

    @Test (groups = {"Regression"})
    public void userShouldSelectHondaElementFromDropDownMenu() throws InterruptedException {
        //click on Practice link
        homePage.clickOnPracticeLink();
        //select Honda from dropdown menu
        practicePage.selectFromDropDownMenu();
    }
}
