package com.librerianacional.definitions;

import com.librerianacional.models.PurchaseModel;
import com.librerianacional.models.UserModel;
import com.librerianacional.steps.PurchaseStep;
import com.librerianacional.steps.RegisterAccountStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class BuyBooksDefinitions {

    @Steps
    private RegisterAccountStep registerAccountStep;

    @Steps
    private PurchaseStep purchaseStep;

    @Given("that I access the platform of the national bookstore")
    public void thatIAccessThePlatformOfTheNationalBookstore() {
        registerAccountStep.openBrowser();
    }

    @When("I register to create the account")
    public void IRegisterToCreateTheAccount(List<List<String>> logData) {

        UserModel user = new UserModel(logData.get(0));
        registerAccountStep.registerData(user);
    }

    @When("I buy the books")
    public void IBuyTheBooks(List<List<String>> shoppingList) {
        UserModel user = new UserModel(shoppingList.get(0).get(0), shoppingList.get(0).get(1));
        PurchaseModel purchase = new PurchaseModel(shoppingList.get(0));
        purchaseStep.purchaseBook(user, purchase);
    }

    @Then("I verify the purchase of the books {string}")
    public void IVerifyThePurchaseOfTheBooks(String nameArticle) {
        purchaseStep.verifyPurchase();
    }

    @Then("I verify the creation of the account {string}")
    public void verificoLaCreacionDeLaCuenta(String name) {
        registerAccountStep.verifyElement(name);
    }
}
