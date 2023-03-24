package com.example.demo5.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo5.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> { }
