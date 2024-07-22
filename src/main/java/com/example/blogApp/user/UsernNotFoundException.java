package com.example.blogApp.user;

public class UsernNotFoundException extends IllegalArgumentException{

    public UsernNotFoundException(String username){
        super("User"+username+"not found");
    }

    public UsernNotFoundException(Long authorId){
        super("User"+authorId+"Not Found");
    }
}
