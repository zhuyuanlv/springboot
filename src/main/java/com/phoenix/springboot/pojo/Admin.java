package com.phoenix.springboot.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Admin implements Serializable {
    private static final long serialVersionUID = 1673900632029145920L;
    private int id;
    private String username;
    private String password;
}
