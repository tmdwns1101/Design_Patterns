package com.lsj.composite;


public class Box extends Container {

    private final static int EXTRA_PRICE = 3000;


    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum() + EXTRA_PRICE;
    }
}
