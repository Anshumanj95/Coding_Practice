package com.company;
import java.util.Scanner;

class library{
    String[] book;
    int no_of_books;
    library(){
        this.book=new String[100];
        this.no_of_books=0;
    }
    void addbook(String book){
        this.book[no_of_books]=book;
        no_of_books++;
    }
    void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (String book : this.book) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }
        void issueBooks(String book){
            for(int i=0;i<this.book.length;i++){
                if(this.book[i].equals(book)){
                    System.out.println(book+" is issued");
                    this.book[i]=null;
                    return;
                }
            }
            System.out.println("Please enter book which is available ");
        }
        void returnBook(String book){
        addbook(book);
            System.out.println(book+" is returned");
    }
}

public class Java_library {
    public static void main(String[] args) {
        library central=new library();
        Scanner sc=new Scanner(System.in);
        central.addbook("Absolute java");
        central.addbook("Data Structure And Algo");
        central.addbook("N.D.Bhath");
        central.addbook("B.S.Grewall");
        central.showAvailableBooks();
        central.issueBooks("Data Structure And Algo");
        central.showAvailableBooks();
        central.returnBook("Data Structure And Algo");
        central.showAvailableBooks();
    }

}
