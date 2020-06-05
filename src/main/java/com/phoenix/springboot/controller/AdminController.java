package com.phoenix.springboot.controller;

import com.phoenix.springboot.pojo.Admin;
import com.phoenix.springboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/queryAdminList")
    public List<Admin> queryAdminList(){
        return adminService.queryAdminList();
    }
}
