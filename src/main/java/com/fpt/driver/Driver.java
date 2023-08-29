package com.fpt.driver;

import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver(){}



    public static void initDriver() { //Local DriverFactory
        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://google.com.vn");


    }

    public static void quitDriver() {
        /*

         */

    }
}
