package com.example.miaosha;

import com.miaoshaproject.dao.UserDoMapper;
import com.miaoshaproject.dataobject.UserDo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.miaoshaproject"})
@RestController
@MapperScan("com.miaoshaproject.dao")
public class app {
    @Autowired
    private UserDoMapper userDoMapper;


    @RequestMapping("/")
    public String home(){
        UserDo userDo = userDoMapper.selectByPrimaryKey(1);
        if(userDo==null){
            return "用户对象不存在";
        }
        return "已经查到对象";
    }


    public static void main(String args[]){
        System.out.println("hello world");
        SpringApplication.run(app.class,args);
    }
}
