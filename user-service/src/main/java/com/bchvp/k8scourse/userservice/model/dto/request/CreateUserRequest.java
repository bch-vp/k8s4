package com.bchvp.k8scourse.userservice.model.dto.request;

import jakarta.validation.constraints.NotBlank;

public record CreateUserRequest(@NotBlank String username) {
}
