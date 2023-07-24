package com.ra.list.generic.exercise;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {


        // Tạo class generic mô phỏng class ArayList
        // , có thể lư trữ 1 tập hợp các giá trị
        // có phương thức showList() để hiện thị các phần tử lưu trữ trong tập hợp

        MyList<String> data = new MyList<>();
        data.add("Hy");
        data.add("Tuấn");
        data.add("Thanh");
        data.add("Hương");
        data.showList();
    }
}
class MyList<T> {
    private List<T> elements;
    private int size;
    public MyList(){
       this.elements = new ArrayList<>();
    }
    public void add(T item){
        this.elements.add(item);
    }
    public void showList(){
        for (T item:elements
             ) {
            System.out.println(item);

        }
    }
}
