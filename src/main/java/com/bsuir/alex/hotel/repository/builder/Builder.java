package com.bsuir.alex.hotel.repository.builder;

import com.bsuir.alex.hotel.repository.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
