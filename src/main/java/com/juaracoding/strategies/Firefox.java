package com.juaracoding.strategies;

import  org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Firefox implements  DriverStrategy{
    @Override
    public WebDriver setStrategy(){
        System.setProperty("webdriver.chrome.driver", "/Users/sabrinalin13/Downloads/chromedriver_mac_arm64/chromedriver");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

}
