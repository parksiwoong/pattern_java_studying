package com.java.chapter04_FactoryMethod.문제.idcard;

import com.java.chapter04_FactoryMethod.문제.framework.Factory;
import com.java.chapter04_FactoryMethod.문제.framework.Product;
import com.java.chapter04_FactoryMethod.문제.idcard.IDCard;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

//메소드 createproduct, registerProduct를 구현하고 있는 클래스
public class IDCardFactory extends Factory {
    private List owneres = new ArrayList();
    private int serial = 100;


    protected Product createProduct(String owner, int serial) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected Product createProduct(String owner) {
        return null;
    }

    @Override
    protected void registerProduct(Product product) {
        owneres.add(((IDCard)product).getOwner());
    }


}
