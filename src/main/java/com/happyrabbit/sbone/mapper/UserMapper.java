package com.happyrabbit.sbone.mapper;

import com.happyrabbit.sbone.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM T_USER WHERE U_PHONE = #{uPhone}")
    User queryUserByPhone(@Param("uPhone") String phone);

    @Insert("INSERT INTO t_user(U_NAME, U_PASSWORD, U_PHONE) VALUES(#{uName}, #{uPassword}, #{uPhone})")
    int insertByUser(User user);

    @Update("UPDATE T_USER SET U_NAME = #{uName}, U_PASSWORD = #{uPassword} WHERE U_PHONE = #{uPhone}")
    int update(User user);

    @Delete("DELETE FROM T_USER WHERE U_ID = #{uId}")
    int delete(@Param("uId") Integer uId);
}
