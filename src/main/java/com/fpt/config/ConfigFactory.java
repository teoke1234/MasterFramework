package com.fpt.config;

import com.fpt.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class ConfigFactory {

    private ConfigFactory(){};

    public static FrameworkConfig getConfig(){
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}
