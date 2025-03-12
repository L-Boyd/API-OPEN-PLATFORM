package com.lbytech.apibackend.model.dto.user;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = -5070649326460199686L;

    private String userAccount;

    private String userPassword;
}

