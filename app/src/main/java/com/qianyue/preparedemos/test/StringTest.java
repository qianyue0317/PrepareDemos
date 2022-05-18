package com.qianyue.preparedemos.test;

public class StringTest {
    static final String TEST = "test";

    public static boolean test(String input) {
        return TEST == input;
    }

    public static Class<?> getIntClz() {
        return int[].class.getClass();
    }
}
