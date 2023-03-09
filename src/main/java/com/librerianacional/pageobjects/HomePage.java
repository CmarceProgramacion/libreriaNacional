package com.librerianacional.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.Base.url")
public class HomePage extends PageObject {
    public static final By BUTTON_MY_ACCOUNT = By.xpath("(//button[@id='dropdownMenuLogin'])[2]");
    public static final By BUTTON_REGISTER = By.xpath("(//a[@href='/usuario/registrarme'])[2]");
    public static final By BUTTON_LOG_IN = By.xpath("(//a[@href='/usuario/ingresar'])[2]");

}



