/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minilibrary;

import java.util.ArrayList;

/**
 *
 * @author wardi
 */
public class MiniLibrary {
    
    private ArrayList<Book> bookList;
    
    public MiniLibrary() {
        this.bookList = new ArrayList<>();
    }
    
    public void addBook (Book book) {
        bookList.add(book);
    }
    
    public Book findBookByTitle(String book_title) {
        for (Book book : bookList) {
            if (book.getBookTitle().equalsIgnoreCase(book_title)) {
                return book;
            }
        }
        
        return null;
    }
    
}
