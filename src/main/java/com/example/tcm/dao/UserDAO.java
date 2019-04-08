package com.example.tcm.dao;

import com.example.tcm.pojo.User;

import java.util.List;

public interface UserDAO {

    //返回所有B级用户
    List<User> getAllBUserByParentId(Integer parentId);

    //根据用户名查找用户
    User getUserByUsername(String username);

    //添加B级用户
    int addBUserBy(User user);

    //删除B级用户
    int deleteBUserBy(Integer userId);

    //修改B级用户密码
    int updateBPassword(User user);

}
