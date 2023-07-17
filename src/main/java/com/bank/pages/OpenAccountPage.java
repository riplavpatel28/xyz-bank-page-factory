package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {

//By openAccount =By.xpath("//button[normalize-space()='Open Account']");
@FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccount;
public void clickOnOpenAccount(){
    clickOnElement(openAccount);
}

}
