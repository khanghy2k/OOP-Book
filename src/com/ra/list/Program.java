package com.ra.list;

import com.ra.list.generic.Category;
import com.ra.list.generic.ServiceImp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        int a = 5 , b = 6;
        String str1 = "Abc",str="Xyz";
        double x = 7 , z = 8;

        swapGeneric(a,b);
        swapGeneric(x,z);
        swapGeneric(str1,str);

        ServiceImp<Category,String> categoryServiceImp = new ServiceImp();





        List<String> names = new ArrayList<>();

        names.add("zxc");
        for (String s:names
             ) {
            System.out.println(s);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);

        List<Integer> numbersLinked = new LinkedList<>();
        numbersLinked.add(7);
        numbersLinked.add(6);

        for (int n : numbersLinked
             ) {
            System.out.println(n);

        }

        System.gc();

    }
    public static void swap(int a , int b){
        int temp = a;
        a = b ;
        b = temp;
        System.out.println("a =" + a + "b = "+ b);

    }
    public static void swapGeneric(double a , double b){
        double temp = a;
        a = b ;
        b = temp;
        System.out.println("a =" + a + "b = "+ b);

    }
    public static <T> void swapGeneric(T a , T b){
        T temp = a;
        a = b;
        b = temp;
        System.out.println("a =" + a + "b = "+ b);

    }
}
