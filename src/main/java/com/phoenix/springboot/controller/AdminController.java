package com.phoenix.springboot.controller;

import com.phoenix.springboot.pojo.Admin;
import com.phoenix.springboot.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AdminController {
    @Resource
    private AdminService adminService;

    @GetMapping("/test")
    public Admin queryAdminList() {
        int id = 2;
        return adminService.selectOne(id);
    }
}
