package com.java.chapter01_iterator;

import java.util.ArrayList;

//서가를 나타내는 클래스
//이 클래스를 집합체로 다루기 위해 Aggregate 인터페이스를 구현함
public class BookShelf implements Aggregate {

    private ArrayList books;
    //private Book[] books;
    //private int last = 0;

    //맴버변수에 사이즈를 넣어줌 (책량)
    public BookShelf(int initialsize){this.books = new ArrayList(initialsize);}
    public Book getBookAt(int index){return (Book) books.get(index);}
    //public BookShelf(int maxsize){this.books = new Book[maxsize]; }
    //public Book getBookAt(int index){return books[index]; }

    public void appendBook(Book book){
        books.add(book);
    }
    public int getLength(){
        return books.size();
    }


    //0으로 초기화시킨 last에 0자리에 main에서 책한권을 넣어주며 last에도 책숫자도 그만큼 늘려줌
    /*
    public  void appendBook(Book book){
    this.books[last] = book;
    last++;
    }
    public int getLength(){
        return last;
    }
*/
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
