package com.java.chapter05_Singleton.문제;

public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();
    private TicketMaker(){

    }
    public static TicketMaker getInstance(){
        return singleton;
    }
    public synchronized int getNexticketNumber(){
        return ticket++;
    }
}
