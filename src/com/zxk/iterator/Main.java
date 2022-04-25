package com.zxk.iterator;


/**
 * @author zhouer
 * @date 2022-04-25
 */

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Lacan"));
        bookShelf.appendBook(new Book("Kant"));
        bookShelf.appendBook(new Book("Hegel"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
    /* 输出:
        Lacan
        Kant
        Hegel
     */
}
