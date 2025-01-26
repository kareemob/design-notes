package com.qacart.utils;

import io.restassured.response.Response;
import org.openqa.selenium.Cookie;
import java.util.Map;
import static com.qacart.driver.driverManager.DriverManager.getDriver;


public final class CookieUtils {
    private CookieUtils(){}

    public static void setBrowserCookies(Response response){
        Map<String, String> cookies = response.getCookies();
        for (Map.Entry<String, String> cookie: cookies.entrySet()){
            Cookie browserCookies = new Cookie(cookie.getKey(), cookie.getValue());
            getDriver().manage().addCookie(browserCookies);
        }
    }
}
