package com.example.tcm.service.impl;

import com.example.tcm.dao.MenuDAO;
import com.example.tcm.pojo.Menu;
import com.example.tcm.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDAO menuDAO;

    @Override
    public List<Menu> getAllMenu() {
        List<Menu> menus = menuDAO.getAllMenu();
        return makeMenuTree(menus);
    }

    @Override
    public List<Menu> getMenuByUserId(Integer userId) {
        List<Menu> menus = menuDAO.getMenuByUserId(userId);
        return makeMenuTree(menus);
    }

    private List<Menu> makeMenuTree(List<Menu> menus) {
        List<Menu> firstMenu = new ArrayList<>();
        Map<Integer, Menu> menuMap = new HashMap<>();
        for (Menu menu : menus) {
            menuMap.put(menu.getId(), menu);
            if (menu.getParentId() == null) {//一级菜单
                firstMenu.add(menu);
            }
        }
        for (Menu menu : menus) {
            if (menu.getParentId() != null && menuMap.containsKey(menu.getParentId())) {
                menuMap.get(menu.getParentId()).getChildren().add(menu);
            }
        }
        return firstMenu;
    }
}
