package com.librerianacional.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PurchaseInformationPage extends PageObject {

    public static final By LABEL_USER_NAME_ACCOUNT = By.xpath("//div[@class='col-12 px-0 text--extrabold text--lgx text--lh-1 text--blue']");
    public static final By BUTTON_LOGIN_WITH_AND_PASSWORD = By.xpath("(//div[text()=' Ingresar con Mail y contraseña '])[1]");
    public static final By INPUT_EMAIL_ACCOUNT = By.name("usuario");
    public static final By INPUT_PASSWORD_ACCOUNT = By.name("contrasena");
    public static final By BUTTON_LOGIN_IN_ACCOUNT = By.xpath("//button[text()='Iniciar sesión']");
    public static final By INPUT_SEARCH_BOOK = By.xpath("(//input[@formcontrolname='buscar'])[2]");
    public static final By LABEL_TITLE_BOOK = By.xpath("//a[contains(.,' ANDROID MANUAL PRACTICO PARA TODOS LOS N... ')]");
    public static final By BUTTON_AMOUNT = By.xpath("//i[@class='icon-plus-light text--gray text--xm text--light']");
    public static final By BUTTON_ADD_TO_CART = By.xpath("//button[text()='Añadir al carrito']");
    public static final By BUTTON_SEE_SHOPPING_CART = By.xpath("//button[text()='Ver Carrito de Compras']");
    public static final By LABEL_AMOUNT = By.xpath("//span[@class='amount text--md text--blue text--bold d-flex justify-content-center align-items-center px-3']");
    public static final By LABEL_UNIT_VALUE = By.xpath("//div[@class='text--blue text--lh-1 text--bold mb-2']");
    public static final By LABEL_TOTAL_TO_PAY = By.xpath("//div[@class='text--blue text--lh-1 text--bold']");

}
