package com.lbytech.apibackend.service;

/**
 * 用户相关服务接口
 *
 * @author lby
 */
public interface UserService {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    Long userRegister(String userAccount, String userPassword, String checkPassword);
}
