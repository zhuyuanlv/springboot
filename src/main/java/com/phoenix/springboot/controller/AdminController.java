package com.phoenix.springboot.controller;

import com.phoenix.springboot.pojo.Admin;
import com.phoenix.springboot.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AdminController {
    @Resource
    private AdminService adminService;

    //测试界面
    @RequestMapping("test")
    public String test() {
        return "infoList";
    }

    //初始界面
    @RequestMapping("index")
    public String index() {
        return "index";
    }

    //登录操作
    @RequestMapping("login")
    public String login(Admin admin) {
        if ("admin".equals(admin.getUsername()) && "admin".equals(admin.getPassword())) {
            return "redirect:/infoList";
        } else {
            return "redirect:/errorPage";
        }
    }

    @ResponseBody
    @RequestMapping("infoListJson")
    public List<Admin> infoListJson(String id) {
        List<Admin> adminList = selectList();
        return adminList;
    }

    //数据列表
    @RequestMapping("infoList")
    public String infoList(Model model) {
        List<Admin> adminList = selectList();
        model.addAttribute("adminList", adminList);
        return "infoList";
    }

    //根据ID查询
    @RequestMapping("selectById")
    public Admin selectById(int id) {
        return adminService.selectById(id);
    }

    //查列表
    @RequestMapping("selectList")
    public List<Admin> selectList() {
        return adminService.selectList();
    }

    //跳转新增用户界面
    @RequestMapping("addUser")
    public String addUser() {
        return "addUser";
    }

    //新增用户操作
    @RequestMapping("insert")
    public String insert(Admin admin) {
        int resultCode = adminService.insert(admin);
        if (resultCode >= 1) {
            return "redirect:/infoList";
        } else {
            return "redirect:/errorPage";
        }
    }

    //跳转更新页面
    @RequestMapping("update")
    public String update(int id, Model model) {
        Admin admin = selectById(id);
        model.addAttribute("admin", admin);
        return "update";
    }

    //根据ID更新操作
    @RequestMapping("updateById")
    public String updateById(Admin admin) {
        int resultCode = adminService.updateById(admin);
        if (resultCode >= 1) {
            return "redirect:/infoList";
        } else {
            return "redirect:/errorPage";
        }
    }

    //根据ID删除操作
    @RequestMapping("deleteById")
    public String deleteById(int id) {
        int resultCode = adminService.deleteById(id);
        if (resultCode >= 1) {
            return "redirect:/infoList";
        } else {
            return "redirect:/errorPage";
        }
    }

    //错误页面重定向
    @RequestMapping("errorPage")
    public String error(Admin admin) {
        return "error";
    }
}
