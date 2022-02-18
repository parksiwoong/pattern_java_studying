package com.java.chapter02_Adapter;

public class PrintBanner extends Print{
//public class PrintBanner extends Print {
//public class PrintBanner extends Banner implements Print {
    private Banner banner;

    public PrintBanner(String string){
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }
    public void printStrong() {
        banner.showWithAster();
    }
}
