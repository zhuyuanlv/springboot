package com.phoenix.springboot.service;

import com.phoenix.springboot.mapper.AdminMapper;
import com.phoenix.springboot.pojo.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService {
    @Resource
    private AdminMapper adminMapper;

    public Admin selectOne(int id) {
        return adminMapper.selectOne(id);
    }
}
