package com.ra.list.generic;

import java.util.List;

public class CategoriesService implements IService<Category,Integer>{
    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category findId(Integer id) {
        return null;
    }

    @Override
    public boolean add(Category item) {
        return false;
    }

    @Override
    public boolean remove(Integer id) {
        return false;
    }
}
