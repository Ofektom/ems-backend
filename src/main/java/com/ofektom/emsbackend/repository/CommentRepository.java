package com.ofektom.emsbackend.repository;

import com.ofektom.emsbackend.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findTutorialId(Long postId);
    void deleteByTutorialId(Long tutorialId);
}
