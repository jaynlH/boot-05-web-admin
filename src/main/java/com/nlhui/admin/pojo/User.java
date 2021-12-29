package com.nlhui.admin.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;
    @TableId(type = IdType.ASSIGN_ID)
    private Integer id;
    private String name;
    private Integer age;
    private String email;



}
