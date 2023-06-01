package com.HauteHaven.FinalProject.controller;

import com.HauteHaven.FinalProject.Post;
import com.HauteHaven.FinalProject.repository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    //Returns .findAll() Method
    @GetMapping
    public List<Post> getPost() {
        return postRepository.findAll();
    }
/*
    //returns void type
    //calls postService.save(post)
    //listens at requestMapping endpoint
    //requires a requestBody
    @PostMapping
    public void savePost(@RequestBody Post post) {
        postService.save(post);
    }

    @DeleteMapping
    public void deletePost(@PathVariable Long id) {
        postService.deleteById(id);
    }

    @PutMapping
    public void updatePost(@RequestBody Post post) {
        postService.updatePost(post);
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id){
        Optional<Post> returned = postService.findPostByID(id);
        if(returned.isPresent()){
            return returned.get();
        }else {
            return new Post();
        }

    } */
}

