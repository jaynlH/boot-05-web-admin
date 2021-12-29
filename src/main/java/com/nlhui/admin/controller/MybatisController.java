package com.nlhui.admin.controller;

import com.nlhui.admin.pojo.City;
import com.nlhui.admin.pojo.Count;
import com.nlhui.admin.service.CityService;
import com.nlhui.admin.service.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MybatisController {
    @Autowired
    private CountService countService;
    @Autowired
    private CityService cityService;

    @ResponseBody
    @RequestMapping("/count/{id}")
    public Count getCo(@PathVariable("id") int id){

        return countService.getCount(id);
    }
    @ResponseBody
    @RequestMapping("city/{id}")
    public City getCityByID( @PathVariable("id") int id){
        return cityService.getCityById(id);

    }
}

