package com.librerianacional.steps;

import com.librerianacional.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class LoginStep {

    private HomePage homePage;

    @Step
    public void login(){
        homePage.clickName();
    }

}
