package com.lsj.abstract_factory;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        try {

            GUIFactory guiFactory = ApplicationConfig.getGUIFactory();

            Button winBtn = guiFactory.createButton();
            CheckBox winCheckBox = guiFactory.createCheckBox();

            winBtn.paint();
            winCheckBox.paint();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
