package com.example.demo333.cn.service.impl;


import com.example.demo333.cn.dao.IFruitDao;
import com.example.demo333.cn.pojo.product;
import com.example.demo333.cn.service.GetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetServiceImpl implements GetService {

    @Autowired
    private IFruitDao dd;

    //分页
    @Override
    public List<product> list() {

        return dd.list();
    }

    //查询
    @Override
    public product get(int pid) {
        return dd.get(pid);
    }

    //删除
    @Override
    public int del(int pid) {
        return dd.del(pid);
    }


    //修改
    @Override
    public int update(String pname, int pid) {

        return dd.up(pname, pid);
    }


}
