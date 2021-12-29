package com.nlhui.admin.service;

import com.nlhui.admin.pojo.Count;
import com.nlhui.admin.mapper.CountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountService {
    @Autowired
    CountMapper countMapper;
    public Count getCount(int id){
       return   countMapper.getCount(id);
    }
}
