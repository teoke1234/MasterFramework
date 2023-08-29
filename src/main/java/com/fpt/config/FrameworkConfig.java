package com.fpt.config;

import com.fpt.config.converters.StringToBrowserTypeConverter;
import com.fpt.enums.BrowserRemoteModeType;
import com.fpt.enums.BrowserType;
import com.fpt.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",

})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
    @Key("runModeBrowser")
    RunModeBrowserType browserRunMode();
    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();

}
