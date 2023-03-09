package com.librerianacional.definitions;

import com.librerianacional.models.PurchaseModel;
import com.librerianacional.models.UserModel;
import com.librerianacional.pageobjects.HomePage;
import com.librerianacional.steps.PurchaseStep;
import com.librerianacional.steps.RegisterAccountStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

import static com.librerianacional.steps.PurchaseStep.readExcelBook;
import static com.librerianacional.steps.RegisterAccountStep.leerExcel;

public class BuyBooksDefinitions {

    @Steps
    private RegisterAccountStep registerAccountStep;
    @Steps
    private PurchaseStep purchaseStep;

    private HomePage homePage;
    private String name;

    @Before
    public void initialAutomationConfig() {
        registerAccountStep.openBrowser();
    }

    @Given("that I access the platform of the national bookstore")
    public void thatIAccessThePlatformOfTheNationalBookstore() throws IOException {
        registerAccountStep.readExcel();
        purchaseStep.readExcelBook();
    }

    @When("I register to create the account")
    public void IRegisterToCreateTheAccount() {
        UserModel user = new UserModel(leerExcel);
        registerAccountStep.registerData(user);
        name = user.getName();
    }

    @When("I buy the books")
    public void IBuyTheBooks() {
        UserModel user = new UserModel(leerExcel.get(0).get("email "), leerExcel.get(0).get("password"));
        PurchaseModel purchase = new PurchaseModel(readExcelBook);
        purchaseStep.purchaseBook(user, purchase);
    }


    @Then("I verify the creation of the account")
    public void IVerifyTheCreationOfTheAccount() {
        registerAccountStep.verifyElement(name);

    }

    @Then("I verify the purchase of the books")
    public void IVerifyThePurchaseOfTheBooks() {
        PurchaseModel purchase = new PurchaseModel(readExcelBook);
        purchaseStep.verifyPurchase(purchase);
    }

    @After
    public void endAutomation() {
        purchaseStep.closeSession();
        registerAccountStep.closeDriver();
    }
}
