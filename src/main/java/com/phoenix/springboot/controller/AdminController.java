package com.phoenix.springboot.controller;

import com.phoenix.springboot.pojo.Admin;
import com.phoenix.springboot.service.AdminService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AdminController {
    @Resource
    private AdminService adminService;

    @RequestMapping("selectById")
    public Admin selectById(int id) {
        return adminService.selectById(id);
    }

    @RequestMapping("selectList")
    public List<Admin> selectList() {
        return adminService.selectList();
    }

    @RequestMapping("insert")
    public String insert(@RequestBody Admin admin) {
        int resultCode = adminService.insert(admin);
        if (resultCode >= 1) {
            return "插入成功！";
        } else {
            return "插入失败！";
        }
    }

    @RequestMapping("updateById")
    public String update(@RequestBody Admin admin) {
        int resultCode = adminService.updateById(admin);
        if (resultCode >= 1) {
            return "更新成功！";
        } else {
            return "更新失败！";
        }
    }

    @RequestMapping("deleteById")
    public String deleteById(int id) {
        int resultCode = adminService.deleteById(id);
        if (resultCode >= 1) {
            return "删除成功！";
        } else {
            return "删除失败！";
        }
    }
}
