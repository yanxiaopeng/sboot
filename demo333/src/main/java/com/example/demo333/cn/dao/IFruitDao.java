package com.example.demo333.cn.dao;


import com.example.demo333.cn.pojo.product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IFruitDao {
    //查所有
    @Select("select * from product where status =1")
    List<product> list();

    //根据ID查询信息
    @Select("select * from product WHERE pid=#{pid} and status=1")
    product get(@Param("pid") int pid);

    //根据ID删除信息
    @Update("update product set status=0 where pid=#{pid} ")
    int del(@Param("pid") int pid);

    //根据ID修改信息
    @Update("update product set pname=#{pname} where pid=#{pid}")
    int up(@Param("pname") String pname, @Param("pid") int pid);
}
