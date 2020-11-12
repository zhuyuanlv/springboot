package com.phoenix.springboot.mapper;

import com.phoenix.springboot.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminMapper {
    Admin selectById(int id);

    List<Admin> selectList();

    int insert(Admin admin);

    int updateById(Admin admin);

    int deleteById(int id);
}
