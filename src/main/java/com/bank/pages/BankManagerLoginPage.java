package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLogin;
    @FindBy(xpath ="//select[@id='userSelect']")
            WebElement searchUser;
   // By Currency = By.id("currency");
    @FindBy(id ="currency")
     WebElement currency;
   // By Process =By.xpath("//button[normalize-space()='Process']");
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement Process;
    public void clickOnBankManagerLogin(){
        clickOnElement(bankManagerLogin);
    }
    public void setSearchUser(String DropDown){
        selectByVisibleTextFromDropDown(searchUser, DropDown);
    }
    public void selectCurrencyPound(String Dropdown){
        selectByValueFromDropDown(currency,Dropdown);
    }
    public void clickOnProcess(){
        clickOnElement(Process);
    }
}
