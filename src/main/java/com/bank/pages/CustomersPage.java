package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends Utility {
   // By customerLogin =By.xpath("//button[normalize-space()='Customers']");
    @FindBy(xpath = "//button[normalize-space()='Customers']")
    WebElement customerLogin;
    public void clickOnCustomers(){
        clickOnElement(customerLogin);
    }
}
