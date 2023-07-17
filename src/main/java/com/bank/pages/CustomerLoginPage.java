package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {
   // By customerLogin = By.xpath("(//button[normalize-space()='Customer Login'])[1]");
    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Customer Login'])[1]")
    WebElement customerLogin;
   // By YourName = By.id("userSelect");
    @FindBy(id = "userSelect")
     WebElement YourName;
   // By LogIn = By.xpath("(//button[normalize-space()='Login'])[1]");
    @FindBy(xpath = "(//button[normalize-space()='Login'])[1]")
     WebElement LogIn;
  //  By LogOut =By.xpath("(//button[normalize-space()='Logout'])[1]");
    @FindBy(xpath = "(//button[normalize-space()='Logout'])[1]")
      WebElement Logout;
    @FindBy(xpath = "(//button[normalize-space()='Logout'])[1]")
      WebElement Namemsg;
   // By NameMsg =By.xpath("(//button[normalize-space()='Logout'])[1]");
   // By Deposit =By.xpath("(//button[normalize-space()='Deposit'])[1]");
    @FindBy(xpath = "(//button[normalize-space()='Deposit'])[1]")
   WebElement Deposit;
   // By DepositAmount =By.xpath("(//input[@placeholder='amount'])[1]");
    @FindBy(xpath = "(//input[@placeholder='amount'])[1]")
   WebElement DepositAmount;
    By ClickOnDeposit1 =By.xpath("(//button[@type='submit'])[1]");
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    WebElement ClickOnDeposit;
    //By DepositMessage =By.xpath("//span[@class='error ng-binding']");
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement DepositMessage;
   // By WithDrawl =By.xpath("//button[normalize-space()='Withdrawl']");
    @FindBy(xpath = "//button[normalize-space()='Withdrawl']")
     WebElement WithDrawl;
   // By WithDrawlAmount =By.xpath("//input[@placeholder='amount']");
    @FindBy(xpath = "//input[@placeholder='amount']")
      WebElement WithDrawlAmount;
   // By withdrawTab =By.xpath("(//button[normalize-space()='Withdraw'])[1]");
    @FindBy(xpath ="(//button[normalize-space()='Withdraw'])[1]" )
    WebElement withdrawTab;


    public void clickOnCustomers() {
        clickOnElement(customerLogin);
    }

    public void searchSelectYourName(String Dropdown) {
        selectByVisibleTextFromDropDown(YourName, Dropdown);

    }

    public void clickOnLogin() {
        clickOnElement(LogIn);
    }
    public String getTextLogout(){
        return getTextFromElement(Logout);
    }
    public void clickOnLogOut(){
        clickOnElement(Logout);

    }
    public String getTextFromElementYourName(){
        return getTextFromElement(Namemsg);

    }
    public void clickOnDeposit(){
        clickOnElement(Deposit);
    }
    public void sendTextToDepositAmount(String value){
        sendTextToElement(DepositAmount,value);
    }
    public void clickOnDeposit1(){
        clickOnElement(ClickOnDeposit1);

    }
    public String getTextFromDepositSuccessful(){
        return getTextFromElement(DepositMessage);
    }
    public void clickOnWithDrawl(){
        clickOnElement(WithDrawl);

    }
    public void sendTextToWithDrawlAmount(String Value){
        sendTextToElement(WithDrawlAmount,Value);
    }
    public void clickOnWithdraw1() {
        clickOnElement(withdrawTab);
    }



}