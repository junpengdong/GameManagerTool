package com.dnf.web.service.login;

import java.util.Map;

/**
 * Created by Mr.dong on 2017/4/25.
 */
public interface UserLoginService {

    Map<String, Object> userLogin(String account, String password);

}
