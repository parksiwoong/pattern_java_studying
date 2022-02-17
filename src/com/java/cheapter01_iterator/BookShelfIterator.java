package com.java.cheapter01_iterator;

//검색실행하는 클래스
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;


    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }else {
            int i;
            return false;
        }

    }
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
