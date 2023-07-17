package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class BankTest extends BaseTest {
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomersPage customersPage;
    CustomerLoginPage customerLoginPage;
    @BeforeMethod
    public void inIt(){
        bankManagerLoginPage =new BankManagerLoginPage();
        addCustomerPage =new AddCustomerPage();
        openAccountPage =new OpenAccountPage();
        customersPage =new CustomersPage();
        customerLoginPage =new CustomerLoginPage();
    }

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        bankManagerLoginPage.clickOnBankManagerLogin();
        addCustomerPage.clickOnAddCustomer();
        addCustomerPage.sendTextToFirstName();
        addCustomerPage.sendTextToLastName();
        Thread.sleep(1000);
        addCustomerPage.sendTextToPostCode();
        addCustomerPage.clickOnAddCustomer();
        // popup display
        addCustomerPage.getTextFromAlert();
        //	verify message "Customer added successfully"
        String actualMessage = addCustomerPage.getTextFromAlert();
        String expectedMessage = "Customer added successfully with customer id :6";
        Assert.assertEquals(actualMessage, expectedMessage, "Customer added successfully with customer id :6");
        //	click on "ok" button on popup.
        addCustomerPage.acceptAlert();


    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        //click On "Bank Manager Login" Tab
        bankManagerLoginPage.clickOnBankManagerLogin();
        // click On "Open Account" Tab
        openAccountPage.clickOnOpenAccount();
        Thread.sleep(2000);
        //Search customer that created in first test
        bankManagerLoginPage.setSearchUser("Hermoine Granger");
        //Select currency "Pound"
        bankManagerLoginPage.selectCurrencyPound("Pound");
        //click on "process" button
        bankManagerLoginPage.clickOnProcess();
        //popup displayed
        bankManagerLoginPage.getTextFromAlert();
        // verify message "Account created successfully"
        //click on "ok" button on popup.
    }

    @Test
    public void customerShouldLoginAndLogoutSuceessfully() {
        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomers();
        // search customer that you created.
        customerLoginPage.searchSelectYourName("Hermoine Granger");

        //click on "Login" Button
        customerLoginPage.clickOnLogin();
        //verify "Logout" Tab displayed.
        // String actualText=customerLoginPage.getTextLogout();
        // String expectedText ="Logout";
        // Assert.assertEquals(expectedText,actualText);

        //click on "Logout"
        customerLoginPage.clickOnLogOut();
        //verify "Your Name" text displayed.
        // String actualMessage =customerLoginPage.getTextFromElementYourName();
        // String expectedMessage ="Your Name";
        //  Assert.assertEquals(actualMessage,expectedMessage);

    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        //click on "Customer Login" Tab
        customerLoginPage.clickOnCustomers();
        // search customer that you created.
        customerLoginPage.searchSelectYourName("Hermoine Granger");

        //click on "Login" Button
        customerLoginPage.clickOnLogin();
        // click on "Deposit" Tab
        customerLoginPage.clickOnDeposit();
        // Enter amount 100
        customerLoginPage.sendTextToDepositAmount("100");
        // click on "Deposit" Button
        customerLoginPage.clickOnDeposit1();
        // verify message "Deposit Successful"
        String actualMsg = customerLoginPage.getTextFromDepositSuccessful();
        String expectedMsg = "Deposit Successful";
        Assert.assertEquals(actualMsg, expectedMsg);

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
        // click on "Customer Login" Tab
        customerLoginPage.clickOnCustomers();
        // search customer that you created.
        customerLoginPage.searchSelectYourName("Hermoine Granger");
        // click on "Login" Button
        customerLoginPage.clickOnLogin();
        // click on "Withdrawl" Tab
        customerLoginPage.clickOnWithDrawl();""
        //  Enter amount 50
        customerLoginPage.sendTextToWithDrawlAmount("50");
        ////  click on "Withdraw" Button
        //customersPage.clickOnElement();
        //  verify message "Transaction Successful"
        String actualMsg = customerLoginPage.getTextFromDepositSuccessful();
        String expectedMsg = "Transaction Successful";
        Assert.assertEquals(actualMsg, expectedMsg);

    }

}
