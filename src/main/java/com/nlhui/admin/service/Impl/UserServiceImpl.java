package com.nlhui.admin.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nlhui.admin.mapper.UserMapper;
import com.nlhui.admin.pojo.User;
import com.nlhui.admin.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
