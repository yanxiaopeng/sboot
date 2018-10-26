package com.example.demo333.cn.service;

import com.example.demo333.cn.pojo.product;

import java.util.List;

public interface GetService {
    List<product> list();

    product get(int pid);

    int del(int pid);

    int update(String pname, int pid);
}
