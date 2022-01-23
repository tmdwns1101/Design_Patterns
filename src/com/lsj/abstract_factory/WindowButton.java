package com.lsj.abstract_factory;

public class WindowButton implements Button {
    @Override
    public void paint() {
        System.out.println("Window Style Button");
    }
}
