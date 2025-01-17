package com.qacart.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/prod.properties",
        "file:${user.dir}/src/test/resources/test.properties"
})
public interface FrameWorkConfig extends Config{
    @DefaultValue("prod")
    String env();

    @DefaultValue("https://todo.qacart.com")
    @Key("${env}.url")
    String url();
}
