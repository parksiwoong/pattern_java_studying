package com.java.chapter07_Builder.예제;
//한개의 문서를 만드는 클래스
public class Director {
    private Builder builder;
    public Director(Builder builder){ //builder의 하위 클래스의 인스턴스가 주어지므로
                                    //builder 필드에 저장해 둔다.
        this.builder = builder;
    }
    public void construct(){ //문서구축
        builder.makeTitle("Greeting");  //타이틀
        builder.makeString("아침과 낯에"); //문자열
        builder.makeItems(new String[]{ //개별 항목
            "좋은 아침입니다.",
            "안녕하세요",
        });
        builder.makeString("밤에");   //별도의 문자열
        builder.makeItems(new String[]{
                "안녕하세요.",
                "안녕히 주무세요.",
                "안녕히 계세요,"
        });
        builder.close();            //문서를 완성시킨다.
    }
}
