package com.java.chapter04_FactoryMethod.문제.framework;

import com.java.chapter04_FactoryMethod.문제.framework.Product;

//추상 메소드 use만 정의되어 있는 추상클래스
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
