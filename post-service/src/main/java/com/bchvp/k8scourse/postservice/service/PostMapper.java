package com.bchvp.k8scourse.postservice.service;

import com.bchvp.k8scourse.postservice.model.Post;
import com.bchvp.k8scourse.postservice.model.dto.request.CreatePostRequest;
import com.bchvp.k8scourse.postservice.model.dto.response.PostResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = DateMapper.class)
public interface PostMapper {

    Post convert(CreatePostRequest request);
    PostResponse convert(Post post);
}
