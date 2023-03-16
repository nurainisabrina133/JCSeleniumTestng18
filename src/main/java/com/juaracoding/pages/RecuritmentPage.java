package com.juaracoding.pages;

import com.juaracoding.strategies.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RecuritmentPage {

    private WebDriver driver;
    public RecuritmentPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
}
