package com.java.chapter06_Prototype.예제.framwork;

import com.java.chapter06_Prototype.예제.Anonymous.MessageBox;
import com.java.chapter06_Prototype.예제.Anonymous.UnderlinePen;

//복사해서 인스턴스 만들기
// 쓰는이유 : 클래스가 너무 많아서 관리가 힘들때 사용하는 패턴
public class Main {
    public static void main(String[] args) {
        //준비
    Manager manager = new Manager();
    UnderlinePen upen = new UnderlinePen('~');
    MessageBox mbox = new MessageBox('*');
    MessageBox sbox = new MessageBox('/');
    manager.register("strong message", upen);
    manager.register("warning box", mbox);
    manager.register("slash box", sbox);

    //생성
    Product p1 = manager.create("strong message");
    p1.use("Hello, world.");
    Product p2 = manager.create("warning box");
    p2.use("Hello, world");
    Product p3 = manager.create("slash box");
    p3.use("Hello, world");
    }
}
