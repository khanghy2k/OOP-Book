package com.ra.list.generic;

import java.util.List;

public interface IProduct {
    List<Product> findAll();
    Product findId(String id);
    boolean add(Product item);
    boolean remove(String id);
}
