package com.lsj.abstract_factory;

public class WinGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}
