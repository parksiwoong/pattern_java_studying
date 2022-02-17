package com.java.cheapter01_iterator;
//이터레이터 패턴은 집합체에서 하나씩 요소를 꺼내서 새는 것
// 이터레이터 인터페이스를 중점으로 시작해 만드는 하나의 로직구현
public class Main {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Clnderella"));
        bookShelf.appendBook(new Book("Daddy-Long_Legs"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
