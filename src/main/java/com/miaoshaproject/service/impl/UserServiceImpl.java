package com.miaoshaproject.service.impl;

import com.miaoshaproject.dao.UserDoMapper;
import com.miaoshaproject.dao.UserPasswordDoMapper;
import com.miaoshaproject.dataobject.UserDo;
import com.miaoshaproject.dataobject.UserPasswordDo;
import com.miaoshaproject.service.UserService;
import com.miaoshaproject.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDoMapper userDoMapper;
    @Autowired
    private UserPasswordDoMapper userPasswordDoMapper;

    @Override
    public UserModel getUserById(Integer id){
        UserDo userDo = userDoMapper.selectByPrimaryKey(id);
        UserPasswordDo userPasswordDo = userPasswordDoMapper.selectByUserId(id);
        return converetFromDataObject(userDo,userPasswordDo);
    }
    private UserModel converetFromDataObject(UserDo userDo, UserPasswordDo userPasswordDo){
        if(userDo==null){
            return null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDo,userModel);
        userModel.setEncrptPassword(userPasswordDo.getEncrptPassword());
        return userModel;
    }
}
