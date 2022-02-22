package com.java.chapter03_templateMethode.예제.이해_1;

//메서드 open, print, method 를 구현하고있는 클래스
public class StringDisplay extends AbstrackDisplasy {
    private String string;
    private int width;
    public StringDisplay(String string){
        this.string = string;
        this.width = string.getBytes().length;        // 바이트 단위의 길이도 필드에 기억해두고 나중에 사용한다
    }
    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string +"|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine(){
        System.out.println("+");
        for(int i =0; i<width; i++){
            System.out.println("-");
        }
        System.out.println("+");
    }

}
