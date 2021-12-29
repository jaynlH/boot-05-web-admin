package com.nlhui.admin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Count {
    private int id;
    private String name;
    private String email;
    private int balance;
}
