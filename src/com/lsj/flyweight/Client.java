package com.lsj.flyweight;

public class Client {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();

        /*
        * 실제로 Font는 3개의 인스턴스만 생성됨.
        * */
        MyCharacter myCharacter1 = new MyCharacter('h', "red", fontFactory.getFont("NANUM:12"));
        MyCharacter myCharacter2 = new MyCharacter('e', "red", fontFactory.getFont("NANUM:12"));
        MyCharacter myCharacter3 = new MyCharacter('l', "blue", fontFactory.getFont("GODIC:14"));
        MyCharacter myCharacter4 = new MyCharacter('l', "black", fontFactory.getFont("NANUM:12"));
        MyCharacter myCharacter5 = new MyCharacter('o', "white", fontFactory.getFont("GODIC:12"));

        System.out.println(myCharacter1.getFont().equals(myCharacter2.getFont())); //같은 Font를 참조하고 있으므로, true가 나와야함.

        System.out.println(myCharacter1);
        System.out.println(myCharacter2);
        System.out.println(myCharacter3);
        System.out.println(myCharacter4);
        System.out.println(myCharacter5);
    }
}
