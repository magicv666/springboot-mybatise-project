package com.happyrabbit.sbone.service;

import com.happyrabbit.sbone.entity.User;

public interface UserService {

    //List<User> findUserAll();

    User findUserByPhone(String phone);

    String addUser(User user);

    String modifyUser(User user);

}
