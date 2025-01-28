package com.qacart.utils;

import java.time.Instant;
import java.util.UUID;

public final class DataUtils {
    private DataUtils(){}

    public static String generateUniqueEmail() {
//        return Instant.now().toEpochMilli() + "test@gmail.com";
        return "auto_test." + UUID.randomUUID().toString().replace("-","") + "test@gmail.com";
    }
}
