package com.java.chapter08_AbstractFactory.예제.listfactory;

import com.java.chapter08_AbstractFactory.예제.factory.Link;

//
public class ListFactory {
    public Link createLink(String caption,  String url){
        return new ListLink(caption, url);
    }
}
