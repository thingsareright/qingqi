package com.qingqi.controller;

import com.qingqi.entity.User;
import com.qingqi.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/13 0013.
 * 这个控制器用于处理关于EI表的数据请求（增删改查）
 */
@RestController
@RequestMapping("/user")    //这里主要是为了与管理员账户分开，所以不用"/"
public class UserDataController {

    @Autowired
    public UserRepository userRepository;


    //required=false 表示url中可以不穿入id参数，此时就使用默认参数
    /**
     * 这个方法主要是首次注册使用
     * 返回1表示这次是首次注册成功，返回0表示首次注册失败
     */
    @RequestMapping(value="/register")
    public String register(@RequestParam(value = "tel",required = false, defaultValue = "00000000000") String tel,
                            @RequestParam(value = "password", required = false, defaultValue = "00000000000") String password){

        if (tel.equals("00000000000") || tel.equals("00000000000"))
            return "0";
        List<User> userList = new ArrayList<>();
        userList = userRepository.findAllByTel(tel);
        if (userList.size() == 0){
            //检测到账号未注册，进行逻辑处理
            User user = new User(tel,password);
            userRepository.save(user);
            return "1";
        }
        return "0";
    }


}
