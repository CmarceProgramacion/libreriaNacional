package com.librerianacional.steps;

import com.librerianacional.actions.Actions;
import com.librerianacional.models.PurchaseModel;
import com.librerianacional.models.UserModel;
import com.librerianacional.utils.DataListExcel;
import net.thucydides.core.annotations.Step;
import org.hamcrest.MatcherAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.librerianacional.pageobjects.HomePage.BUTTON_LOG_IN;
import static com.librerianacional.pageobjects.HomePage.BUTTON_MY_ACCOUNT;
import static com.librerianacional.pageobjects.PurchaseInformationPage.*;
import static org.hamcrest.Matchers.containsString;

public class PurchaseStep {
    private Actions actions;
    private String total;
    public static ArrayList<Map<String, String>> readExcelBook = new ArrayList<>();

    @Step
    public void readExcelBook() throws IOException {
        readExcelBook = DataListExcel.readExcel("DataList.xlsx", "BuyBook");
    }

    @Step
    public void purchaseBook(UserModel userModel, PurchaseModel purchaseModel) {
        actions.click(BUTTON_MY_ACCOUNT);
        actions.click(BUTTON_LOG_IN);
        actions.click(BUTTON_LOGIN_WITH_AND_PASSWORD);
        actions.enter(INPUT_EMAIL_ACCOUNT, userModel.getEmail());
        actions.enter(INPUT_PASSWORD_ACCOUNT, userModel.getPassword());
        actions.click(BUTTON_LOGIN_IN_ACCOUNT);
        actions.setTextAndEnter(INPUT_SEARCH_BOOK, purchaseModel.getNameArticle());
        actions.click(LABEL_TITLE_BOOK);
        actions.click(BUTTON_AMOUNT);
        actions.click(BUTTON_ADD_TO_CART);
        actions.click(BUTTON_SEE_SHOPPING_CART);
    }

    @Step
    public void verifyPurchase(PurchaseModel purchaseModel) {
        int quantityProducts = Integer.parseInt(actions.getTextElement(LABEL_AMOUNT));
        MatcherAssert.assertThat(actions.getTextElement(LABEL_TOTAL_TO_PAY).replace("$", "").replace(",", ""), containsString(purchaseModel.getTotal()));
    }

    @Step
    public void closeSession() {
        actions.click(ICONO_PROFILE);
        actions.click(LIST_CLOSE_SESSION);
    }
}
