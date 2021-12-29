package com.nlhui.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nlhui.admin.pojo.User;
import com.nlhui.admin.service.Impl.UserServiceImpl;
import com.nlhui.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {
    @Autowired
    UserService userService;

    @GetMapping("/basic_table")
    public String basic_table(){
        return "/table/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model,@RequestParam(value = "pn" ,defaultValue = "1") Integer n){

        List<User> list = userService.list();

        Page<User> userPage = new Page<>(n,3);
        IPage<User> page = userService.page(userPage,null);

        model.addAttribute("page",page);

        return "/table/dynamic_table";
    }
    @GetMapping("/editable_table")
    public String editable_table(){
        return "/table/editable_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table(){
        return "/table/responsive_table";
    }


    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id,
                             @RequestParam(value="pn",defaultValue ="1")Integer pn,
                             RedirectAttributes ra){
        userService.removeById(id);
        ra.addAttribute("pn",pn);
        return "redirect:/dynamic_table";
    }

}

