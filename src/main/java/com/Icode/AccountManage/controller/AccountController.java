package com.Icode.AccountManage.controller;

import com.Icode.AccountManage.service.IAccountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Icode on 2017/8/3.
 * descript:账户管理
 */
@RestController
public class AccountController {
    @Resource
    IAccountService service;

    /**
     * 登录
     * @param userName ：用户名
     * @param password ：密码
     * @param rememberMe ：记住密码
     * @param autoLogin ：自动登录
     * @param response
     * @param request
     * @return
     */
    @RequestMapping(value="/login",method=RequestMethod.POST)
    @ResponseBody
    public String login(String userName, String password, String rememberMe, String autoLogin, HttpServletResponse response, HttpServletRequest request){
        return service.login(userName,password,rememberMe,autoLogin,response,request)+"";
    }

    /**
     * 注册
     * @param loginName ：登录名
     * @param loginPassword ：密码
     * @return
     */
    @RequestMapping(value="/register",method=RequestMethod.POST)
    @ResponseBody
    public String register(String loginName,String loginPassword){
        return service.register(loginName,loginPassword) + "";
    }

}
