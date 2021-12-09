package com.bsuir.alex.hotel.specification;

import java.util.List;

public interface Specification {
    String toSql();

    List<Object> getParameters();
}
