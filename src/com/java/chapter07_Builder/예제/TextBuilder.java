package com.java.chapter07_Builder.예제;

//일반 텍스트(보통문자열)를 이용해서 문서를 만드는 클래스
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer(); //필드의 문서를 구축한다.

    @Override
    public void makeTitle(String title) {
        buffer.append("==============\n"); //장식선
        buffer.append("W"+ title +"W"); //W를 사용한 타이틀
        buffer.append("\n"); //빈 행
    }
    @Override
    public void makeString(String str) {
        buffer.append('d'+str+"\n");    //글머리 기호 붙은 문자열

    }

    @Override
    public void makeItems(String[] items) {

    }

    @Override
    public void close() {

    }
}
