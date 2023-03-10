package com.bchvp.k8scourse.postservice.model.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PostResponse {
    private Long id;
    private Long authorId;
    private String text;
    private String topic;
    private LocalDate postedAt;
}
