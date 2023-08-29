package com.com.fpt.tests;

import com.fpt.config.ConfigFactory;
import com.fpt.config.FrameworkConfig;
import com.fpt.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    public void testLogin(){
        System.out.println(ConfigFactory.getConfig().browser());

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com.vn");
//        driver.quit();
    }
}
