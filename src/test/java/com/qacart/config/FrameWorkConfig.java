package com.qacart.config;

import com.qacart.config.converters.StringToBrowserTypeConverter;
import com.qacart.enums.BrowserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameWorkConfig extends Config{
    @Config.DefaultValue("https://todo.qacart.com")
    String url();

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
}
