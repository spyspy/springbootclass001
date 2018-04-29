package com.springboot.class01;

import com.springboot.class01.dao.User;
import com.springboot.class01.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);

        List<User> list = userService.queryUserList();
        for(User user:list){
            System.out.println(user.getName()+" / "+user.getId()+" / "+user.getAddress());
        }

        //銷毀容器
        context.destroy();
    }
}
