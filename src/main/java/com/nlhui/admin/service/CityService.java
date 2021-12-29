package com.nlhui.admin.service;

import com.nlhui.admin.pojo.City;
import com.nlhui.admin.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityMapper cityMapper;
    public City getCityById(int id){
        return  cityMapper.getCityById(id);
    }

}
