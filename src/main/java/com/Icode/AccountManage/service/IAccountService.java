package com.Icode.AccountManage.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Icode on 2017/8/3.
 * descript:账户管理
 */
public interface IAccountService {
     int login(String userName, String password, String rememberMe, String autoLogin, HttpServletResponse response,HttpServletRequest request);
     int register(String loginName,String loginPassword);
}
