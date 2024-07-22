package com.example.blogApp.user;


import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blogApp.user.dtos.CreateUserDTO;
import com.example.blogApp.user.dtos.UserResponse;



@RestController
@RequestMapping("/users")
public class UsersController {
    // private final UserService usersService;
    // private final ModelMapper modelMapper;
   

    // public UsersController(UserService usersService, ModelMapper modelMapper ) {
    //     this.usersService = usersService;
    //     this.modelMapper = modelMapper;
     
    // }

    // @PostMapping("")
    // ResponseEntity<UserResponse> signupUser(@RequestBody CreateUserDTO request) {
    //     UserEntity savedUser =  usersService.createUser(request);
    //     URI savedUserUri = URI.create("/users/" + savedUser.getId());
    //     var userResponse = modelMapper.map(savedUser, UserResponse.class);
        

    //     return ResponseEntity.created(savedUserUri)
    //             .body(userResponse);
    // }

    // @PostMapping("/login")
    // ResponseEntity<UserResponse> loginUser(@RequestBody LoginUserRequest request) {
    //     UserEntity savedUser =  usersService.loginUser(request.getUsername(), request.getPassword());
    //     var userResponse = modelMapper.map(savedUser, UserResponse.class);
    //     userResponse.setToken(
    //             jwtService.createJwt(savedUser.getId())
    //     );

    //     return ResponseEntity.ok(userResponse);
    // }


    // @ExceptionHandler({
    //         UsersService.UserNotFoundException.class,
    //         UsersService.InvalidCredentialsException.class
    // })
    // ResponseEntity<ErrorResponse> handleUserExceptions(Exception ex) {
    //     String message;
    //     HttpStatus status;

    //     if (ex instanceof UsersService.UserNotFoundException) {
    //         message = ex.getMessage();
    //         status = HttpStatus.NOT_FOUND;
    //     } else if (ex instanceof UsersService.InvalidCredentialsException) {
    //         message = ex.getMessage();
    //         status = HttpStatus.UNAUTHORIZED;
    //     } else {
    //         message = "Something went wrong";
    //         status = HttpStatus.INTERNAL_SERVER_ERROR;
    //     }

    //     ErrorResponse response = ErrorResponse.builder()
    //             .message(message)
    //             .build();

    //     return ResponseEntity.status(status).body(response);
    // }
}
