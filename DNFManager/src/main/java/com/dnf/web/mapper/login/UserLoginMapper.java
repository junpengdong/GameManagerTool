package com.dnf.web.mapper.login;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Mr.dong on 2017/4/25.
 */
@Repository
public interface UserLoginMapper {

    @Select("SELECT accountname,UID,VIP FROM d_taiwan.accounts WHERE accountname=#{account} AND password=#{password}")
    Map<String, Object> userLogin(@Param("account") String account, @Param("password") String password);

}
