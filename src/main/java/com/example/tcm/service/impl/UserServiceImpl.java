package com.example.tcm.service.impl;

import com.example.tcm.dao.UserDAO;
import com.example.tcm.pojo.User;
import com.example.tcm.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public PageInfo<User> getAllBUserByParentId(Integer parentId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return new PageInfo<>(userDAO.getAllBUserByParentId(parentId));
    }

    @Override
    public User getUserByUsername(String username,String password) {
        User user = userDAO.getUserByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            return null;
        }
        return user;
    }

    @Override
    public int addBUserBy(User user) {
        return userDAO.addBUserBy(user);
    }

    @Override
    public int deleteBUserBy(Integer userId) {
        return userDAO.deleteBUserBy(userId);
    }

    @Override
    public int updateBPassword(User user) {
        return userDAO.updateBPassword(user);
    }
}
