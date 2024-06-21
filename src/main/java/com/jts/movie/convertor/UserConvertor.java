package com.jts.movie.convertor;

import com.jts.movie.entities.User;
import com.jts.movie.request.UserRequest;
import com.jts.movie.response.UserResponse;

public class UserConvertor {

    public static User userDtoToUser(UserRequest userRequest, String password) {
        User user = User.builder()
                .name(userRequest.getName())
                .age(userRequest.getAge())
                .address(userRequest.getAddress())
                .gender(userRequest.getGender())
                .mobileNo(userRequest.getMobileNo())
                .emailId(userRequest.getEmailId())
                .roles(userRequest.getRoles())
                .password(password)
                .build();

        return user;
    }

    public static UserResponse userToUserDto(User user) {
        UserResponse userDto = UserResponse.builder()
                .name(user.getName())
                .age(user.getAge())
                .address(user.getAddress())
                .gender(user.getGender())
                .build();

        return userDto;
    }
}
