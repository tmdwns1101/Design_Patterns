package com.lsj.composite;

public class Client {
    public static void main(String[] args) {
        Product product1 = new Product("초콜릿", 1000);
        Product product2 = new Product("햄버거", 2000);
        Product product3 = new Product("과자", 1000);
        Product product4 = new Product("음료수", 1500);
        Product product5 = new Product("피자", 3000);

        Box box = new Box();
        box.add(product1);
        box.add(product2);

        WrappingPaper wrappingPaper = new WrappingPaper();
        wrappingPaper.add(product3);
        wrappingPaper.add(product4);
        wrappingPaper.add(box);

        Box rootBox = new Box();
        rootBox.add(wrappingPaper);
        rootBox.add(product5);

        //추가 가격 : 박스 2개(6000) +  포장지 1개(1000)
        System.out.println("총 금액 : " + rootBox.getPrice());
    }
}
