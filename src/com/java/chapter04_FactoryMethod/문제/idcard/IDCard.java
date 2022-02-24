package com.java.chapter04_FactoryMethod.문제.idcard;

import com.java.chapter04_FactoryMethod.문제.framework.Product;

//메소드 use를 구현하고 있는 클래스
public class IDCard extends Product {
    private String owner;
    private int serial;

    public IDCard(String owner, int serial){
        System.out.println(owner+"("+ serial + "의 카드 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }
    public String getOwner(){
        return owner;
    }
    public int getSerial(){
        return serial;
    }
}


