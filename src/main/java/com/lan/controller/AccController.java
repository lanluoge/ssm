package com.lan.controller;

import com.lan.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author xuminghao
 */
@Controller
public class AccController {
    @Autowired
    AccountDao dao;
    @RequestMapping("/aaa")
    @ResponseBody
    public List select(){
        return dao.findAll();
    }
}
