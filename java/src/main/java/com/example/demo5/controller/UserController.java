package com.example.demo5.controller;

import com.example.demo5.entity.User;
import com.example.demo5.service.UserService;
import com.example.demo5.utils.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseBody<?> add(@RequestBody User user) {
        int status = 0;
        String message = "";
        int result = userService.add(user);
        if(result == 1) {
            status = 1;
            message = "add success";
        }
        else {
            status = -1;
            message = "add failed";
        }
        return new ResponseBody<>(status, message, null);
    }
}
