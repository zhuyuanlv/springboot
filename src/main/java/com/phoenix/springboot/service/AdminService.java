package com.phoenix.springboot.service;

import com.phoenix.springboot.pojo.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AdminService {
    List<Admin> queryAdminList();
}
