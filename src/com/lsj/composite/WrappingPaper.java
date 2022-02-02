package com.lsj.composite;

public class WrappingPaper extends Container {

    private final static int EXTRA_PRICE = 1000;

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum() + EXTRA_PRICE;
    }
}
