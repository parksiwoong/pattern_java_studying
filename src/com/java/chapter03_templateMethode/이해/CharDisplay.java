package com.java.chapter03_templateMethode.이해;
//메서드 open, print, method 를 구현하고있는 클래스
public class CharDisplay extends AbstrackDisplasy {
        private char ch;
        public CharDisplay(char ch){        //생성자에서 전잘되는 문자 ch를
            this.ch = ch;                   //필드에 기억해둔다
    }

    @Override
    public void open() {
        System.out.println("<<");
    }

    @Override
    public void print() {
        System.out.println(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
