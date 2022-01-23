package com.lsj.factory_method.before;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {

        //validate
        if(name == null || name.trim().isEmpty()) {
            throw  new IllegalArgumentException("이름을 입력해주세요");
        }

        if(email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("이메일을 입력해주세요");
        }

        Ship ship = new Ship();
        ship.setName(name);

        //Customizing Logo
        if(name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("WhiteLogo");
        }
        if(name.equalsIgnoreCase("blackship")) {
            ship.setLogo("BlackLogo");
        }

        //Customizing Color
        if(name.equalsIgnoreCase("whiteship")) {
            ship.setColor("White");
        }
        if(name.equalsIgnoreCase("blackship")) {
            ship.setColor("Black");
        }

        return ship;
    }
}
