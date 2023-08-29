package com.fpt.config.converters;

import com.fpt.enums.BrowserRemoteModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToBrowserRemoteModeTypeConverter implements Converter<BrowserRemoteModeType> {
    @Override
    public BrowserRemoteModeType convert(Method method, String remoteMode) {
        return BrowserRemoteModeType.valueOf(remoteMode.toUpperCase());
    }
}
