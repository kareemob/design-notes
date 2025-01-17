package com.qacart.config.converters;

import com.qacart.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {
    @Override
    public BrowserType convert(Method method, String browser) {
        Map<String, BrowserType> browserMap = Map.of(
                "CHROME", BrowserType.CHROME,
                "FIREFOX", BrowserType.FIREFOX
        );
        return browserMap.getOrDefault(browser.toUpperCase(), BrowserType.CHROME);
    }
}
