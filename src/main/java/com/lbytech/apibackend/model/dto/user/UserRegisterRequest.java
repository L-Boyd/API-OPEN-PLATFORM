package com.lbytech.apibackend.model.dto.user;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户注册请求体
 */
@Data
public class UserRegisterRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 9215914159235118045L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}


