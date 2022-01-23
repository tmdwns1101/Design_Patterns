package com.lsj.factory_method.after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        return createShip(name);
    }

    Ship createShip(String name);

    void validate(String name, String email);
}
