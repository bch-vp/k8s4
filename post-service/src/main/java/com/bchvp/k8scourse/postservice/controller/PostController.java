package com.bchvp.k8scourse.postservice.controller;

import com.bchvp.k8scourse.postservice.model.dto.request.CreatePostRequest;
import com.bchvp.k8scourse.postservice.model.dto.request.UpdatePostRequest;
import com.bchvp.k8scourse.postservice.model.dto.response.PostResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/posts")
public interface PostController {
    @PostMapping
    ResponseEntity<PostResponse> publishPost(@RequestBody CreatePostRequest createPostRequest);

    @GetMapping("/{id}")
    ResponseEntity<PostResponse> getPost(@PathVariable("id") Long id);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deletePost(@PathVariable("id") Long id);

    @PutMapping("/{id}")
    ResponseEntity<PostResponse> updatePost(@PathVariable("id") Long id,
                                            @Valid @RequestBody UpdatePostRequest updatePostRequest);
}
