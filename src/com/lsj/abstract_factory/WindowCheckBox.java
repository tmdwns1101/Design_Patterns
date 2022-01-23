package com.lsj.abstract_factory;

public class WindowCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Window Style CheckBox!");
    }
}
