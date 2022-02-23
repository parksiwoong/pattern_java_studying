package com.java.chapter04_FactoryMethod.예제.idcard;

import com.java.chapter04_FactoryMethod.예제.framework.Factory;
import com.java.chapter04_FactoryMethod.예제.framework.Product;

import java.util.ArrayList;
import java.util.List;

//메소드 createproduct, registerProduct를 구현하고 있는 클래스
public class IDCardFactory extends Factory {
    private List owneres = new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owneres.add(((IDCard)product).getOwner());
    }
}
