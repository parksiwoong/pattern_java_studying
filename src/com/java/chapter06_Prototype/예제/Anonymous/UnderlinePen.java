package com.java.chapter06_Prototype.예제.Anonymous;

import com.java.chapter06_Prototype.예제.framwork.Product;

//문자열에 밑줄을 표현하는 클래스 , use와 createClone을 구현
public class UnderlinePen implements Product {
    private char ulchar;
    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
     int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.println(" ");
        for(int i =0; i<length; i++){
            System.out.println(ulchar);
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
