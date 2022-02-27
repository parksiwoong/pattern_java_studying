package com.java.chapter08_AbstractFactory.예제.listfactory;

import com.java.chapter08_AbstractFactory.예제.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String uml) {
        super(caption, uml);
    }

    @Override
    public String marketHTMl() {
        return "<li><a href=\""+ uml +"\">" + caption+    "</a></li>\n   " ;

    }
}
