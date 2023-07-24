package com.ra.list.generic.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /**
         * 1.	Tạo một lớp Book có:
         *      •	Các thuộc tính:
         *          	String isbn;
         *          	String bookName;
         *          	String author;
         *          	String publisher;
         *          	float price;
         *      •	Tạo các constructor và các phương thức getter/setter
         *      •	Cài đặt phương thức toString() để hiển thị thông tin Book
         * 2.	Tạo lớp Test thực hiện các chức năng theo menu sau
         *      *********************MENU*************************
         *      1.	Nhập thông tin cho n sách
         *      2.	Hiển thị thông tin sách
         *      3.	Hiển thị thông tin sách theo giá giảm dần
         *      4.	Hiển thị thông tin sách theo tên sách tăng dần
         *      5.	Thoát
         * */
        Scanner scanner = new Scanner(System.in);
        int n = 0 ;
        Book[] books = null;
        while (true){
            System.out.println("*********************MENU*************************");
            System.out.println("1. Nhập thông tin cho n sách");
            System.out.println("2. Hiển thị thông tin các sách đã nhập");
            System.out.println("3. Hiển thị thông tin sách theo giá giảm dần");
            System.out.println("4. Hiển thị thông tin sách theo giá Tăng dần");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :
                    System.out.println("Nhập số lượng sách n :");
                    n = scanner.nextInt();
                    scanner.nextLine();
                    books = new Book[n];
                    for (int i = 0 ; i<n;i++){
                        System.out.println("Nhập thông tin cho sách thứ " + (i + 1) + ":");
                        System.out.print("ISBN: ");
                        String isbn = scanner.nextLine();
                        System.out.print("Tên sách: ");
                        String bookName = scanner.nextLine();
                        System.out.print("Tác giả: ");
                        String author = scanner.nextLine();
                        System.out.print("Nhà xuất bản: ");
                        String publisher = scanner.nextLine();
                        System.out.print("Giá sách: ");
                        float price = scanner.nextFloat();
                        scanner.nextLine();

                        books[i] = new Book(isbn,bookName,author,publisher,price);
                    }
                    break;
                case 2 :
                    if (books == null){
                        System.out.println("Chưa nhập thông tin sách");
                    } else {
                        System.out.println("Sách");
                        for (Book b:books
                             ) {
                            System.out.println(b);
                        }
                    }
                    break;
                case 3 :
                    Arrays.sort(books, Comparator.comparingDouble(Book::getPrice).reversed());
                    for (Book b:books
                         ) {
                        System.out.println(b);
                    }
                    break;
                case 4 :
                    Arrays.sort(books,Comparator.comparingDouble(Book::getPrice));
                    for (Book b:books
                         ) {
                        System.out.println(b);
                    }
                    break;
                default:
                    System.out.println("Chọn sai chức năng");
            }

        }
    }
    static class Book {
        private String isbn;
        private String bookName;
        private String author;
        private String publisher;
        private float price;

        public Book(String isbn, String bookName, String author, String publisher, float price) {
            this.isbn = isbn;
            this.bookName = bookName;
            this.author = author;
            this.publisher = publisher;
            this.price = price;
        }

        public Book() {

        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "isbn='" + isbn + '\'' +
                    ", bookName='" + bookName + '\'' +
                    ", author='" + author + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
