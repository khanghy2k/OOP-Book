package com.ra.list.generic;

import java.util.List;

public class ProductService implements IService<Product,String> {


    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findId(String id) {
        return null;
    }

    @Override
    public boolean add(Product item) {
        return false;
    }

    @Override
    public boolean remove(String id) {
        return false;
    }
}
