package com.librerianacional.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.Base.url")
public class HomePage extends PageObject {
    public static final By NAME=By.xpath("");

    public void clickName(){
        find(NAME).click();
    }


}
