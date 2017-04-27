package com.dnf.web.controller.recharge;

import com.dnf.web.service.recharge.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mr.dong on 2017/4/25.
 */
@Controller
@RequestMapping("recharge")
public class RechargeController {

    @Autowired
    private RechargeService rechargeService;

}
