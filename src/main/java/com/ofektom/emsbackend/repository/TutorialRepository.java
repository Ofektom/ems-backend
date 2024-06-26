package com.ofektom.emsbackend.repository;

import com.ofektom.emsbackend.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(Boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
