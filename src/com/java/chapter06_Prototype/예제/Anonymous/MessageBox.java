package com.java.chapter06_Prototype.예제.Anonymous;

import com.java.chapter06_Prototype.예제.framwork.Product;

import java.nio.charset.StandardCharsets;

//문자열을 테두로 표현하는 클래스 , use와 createClone 을 구현
public class MessageBox implements Product {
    private char decochar;
    public MessageBox(char doecochar){
        this.decochar = doecochar;
    }
    @Override
    public void use(String s) {
       int length = s.getBytes().length;
        for(int i  = 0; i < length + 4; i++){
            System.out.println(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for(int i = 0; i < length+4; i++){
            System.out.println(decochar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try{
            p = (Product)clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return p;
    }
}
