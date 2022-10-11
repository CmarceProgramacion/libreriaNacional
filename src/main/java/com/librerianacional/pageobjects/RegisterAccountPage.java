package com.librerianacional.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterAccountPage extends PageObject {
    public static final By INPUT_EMAIL = By.id("email");
    public static final By INPUT_NAME = By.id("nombres");
    public static final By INPUT_LAST_NAME = By.id("apellidos");
    public static final By LIST_DOCUMENT_TYPE = By.xpath("//select[@name='tipo_identificacion']");
    public static final By INPUT_DOCUMENT_NUMBER = By.id("identificacion");
    public static final By INPUT_CELL_PHONE = By.id("telefono_movil");
    public static final By INPUT_PHONE_NUMBER = By.id("telefono");
    public static final By INPUT_PASSWORD = By.id("contrasena");
    public static final By INPUT_CONFIRM_PASSWORD = By.id("repeatContrasena");
    public static final By CHECKLIST_TERMS_AND_CONDITIONS = By.id("terminosCondiciones");
    public static final By BUTTON_REGISTER_USER = By.xpath("//button[text()='Registrarme']");

}
