package com.java.chapter05_Singleton.문제;

public class Main {
    public static void main(String[] args) {
        System.out.println("star'");
        for (int i = 0 ;i<10 ; i++){
            System.out.println(i + ":" +
                    TicketMaker.getInstance().getNexticketNumber());
        }
        System.out.println("end");
    }
}
