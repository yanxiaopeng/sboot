package com.example.demo333.cn.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo333.cn.pojo.product;
import com.example.demo333.cn.service.GetService;
import com.example.demo333.cn.service.impl.GetServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GetController {
    @Autowired
    private GetServiceImpl dd;

    @RequestMapping("ssss")
    public String ss() {
        return "qqq";
    }

    //分页
    @RequestMapping("aaaa")
    @ResponseBody
    public String getAll(@RequestParam(required = false) Integer index, @RequestParam(required = false) Integer pageSize) {
        PageHelper.startPage(index, pageSize);
        List<product> list = dd.list();
        PageInfo pageInfo = new PageInfo(list);
        return JSON.toJSONString(pageInfo);
    }

    //查询单条
    @RequestMapping(value = "/d", produces = "text/json;charset=utf-8")
    public ModelAndView getss(@RequestParam(required = false) Integer pid) {
        product product = dd.get(pid);
        ModelAndView mav = new ModelAndView();
        mav.addObject("p", product);
        mav.setViewName("sss");
        return mav;
    }

    //删除
    @RequestMapping(value = "/c", produces = "text/json;charset=utf-8")
    public String getAll(@RequestParam(required = false) Integer pid) {
        int c = dd.del(pid);
        return "qqq";
    }

    //修改
    @RequestMapping(value = "/u", produces = "text/json;charset=utf-8")
    public ModelAndView update(@RequestParam(required = false) Integer pid, @RequestParam(required = false) String pname) {
        int c = dd.update(pname, pid);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("qqq");
        return mav;
    }
}
