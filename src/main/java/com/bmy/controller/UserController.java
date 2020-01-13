package com.bmy.controller;


import com.bmy.bean.User;
import com.bmy.service.Uservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller

public class UserController {
    @Autowired
    Uservice us;

    @GetMapping("/")
    public String findAll(Model m){
        List<User> list = us.findAll();
        m.addAttribute("list",list);
        return "list";
    }
    //点击add按钮，跳转到新增用户页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    //点击保存按钮，保存新增用户数据
    @PostMapping("/add")
    public String add(User user){
        us.save(user);
        return "redirect:/";
    }

    //跳转到编辑页面
    @GetMapping("/toEdit/{id}")
    public String toEdit(@PathVariable("id") Long id, Model model){
        User user = us.findOne(id);
        model.addAttribute("user",user);
        return "edit";
    }
    //保存修改数据
    @PostMapping("/update")
    public String update(User user){
        us.update(user);
        return "redirect:/";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        us.delete(id);
        return "redirect:/";
    }
    public String test1(String name){
        System.out.println("大神增加1");
        return "hah";
    }
    public String test2(int  id){
        System.out.println("大神增加2");
        return "hah";
    }
    public String test3(){
        System.out.println("大神增加3");
        return "hah";
    }


}
