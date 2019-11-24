package com.eway.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eway.user.pojo.User;
import com.eway.user.service.UserService;

/**
* @author 程龙
* @version 创建时间：2019年11月22日 下午8:01:51
* @ClassName 类名称：
* @Description 类描述：
*/
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }
}
