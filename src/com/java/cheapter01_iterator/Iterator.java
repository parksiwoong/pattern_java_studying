package com.java.cheapter01_iterator;

//하나씩 나열하며 루프 변수와 같은 역할 수행
public interface Iterator {
    public abstract boolean hasNext(); //다음요소가 존재하는 조사하는 메서드
    public abstract Object next();  //다음 요소를 얻기위한 메서드
}
