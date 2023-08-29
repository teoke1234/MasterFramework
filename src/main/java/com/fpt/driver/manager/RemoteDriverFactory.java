package com.fpt.driver.manager;

import com.fpt.config.ConfigFactory;
import com.fpt.enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory(){};

    public static WebDriver getDriver(){
        BrowserRemoteModeType browserRemoteModeType = ConfigFactory.getConfig().browserRemoteMode();

        if( browserRemoteModeType == BrowserRemoteModeType.SELENIUM){}
        else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID) {}
        else {}

        return null;


    }
}
