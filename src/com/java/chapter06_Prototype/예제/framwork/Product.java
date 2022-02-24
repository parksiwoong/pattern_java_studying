package com.java.chapter06_Prototype.예제.framwork;

//추상메서드 use와 createClon이 선언되어있는 인터페이스
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
