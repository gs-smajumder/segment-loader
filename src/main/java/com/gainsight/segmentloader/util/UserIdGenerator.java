package com.gainsight.segmentloader.util;

/**
 * Created by samujjal on 16/02/17.
 */
public class UserIdGenerator {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int userIdLength = 8;
    public static String randomUserId() {
        int count = userIdLength;
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
}
