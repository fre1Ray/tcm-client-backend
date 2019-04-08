package com.example.tcm.service;

import com.example.tcm.pojo.User;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    //返回所有B级用户
    PageInfo<User> getAllBUserByParentId(Integer parentId,Integer pageNum,Integer pageSize);

    //根据用户名查找用户
    User getUserByUsername(String username,String password);

    //添加B级用户
    int addBUserBy(User user);

    //删除B级用户
    int deleteBUserBy(Integer userId);

    //修改B级用户密码
    int updateBPassword(User user);
}
