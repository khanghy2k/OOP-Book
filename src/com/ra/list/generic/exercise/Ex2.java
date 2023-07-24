package com.ra.list.generic.exercise;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Product> products = Arrays.asList(
                new Product(1,"Tivi",3500,10),
                new Product(2,"Tủ Lạnh",4500,11),
                new Product(1,"Máy Giặt",5500,12),
                new Product(1,"Điều Hòa",6500,13)
        );
        //List Giỏ hàng
        List<CartItem> cartItems = new ArrayList<>();


        while (true){
            System.out.println("1.Danh sách sản phẩm");
            System.out.println("2.Mua Hàng");
            System.out.println("3.Xem giỏ Hàng");
            System.out.println("4.Thoát");
            System.out.println("Chọn Chức Năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :
                    System.out.println("Danh Sách sản phẩm");
                    for (Product p : products){
                        System.out.println(p);
                        System.out.println("------------");
                    }
                    break;
                case 2 :
                    System.out.println("Nhập mã sản phẩm :");
                    int _id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập số lượng :");
                    int _qty = Integer.parseInt(scanner.nextLine());
                    // Tìm sản phẩm cần mua

                    Product _pro = products.stream().filter( x->x.getId() ==_id).findFirst().orElse(null);
                    if (_pro == null){
                        System.out.println("Mã sản phẩm không tồn tại");
                    } else {
                        // Thêm vào giỏ hàng
                         CartItem oldItem = cartItems.stream().filter(x->x.getProduct().getId() == _id).findFirst().orElse(null);
                         if (oldItem != null){
                             // update số lượng
                             oldItem.setQuantity(oldItem.getQuantity() + _qty);
                         } else {
                             // Chưa có thì thêm mới
                             cartItems.add(new CartItem(_pro,_qty));
                         }
                         // Update Số lượng
                         _pro.setQuantity(_pro.getQuantity() - _qty);
                    }
                    break;
                case 3 :
                    System.out.println("Giỏ Hàng Đã Mua");
                    System.out.println("+------+---------------+-------+--------+-------------------+");
                    System.out.println("+Mã Sản Phẩm +Tên Sản Phẩm + Số Lượng + Đơn Giá + Thành Tiền +");
                    System.out.println("+------+---------------+-------+--------+--------------------+");
                    for (CartItem s: cartItems
                         ) {
                        System.out.printf("| %5d | %13s | %3d | %8.0f | %13.0f |\n", s.getProduct().getId(), s.getProduct().getName(), s.getQuantity(), s.getProduct().getPrice(), (s.getQuantity() * s.getProduct().getPrice()));
                    }
                    System.out.println("+------+---------------+-------+--------+--------------------+");

                    break;
                case 4 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sai tính năng");
            }
        }

    }
}
class Product {
    private int id;
    private String name;
    private  double price;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CartItem() {

    }
}