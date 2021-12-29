package com.nlhui.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Slf4j
@Controller
public class formController {
    @GetMapping("/form_layouts")
    public String form_layouts(){
        return "form/form_layouts";
    }
    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("password") String password,
                         @RequestPart("file") MultipartFile file,
                         @RequestPart("multiFile") MultipartFile[] files) throws IOException {
        log.info("上传的邮件为{},上传的密码为{},文件的大小为{},文件的数量为{}",email,password,file.getSize(),files.length);
        if (!file.isEmpty()){
            String originalFilename = file.getOriginalFilename();
            file.transferTo(new File("D:/springbootFile/"+originalFilename));
        }
        if (files.length>0){
            for (MultipartFile multipartFile : files) {
                if (!multipartFile.isEmpty()){
                    String originalFilename = multipartFile.getOriginalFilename();
                    multipartFile.transferTo(new File("D:/springbootFile/"+originalFilename));
                }
            }
        }
    return "main";
    }
}
