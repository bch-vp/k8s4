package com.bchvp.k8scourse.userservice.service;

import com.bchvp.k8scourse.userservice.model.dto.request.CreateUserRequest;
import com.bchvp.k8scourse.userservice.model.dto.response.UserResponse;
import com.bchvp.k8scourse.userservice.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User convert(CreateUserRequest createuserRequest);
    UserResponse convert(User user);
}
