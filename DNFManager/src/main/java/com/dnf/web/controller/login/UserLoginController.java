package com.dnf.web.controller.login;

import com.dnf.web.service.login.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tools.APIUtils;
import tools.HttpStatus;
import tools.MD5Utils;

import java.util.Map;

/**
 * Created by Mr.dong on 2017/4/25.
 */
@Controller
@RequestMapping("user")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> UserLogin(@RequestParam("account")String account,
                                         @RequestParam("password")String password){
        Map<String, Object> userMap = userLoginService.userLogin(account, MD5Utils.getPwd(password));
        if(userMap != null){
            return APIUtils.toMap(HttpStatus.SUCCESS.getValue(),true, userMap);
        }else{
            return APIUtils.toMap(HttpStatus.ERROR.getValue(),false);
        }
    }

}
