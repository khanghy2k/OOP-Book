package com.ra.list.generic;

import java.util.List;

public interface IService<T,K> {
    List<T> findAll();
    T findId(K id);
    boolean add(T item);
    boolean remove(K id);
}
