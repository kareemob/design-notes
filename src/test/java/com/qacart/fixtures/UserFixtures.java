package com.qacart.fixtures;

import com.qacart.models.User;
import com.qacart.utils.DataUtils;

public class UserFixtures {


    public static User getDefaultUser(){
        return User.builder()
                .setFirstName("kareem")
                .setLastName("obaidat")
                .setEmail(DataUtils.generateUniqueEmail())
                .setPassword("Test123!")
                .build();
    }

    public static User getInvalidUser(){
        return User.builder()
                .setFirstName("kareem")
                .setLastName("obaidat")
                .setEmail("invalid!")
                .setPassword("Test123!")
                .build();
    }

}
