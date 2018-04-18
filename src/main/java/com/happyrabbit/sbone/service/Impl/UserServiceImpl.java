package com.happyrabbit.sbone.service.Impl;

import com.happyrabbit.sbone.entity.User;
import com.happyrabbit.sbone.mapper.UserMapper;
import com.happyrabbit.sbone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findUserByPhone(String phone) {

        User user = userMapper.queryUserByPhone(phone);

        return user;
    }

    @Override
    public String addUser(User user) {

        int insertNum = userMapper.insertByUser(user);
        if (insertNum != 0) {
            return "success";
        }
        return "false";
    }

    @Override
    public String modifyUser(User user) {

        int modifyNum = userMapper.update(user);
        if (modifyNum > 0) {
            return "success";
        }
        return "false";
    }


}
