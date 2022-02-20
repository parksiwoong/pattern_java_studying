package com.java.chapter03_templateMethode.이해;

//  메서드 display만 구현되고 있는 추상 클래스
public abstract class AbstrackDisplasy {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void Display(){
        open();
        for(int i =0 ; i < 5; i++){
            print();
        }
        close();
    }
}
