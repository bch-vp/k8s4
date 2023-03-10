package com.bchvp.k8scourse.postservice.repository;

import com.bchvp.k8scourse.postservice.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Long countAllByAuthorId(Long authorId);
}
