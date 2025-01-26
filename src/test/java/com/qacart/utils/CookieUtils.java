package com.qacart.utils;

import com.qacart.client.UserClient;
import io.restassured.response.Response;
import org.openqa.selenium.Cookie;

import java.util.Map;

import static com.qacart.driver.driverManager.DriverManager.getDriver;
import static com.qacart.fixtures.UserFixtures.getDefaultUser;

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
