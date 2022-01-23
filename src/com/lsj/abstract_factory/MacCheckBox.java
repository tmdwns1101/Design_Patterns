package com.lsj.abstract_factory;

public class MacCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Mac Style CheckBox!");
    }
}
