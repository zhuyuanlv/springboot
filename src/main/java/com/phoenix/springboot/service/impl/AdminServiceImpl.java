package com.phoenix.springboot.service.impl;

import com.phoenix.springboot.mapper.AdminMapper;
import com.phoenix.springboot.pojo.Admin;
import com.phoenix.springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> queryAdminList() {
        return adminMapper.queryAdminList();
    }
}
