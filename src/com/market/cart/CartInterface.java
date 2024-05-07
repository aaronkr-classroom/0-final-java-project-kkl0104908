package com.market.cart;

import com.market.bookitem.Book;

public interface CartInterface {
   void printBookList(Book[] p );
   boolean isCartInterBook(String id);
   void insertBook(Book p);
   void removwCart (int numId);
   void deleteBook();
}