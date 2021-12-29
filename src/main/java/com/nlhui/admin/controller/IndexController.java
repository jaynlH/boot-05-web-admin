package com.nlhui.admin.controller;

import com.nlhui.admin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping({"/","/login"})
    public String loginPage(){

        return "login";
    }
    @PostMapping("/login")
    public String toMainPage(User user, HttpSession session, Model model){
//重定向，防止表单重复提交
        if (StringUtils.hasLength(user.getUserName())&&StringUtils.hasLength(user.getPassword())){
            session.setAttribute("loginUser",user);
//    th:text="${session.loginUser.userName}"
            return "redirect:/mains.html";
        }else {

            model.addAttribute("msg","账号不存在或密码为空");
            return "login";
        }

    }
    @RequestMapping("/mains.html")
    public String mainPage( HttpSession session,Model model){
        return "main";
    }

}
