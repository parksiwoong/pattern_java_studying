package com.java.chapter01_iterator;

//tihs 를 쓰는 클래스 안에 단순한 전역변수(맴버변수) 초기화뿐 아니라 더 많은 이해를 위한 테스트
public class App {
    public static void main(String[] args) throws Exception{
        SampleCalss item = new SampleCalss(3);
        item.printValue(2);
    }
}
class SampleCalss {
    private int test;

    public SampleCalss() {
        this.test = 0;
    }
    public SampleCalss(int test){
        System.out.println("before >> this.test : " + this.test);
        System.out.println("test :" +test);
        this.test = test;
        System.out.println("after >> this.test " + this.test);
    }

    public void printValue(int test){
        System.out.println("before >> this.test : " + this.test);
        System.out.println("test : " + test);
        System.out.println("afrter >> this.test " + this.test);
    }
}