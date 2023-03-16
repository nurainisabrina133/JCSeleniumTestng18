package com.juaracoding.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//buat automation testing untuk fitur login dan add to cart 1 product pada
// website https://shop.demoqa.com/ menggunakan page object
// page factory dan lakukan validasi test
public class Chrome implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "/Users/sabrinalin13/Downloads/chromedriver_mac_arm64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no--sandbox");
        return new ChromeDriver(options);

    }
}
