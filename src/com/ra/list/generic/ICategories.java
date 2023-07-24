package com.ra.list.generic;

import java.util.List;

public interface ICategories {
    List<Category> findAll();
    Category findId(String id);
    boolean add(Category item);
    boolean remove(String id);


}
