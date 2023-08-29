package com.fpt.driver;

import com.fpt.config.ConfigFactory;
import com.fpt.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {



    public static void initDriver() { //Local DriverFactory
        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://google.com.vn");


    }

    public static void quitDriver() {

    }
}
