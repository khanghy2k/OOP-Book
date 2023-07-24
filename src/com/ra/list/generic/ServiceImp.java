package com.ra.list.generic;

import java.util.List;

public class ServiceImp<T extends BaseEntity,K> implements IService<T,K>{
    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T findId(K id) {
        return null;
    }

    @Override
    public boolean add(T item) {
        return false;
    }

    @Override
    public boolean remove(K id) {
        return false;
    }
}
