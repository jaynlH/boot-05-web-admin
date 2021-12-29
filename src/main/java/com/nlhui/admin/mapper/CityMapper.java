package com.nlhui.admin.mapper;

import com.nlhui.admin.pojo.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
    @Select("select * from test.city where id=#{id}")
    public City getCityById(int id);
}
