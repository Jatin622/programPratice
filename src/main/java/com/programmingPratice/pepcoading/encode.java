package com.programmingPratice.pepcoading;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class encode {
    public static void main(String[] args) {
        String input = "System1.ManagementView:ManagementView";
        String encoded = input;

        try {
            for (int i = 0; i < 3; i++) {
                encoded = URLEncoder.encode(encoded, "UTF-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println(encoded);
    }
}
