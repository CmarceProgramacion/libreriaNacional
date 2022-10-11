package com.librerianacional.actions;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Actions extends PageObject implements ActionsIF {

    @Override
    public void click(By by) {
        find(by).click();
    }

    @Override
    public void enter(By by, String text) {
        find(by).sendKeys(text);
    }

    @Override
    public String getTextElement(By by) {
        return find(by).getTextContent();
    }

    @Override
    public void select(By by, String text) {
        find(by).selectByValue(text);
    }

    @Override
    public void setTextAndEnter(By by, String text) {
        find(by).typeAndEnter(text);
    }

}
