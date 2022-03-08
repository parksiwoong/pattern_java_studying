package com.java.chapter06_Prototype.예제.framwork;

import java.util.HashMap;

// createClrone을 사용해서 인스턴스를 복제하는 클래스
public class Manager {
    private HashMap showcate = new HashMap();

    public void register(String name ,Product proto){
        showcate.put(name, proto);
    }
    public Product create(String protoname){
        Product p = (Product)showcate.get(protoname);
        return p.createClone();
    }
}
