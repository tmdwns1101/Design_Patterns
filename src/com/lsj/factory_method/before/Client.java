package com.lsj.factory_method.before;

public class Client {
    public static void main(String[] args) {
        Ship ship1 = ShipFactory.orderShip("whiteship", "tmdwns1101@naver.com");
        System.out.println(ship1);
        Ship ship2 = ShipFactory.orderShip("blackship", "tmdwns11011@gmail.com");
        System.out.println(ship2);
    }
}
