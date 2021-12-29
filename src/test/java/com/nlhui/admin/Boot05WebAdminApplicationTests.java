package com.nlhui.admin;

import com.nlhui.admin.mapper.UserMapper;
import com.nlhui.admin.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@Slf4j
@SpringBootTest
class Boot05WebAdminApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
//        Integer integer = jdbcTemplate.queryForObject("select count(*) from count ", int.class);
//        log.info("共有{}条数据",integer);
        Long aLong = jdbcTemplate.queryForObject("select count(*) from test.count", Long.class);
        log.info("表中有{}条数据",aLong);
    }
    @Test
    public void testMP(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            log.info("{}",user);

        }
    }

}
