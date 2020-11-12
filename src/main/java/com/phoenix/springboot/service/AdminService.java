package com.phoenix.springboot.service;

import com.phoenix.springboot.mapper.AdminMapper;
import com.phoenix.springboot.pojo.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminService {
    @Resource
    private AdminMapper adminMapper;

    public Admin selectById(int id) {
        return adminMapper.selectById(id);
    }

    public List<Admin> selectList() {
        return adminMapper.selectList();
    }

    public int insert(Admin admin) {
        return adminMapper.insert(admin);
    }

    public int updateById(Admin admin) {
        return adminMapper.updateById(admin);
    }

    public int deleteById(int id) {
        return adminMapper.deleteById(id);
    }
}
