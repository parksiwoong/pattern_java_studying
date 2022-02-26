package com.java.chapter08_AbstractFactory.예제.factory;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

//추상적인 제품
public abstract class Page {
    protected String title;
    protected String author;
    public ArrayList content = new ArrayList();

    public Page(String title, String author){
        this.title = title;
        this.author = author;
    }
    public void add(Item item){
        content.add(item);
    }
    public void output(){
        try{
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public abstract String makeHTML();
}
