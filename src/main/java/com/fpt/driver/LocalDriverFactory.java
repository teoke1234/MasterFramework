package com.fpt.driver;

import com.fpt.config.ConfigFactory;
import com.fpt.driver.manager.ChromeManager;
import com.fpt.driver.manager.FirefoxManager;
import com.fpt.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){};

    public static WebDriver getDriver() {
        WebDriver driver = null;
        if (ConfigFactory.getConfig().browser() == BrowserType.CHROME) {driver = ChromeManager.getDriver();
        } else driver = FirefoxManager.getDriver();
        return driver;
    }
}
