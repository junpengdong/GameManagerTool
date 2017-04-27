package com.dnf.web.service.login.impl;

import com.dnf.web.mapper.login.UserLoginMapper;
import com.dnf.web.service.login.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Mr.dong on 2017/4/25.
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginMapper userLoginMapper;

    public Map<String, Object> userLogin(String account, String password) {
        return userLoginMapper.userLogin(account, password);
    }
}
