package com.librerianacional.steps;

import com.librerianacional.actions.Actions;
import com.librerianacional.models.UserModel;
import com.librerianacional.pageobjects.HomePage;
import com.librerianacional.pageobjects.RegisterAccountPage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.hamcrest.MatcherAssert;

import static com.librerianacional.pageobjects.HomePage.BUTTON_MY_ACCOUNT;
import static com.librerianacional.pageobjects.HomePage.BUTTON_REGISTER;
import static com.librerianacional.pageobjects.PurchaseInformationPage.LOADER;
import static com.librerianacional.pageobjects.PurchaseInformationPage.LABEL_USER_NAME_ACCOUNT;
import static com.librerianacional.pageobjects.RegisterAccountPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static org.hamcrest.Matchers.containsString;


public class RegisterAccountStep {

    private RegisterAccountPage registerAccountPage;
    private HomePage homePage;
    private Actions actions;

    @Step
    public void openBrowser() {
        homePage.open();
    }

    @Step
    public void registerData(UserModel userModel) {
        actions.click(BUTTON_MY_ACCOUNT);
        actions.click(BUTTON_REGISTER);
        actions.enter(INPUT_EMAIL, userModel.getEmail());
        actions.enter(INPUT_NAME, userModel.getName());
        actions.enter(INPUT_LAST_NAME, userModel.getLastName());
        actions.select(LIST_DOCUMENT_TYPE, userModel.getDocumentType());
        actions.enter(INPUT_DOCUMENT_NUMBER, userModel.getDocumentNumber());
        actions.enter(INPUT_CELL_PHONE, userModel.getCellPhone());
        actions.enter(INPUT_PHONE_NUMBER, userModel.getPhoneNumber());
        actions.enter(INPUT_PASSWORD, userModel.getPassword());
        actions.enter(INPUT_CONFIRM_PASSWORD, userModel.getPassword());
        actions.click(CHECKLIST_TERMS_AND_CONDITIONS);
        actions.click(BUTTON_REGISTER_USER);
    }

    @Step
    public void verifyElement(String name) {
        WaitUntil.the(LOADER, isNotVisible());
        WaitUntil.the(LABEL_USER_NAME_ACCOUNT, isClickable());
        MatcherAssert.assertThat(actions.getTextElement(LABEL_USER_NAME_ACCOUNT), containsString(name));
    }
}
