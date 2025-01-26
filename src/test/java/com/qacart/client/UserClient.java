package com.qacart.client;


import com.qacart.models.User;
import io.restassured.response.Response;

public final class UserClient {
    private UserClient(){}

    public static Response RegisterApi(User user){
        return
                BaseClient.getRequestSpec()
                        .body(user)
                        .when().post("/users/register");

    }
}
