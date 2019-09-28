package com.atljl.parttime.mapper;


import com.atljl.parttime.model.User;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface userMapper {

    @Select("select * from user where ID=#{id}")
    public User getUserById(long id);

    @Select("select * from user where username=#{name}")
    public User getUserByUserName(String name);

    @Insert("insert into user(username,sex,ID,age,userpassword)values(#{user.username},#{user.sex},#{user.ID},#{user.age},#{user.userpassword})")
    public void addUser(@Param("user") User user);

    @Delete("delete from user where ID=#{id}")
    public void deleteUserByID(long id);

    @Update("update user set username=#{username},sex=#{sex},age=#{age},userpassword=#{userpassword} where ID=#{ID} ")
    public void updateUser(User user);
}
