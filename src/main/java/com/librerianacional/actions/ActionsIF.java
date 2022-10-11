package com.librerianacional.actions;

import org.openqa.selenium.By;

public interface ActionsIF {
    void click(By by);

    void enter(By by, String text);

    String getTextElement(By by);

    void select(By by, String text);

    void setTextAndEnter(By by, String text);

}
