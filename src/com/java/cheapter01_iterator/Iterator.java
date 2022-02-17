package com.java.cheapter01_iterator;

//하나씩 나열하며 루프 변수와 같은 역할 수행
public interface Iterator {
    public abstract boolean hasNext(); //다음요소 next메서드를 불러도 괜찮은지 조사하는것' 이라고 기역
    public abstract Object next();  //다음 요소를 얻기위한 메서드
}
