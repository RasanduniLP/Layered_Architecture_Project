package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public interface OrderDetailDAO {
    public boolean saveDetails(OrderDetailDTO detailDTO, String orderId) throws SQLException, ClassNotFoundException;
}
