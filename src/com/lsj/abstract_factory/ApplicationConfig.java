package com.lsj.abstract_factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplicationConfig {

    public static GUIFactory getGUIFactory() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String osName = br.readLine();
        if(osName.equalsIgnoreCase("window")) {
            return new WinGUIFactory();
        } else if(osName.equalsIgnoreCase("mac")) {
            return new MacGUIFactory();
        } else {
            throw new IllegalArgumentException("지원하지 않는 운영체제 입니다.");
        }
    }
}
