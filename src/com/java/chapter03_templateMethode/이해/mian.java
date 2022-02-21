package com.java.chapter03_templateMethode.이해;

public class mian {
    public static void main(String[] args) {
        // H를 가진 인스턴스를 만든다 
        AbstrackDisplasy di = new CharDisplay("h");
        AbstrackDisplasy d2 = new StringDisplay('hello, world');
        AbstrackDisplasy d3 = new StringDisplay("안녕하세여");
    }
}

