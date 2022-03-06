package com.java.chapter05_Singleton.예제2;

import java.nio.channels.SeekableByteChannel;

public class Settings {
    /*
    private static Settings instuns;
    private Settings(){}

    public static Settings getInstance(){
        if(instuns == null){
            instuns = new Settings();
        }
        return instuns;
    }*/

    // 꼭 나중에 만들지 않아도 된다, 만드는 비용이 그렇게 비싸지 않다. 할땐 미리 만들어도 됨
    private static final Settings INSTUNCE = new Settings();

    private Settings(){};

    public static Settings getInstance(){
        return INSTUNCE;
    }
}
