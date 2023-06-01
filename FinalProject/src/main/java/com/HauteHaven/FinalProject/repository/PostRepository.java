package com.HauteHaven.FinalProject.repository;

import com.HauteHaven.FinalProject.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
