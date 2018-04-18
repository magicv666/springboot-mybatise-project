package com.happyrabbit.sbone.web;

import com.happyrabbit.sbone.entity.User;
import com.happyrabbit.sbone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class sboneController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/find",method = RequestMethod.GET)     //http://localhost:8080/user/find?phone=*****
    public User findUserByPhone(@RequestParam String phone, Model model){

        User user = userService.findUserByPhone(phone);

        return user;

    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)     //http://localhost:8080/user/add
    public String addUser(){

        User user = new User();

        user.setuName("许小玉");
        user.setuPhone("13301336641");
        user.setuPassword("0997755");

        return userService.addUser(user);

    }

    @RequestMapping(value = "/modify",method = RequestMethod.GET)     //http://localhost:8080/user/modify

    public String modifyUser(){

        User user = new User();
        user.setuName("杨利伟");
        user.setuPhone("18901330001");
        user.setuPassword("666666");

        return userService.modifyUser(user);
    }


}
