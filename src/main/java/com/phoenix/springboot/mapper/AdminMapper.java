package com.phoenix.springboot.mapper;

import com.phoenix.springboot.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AdminMapper {
    Admin selectOne(int id);
}
