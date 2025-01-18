package com.qacart.utils;

import java.time.Instant;

public final class DataUtils {
    private DataUtils(){}

    public static String generateUniqueEmail() {
        return Instant.now().toEpochMilli() + "test@gmail.com";
    }
}
