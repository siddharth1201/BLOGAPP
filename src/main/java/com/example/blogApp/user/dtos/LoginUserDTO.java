package com.example.blogApp.user.dtos;



import lombok.AccessLevel;
import lombok.Data;
import lombok.NonNull;
import lombok.Setter;

@Data
@Setter(AccessLevel.NONE)
public class LoginUserDTO {
    @NonNull
    private String username;
    @NonNull
    private String password;
}