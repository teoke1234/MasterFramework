package com.fpt.config.converters;

import com.fpt.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRunModeBrowserTypeConverter implements Converter<RunModeBrowserType> {
    @Override
    public RunModeBrowserType convert(Method method, String runMode) {
        return RunModeBrowserType.valueOf(runMode.toUpperCase());
    }
}
