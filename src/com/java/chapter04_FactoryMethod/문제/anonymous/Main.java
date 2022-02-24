package com.java.chapter04_FactoryMethod.문제.anonymous;


import com.java.chapter04_FactoryMethod.문제.idcard.IDCardFactory;
import com.java.chapter04_FactoryMethod.문제.framework.Product;
import com.java.chapter04_FactoryMethod.문제.framework.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("이순신");
        Product card3 = factory.create("홍길");
        card1.use();
        card2.use();
        card3.use();
    }
}
