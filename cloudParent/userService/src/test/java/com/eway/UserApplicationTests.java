package com.eway;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.eway.user.mapper.UserMapper;
import com.eway.user.pojo.User;



@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {
    
    @Autowired
    private UserMapper userMapper;
    
    @Test
    public void contextLoads() {
    }
    
    @Test
    public void testUserMapper() {
        
        User u = userMapper.selectByPrimaryKey(1L);
        
        System.out.println(u);
    }
}
