package com.example.blogApp.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.example.blogApp.user.dtos.CreateUserDTO;

/**
 * UserServiceTests
 */

 @SpringBootTest
 @ActiveProfiles("test")
public class UserServiceTests {

    @Autowired
    UserService userService;

    @Test
    void can_create_user(){
        var user = userService.createUser(new CreateUserDTO("silly","pass","sid@gmail.com"));
        
        Assertions.assertNotNull(user);
        Assertions.assertEquals("silly", user.getUsername());
    }
    
}