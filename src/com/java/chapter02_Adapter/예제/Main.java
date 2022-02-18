package com.java.chapter02_Adapter.예제;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        FileIO f = new FileProperties() ;
        try {
            f.readFromFile("file.txt");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
