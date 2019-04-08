package com.example.tcm.dao;

import com.example.tcm.pojo.Menu;

import java.util.List;

public interface MenuDAO {
    List<Menu> getAllMenu();
    List<Menu> getMenuByUserId(Integer userId);
}
