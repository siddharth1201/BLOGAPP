package com.example.blogApp.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.ActiveProfiles;


@DataJpaTest
@ActiveProfiles("test")
public class UserRepositoryTests {
    
    @Autowired
    UserRepository userRepository;

    @Test
    @Order(1)
    public void can_create_user(){
        var user = UserEntity.builder()
                    .username("sid")
                    .email("sid1234@gmail.com")
                    .build();

                    userRepository.save(user);

        
                
    }

    @Test
    @Order(2)
    void can_find_users(){

        var user = UserEntity.builder()
                    .username("sid")
                    .email("sid1234@gmail.com")
                    .build();

                    userRepository.save(user);

        var users = userRepository.findAll();

        Assertions.assertEquals(100, users.size());

    }


}

