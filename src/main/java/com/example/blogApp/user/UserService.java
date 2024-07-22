package com.example.blogApp.user;

import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blogApp.user.dtos.CreateUserDTO;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public UserEntity createUser(CreateUserDTO req){
        var newUser = UserEntity.builder()
                        .username(req.getUsername())
                        //todo encrypt password
                        .email(req.getPassword())
                        .build();


        return userRepository.save(newUser);

    }

    public UserEntity getUser(String username){
        return userRepository.findByUserName(username).orElseThrow(() -> new UsernNotFoundException(username));
    }


    public UserEntity getUser(Long userId){
        return userRepository.findById(userId).orElseThrow(() -> new UsernNotFoundException(userId));
    }

    public UserEntity loginUser(String username, String password){
        var user = userRepository.findByUserName(username).orElseThrow(() -> new UsernNotFoundException(username));

        // match password :todo

        return user;
    }

}
