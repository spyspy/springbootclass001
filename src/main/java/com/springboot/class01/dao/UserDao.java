package com.springboot.class01.dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    public List<User> queryList(){
        List<User> result = new ArrayList<User>();
        for(int i=0;i<10;i++){
          User user = new User();
          user.setName("name_"+i);
          user.setId("ID_"+i);
          user.setAddress("Address_"+i);
          result.add(user);
        }

        return result;
    }
}
