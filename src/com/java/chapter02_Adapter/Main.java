package com.java.chapter02_Adapter;

/* 이미 제공되어 있는것, 필요한것 사이의 차이를 없애주는(연결) 디자인 패턴
*  여러 부품들이 있고 그것들을 어뎁터를 이용해 쉽게 갈아끼울수있는 부품사이의 역할
* */
public class Main {

    public static void main(String[] args) {
       Print p = new PrintBanner("hello");
        p.printWeak();
        p.printStrong();
    }

}
