package com.bchvp.k8scourse.postservice.model.dto.request;

import jakarta.validation.constraints.NotBlank;

public record UpdatePostRequest(@NotBlank String text, String topic) {
}
