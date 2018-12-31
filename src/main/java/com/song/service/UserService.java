package com.song.service;

import com.song.entity.User;
import com.song.entity.xinnaoxueguan;
import com.song.repository.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Song on 2017/2/15.
 * User业务逻辑
 */
@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;

    public xinnaoxueguan save(xinnaoxueguan xueguan){
        //System.out.print(xuegguan);
        try{
         //   user = userRepositoty.findByUserName(name);
           xueguan=userRepositoty.save(xueguan);
        }catch (Exception e){
            System.out.println("fail");
        }
        return xueguan;
    }
}
