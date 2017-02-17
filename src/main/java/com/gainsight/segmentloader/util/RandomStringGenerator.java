package com.gainsight.segmentloader.util;

/**
 * Created by samujjal on 16/02/17.
 */
public class RandomStringGenerator {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwyz0123456789";
    private static final String ALPHA_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwyz";
    private static final String NUMERIC = "0123456789";
    public static String randomUserId(int userIdLength) {
        int count = userIdLength;
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    public static String randomUserName(int userNameLength){
        int count = userNameLength;
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random() * ALPHA_STRING.length());
            builder.append(ALPHA_STRING.charAt(character));
        }
        builder.append(" ");
        count = userNameLength;
        while (count-- != 0) {
            int character = (int)(Math.random() * ALPHA_STRING.length());
            builder.append(ALPHA_STRING.charAt(character));
        }

        return builder.toString();
    }

    public static String randomNumberSequence(int length){
        int count = length;

        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random() * NUMERIC.length());
            builder.append(NUMERIC.charAt(character));
        }

        return builder.toString();
    }
}
