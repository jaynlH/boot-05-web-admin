package com.nlhui.admin.mapper;

import com.nlhui.admin.pojo.Count;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountMapper {
    public  Count getCount(int id);
}
