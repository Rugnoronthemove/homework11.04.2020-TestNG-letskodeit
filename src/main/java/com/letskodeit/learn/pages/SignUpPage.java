package com.letskodeit.learn.pages;

import com.letskodeit.learn.utility.Utility;
import org.openqa.selenium.By;

public class SignUpPage extends Utility {

    //list of elements and their locations
    By signUpToLetsKodeIt = By.xpath("//h1");

    //methods performing actions on elements
    public void verifyTextSignUpToLetsKodeIt(String str) {
        verifyTextAssertMethod(signUpToLetsKodeIt, str);
    }

}
