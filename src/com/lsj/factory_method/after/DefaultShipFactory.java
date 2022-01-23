package com.lsj.factory_method.after;

public abstract class DefaultShipFactory implements ShipFactory{

    @Override
    public void validate(String name, String email) {
        if(name == null || name.trim().isEmpty()) {
            throw  new IllegalArgumentException("이름을 입력해주세요");
        }

        if(email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("이메일을 입력해주세요");
        }
    }
}
