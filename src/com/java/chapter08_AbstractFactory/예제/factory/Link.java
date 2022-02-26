package com.java.chapter08_AbstractFactory.예제.factory;

//html 의 추상적으로 표현하는 클래스
public abstract class Link extends Item {
    protected String uml;
    public Link(String caption,String uml){
        super(caption);
        this.uml = uml;
    }
}
