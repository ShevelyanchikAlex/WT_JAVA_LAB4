package com.bsuir.alex.hotel.repository.queryoperator;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface QueryOperator {
    String makeInsertQuery(Map<String, Object> fields, String table);

    String makeUpdateQuery(Map<String, Object> fields, String table);

    void prepare(PreparedStatement preparedStatement, Map<String, Object> fields) throws SQLException;

    void prepare(PreparedStatement preparedStatement, List<Object> params) throws SQLException;

}
