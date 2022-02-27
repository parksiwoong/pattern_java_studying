package com.java.chapter08_AbstractFactory.예제.factory;
import java.util.ArrayList;

//Link와 Tray는 add메소드를 사용해서 모읍니다.
public class Tray extends Item {
    protected ArrayList tray = new ArrayList();
    public Tray(String caption){
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }
    @Override
    public String marketHTMl() {
        return null;
    }
}
