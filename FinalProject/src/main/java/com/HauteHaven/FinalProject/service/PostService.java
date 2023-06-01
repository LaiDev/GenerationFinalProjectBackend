package com.HauteHaven.FinalProject.service;

import com.HauteHaven.FinalProject.Post;
import com.HauteHaven.FinalProject.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Optional<Post> findPostByID(Long postId){
        return postRepository.findById((postId));
    }

    public Post save(Post post) {
       return postRepository.save(post);
    }

    public void deleteById(Long postId){
        postRepository.deleteById(postId);
    }

}
