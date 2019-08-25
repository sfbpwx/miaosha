package com.miaoshaproject.service.model;

import lombok.Data;

@Data
public class UserModel {
    private Integer id;
    private String name;
    private Integer geender;
    private Integer age;
    private String telphone;
    private String registerMode;
    private String thirdPartyId;

    private String encrptPassword;
}
