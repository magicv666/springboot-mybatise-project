package com.happyrabbit.sbone.mapper;

import com.happyrabbit.sbone.entity.User;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;

    @Test
    //@Ignore
    public void queryUserByPhone() {

       User user = userMapper.queryUserByPhone("13333447755");
       assertEquals("Cia Wang",user.getuName());

    }

    @Test
    @Ignore
    public void insertByUser() {
        User u1 = new User();
        u1.setuName("jessyJ");
        u1.setuPassword("332244");
        u1.setuPhone("13333447755");
        //assertArrayEquals(1,userMapper.insertByUser(u1));
        assertEquals(1, userMapper.insertByUser(u1));
    }

    @Test
    @Ignore
    public void update() {
        User user = new User();
        user.setuName("Cia Wang");
        user.setuPassword("666666");
        user.setuPhone("13333447755");
        int effectNum = userMapper.update(user);
        assertEquals(1,effectNum);
    }

    @Test
    //@Ignore
    public void delete() {
        int effectNum = userMapper.delete(1);
        assertEquals(1,effectNum);
    }
}