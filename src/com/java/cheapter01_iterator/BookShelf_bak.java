/*
package com.java.cheapter01_iterator;

import java.util.ArrayList;

//서가를 나타내는 클래스
//이 클래스를 집합체로 다루기 위해 Aggregate 인터페이스를 구현함
public class BookShelf_bak implements Aggregate {
    private Book[] books;
    private int last = 0;

    //맴버변수에 사이즈를 넣어줌 (책량)
    public BookShelf_bak(int maxsize){
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index){
        return books[index];
    }

    //0으로 초기화시킨 last에 0자리에 main에서 책한권을 넣어주며 last에도 책숫자도 그만큼 늘려줌
    public  void appendBook(Book book){
    this.books[last] = book;
    last++;
    }
    public int getLength(){
        return last;
    }

    public ArrayList Arr(Book book){
        ArrayList<Iterator> kingBook = new ArrayList<Iterator>();
        for(int i =0; i < books.length; i++){

        }
        return kingBook;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
*/
