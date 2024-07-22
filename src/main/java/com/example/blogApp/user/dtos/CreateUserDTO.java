package com.example.blogApp.user.dtos;

import io.micrometer.common.lang.NonNull;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@AllArgsConstructor
@Setter(AccessLevel.NONE)
public class CreateUserDTO {
    @NonNull
    private String username;

    @NonNull
    private String password;

    @NonNull
    private String email;
}
