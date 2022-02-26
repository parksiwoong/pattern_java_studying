package com.java.chapter08_AbstractFactory.예제.factory;

//Link와 tray의 상위 클래스 '항목'
public abstract class Item {
    public String caption;
    public Item(String caption){
        this.caption = caption;
    }
    public abstract String marketHTMl();
  }
