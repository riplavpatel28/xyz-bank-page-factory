package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement AddCustomer;


    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement FirstName;


    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement LastName;
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement PostCode;
    @FindBy(xpath = "(//button[normalize-space()='Add Customer'])[1]")
    WebElement AddCustomer1;

    public void clickOnAddCustomer(){
        clickOnElement(AddCustomer);
    }
    public void sendTextToFirstName(){
        sendTextToElement(FirstName,"Rupal");
    }
    public void sendTextToLastName() {
        sendTextToElement(LastName, "Patel");
    }
    public void sendTextToPostCode(){
        sendTextToElement(PostCode,"Ha9 7Eg");
    }
    public void clickOnAddCustomer1(){
        clickOnElement(AddCustomer1);

    }

}
