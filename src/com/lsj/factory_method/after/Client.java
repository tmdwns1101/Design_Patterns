package com.lsj.factory_method.after;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteShip", "t");
        client.print(new BlackShipFactory(), "blackShip", "tt");


    }

    public void print(ShipFactory shipFactory, String name, String email) {
        Ship ship = shipFactory.orderShip(name, email);
        System.out.println(ship);
    }
}
