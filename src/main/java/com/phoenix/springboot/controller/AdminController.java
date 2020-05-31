package com.phoenix.springboot.controller;

import com.phoenix.springboot.mapper.AdminMapper;
import com.phoenix.springboot.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminMapper adminMapper;

    @GetMapping("/queryAdminList")
    public List<Admin> queryAdminList(){
        List<Admin> adminList =adminMapper.queryAdminList();
        return adminList;
    }
}
