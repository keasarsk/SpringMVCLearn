package com.sk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("Hello") // 可以不加
public class HelloController {
    // 让url过来 访问地址 服务器地址/Hello/hello
    @RequestMapping("/hello")
    public String hello(Model model){
        // 封装数据 通过model
        // 向模型中添加msg属性并赋值 可以在jsp页面中取出
        model.addAttribute("msg","this is spring mvc demo");
        // void 的话默认找路径名相同的视图
        return "hello";// 会被视图解析器处理
    }

    @RequestMapping("/demo2")
    public String demo2(Model model){
        // 封装数据 通过model
        // model对象自动实例化 用于向视图中传值
        // 向模型中添加msg属性并赋值 可以在jsp页面中取出
        model.addAttribute("msg","this is  not spring mvc demo");
        // 返回视图位置
        return "demo2";
    }


    // 两个方法都指向视图demo3
    // 传递的数据不一样 展示的页面也不一样
    // 视图是被复用的
    @RequestMapping("/demo31")
    public String demo31(Model model){
        model.addAttribute("msg","demo31111");
        return "demo3";
    }
    @RequestMapping("/demo32")
    public String demo32(Model model){
        model.addAttribute("msg","demo32222");
        return "demo3";
    }

}
