package com.dnf.web.service.recharge.impl;

import com.dnf.web.mapper.recharge.RechargeMapper;
import com.dnf.web.service.recharge.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mr.dong on 2017/4/25.
 */
@Service
public class RechargeServiceImpl implements RechargeService{

    @Autowired
    private RechargeMapper rechargeMapper;

}
