package com.java.chapter03_templateMethode.예제.이해_1;

//  메서드 display만 구현되고 있는 추상 클래스
public abstract class AbstrackDisplasy {
    public abstract void open(); //하위 클래스에 구현을 맡기는 추상메서드(1) open
    public abstract void print(); // " " " print
    public abstract void close(); // close
    public final void Display(){
        open();
        for(int i =0 ; i < 5; i++){
            print();
        }
        close();
    }
}
