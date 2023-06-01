package com.HauteHaven.FinalProject.controller;

import com.HauteHaven.FinalProject.Post;
import com.HauteHaven.FinalProject.controller.dto.PostDto;
import com.HauteHaven.FinalProject.service.PostService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {

    final PostService postService;

    public PostController( PostService postService) {
        this.postService = postService;
    }

    //Returns .findAll() Method
    @GetMapping
    public List<Post> getPost() {
        return postService.findAll();
    }

    @PostMapping
    public Post save(@RequestBody PostDto postDto) {
        return postService.save(new Post( postDto ));
    }



    @DeleteMapping(" /{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deleteById(id);
    }

    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable Long id) {
        return postService.findPostByID((id));
    }

    @PutMapping( "/{id}")
    public Optional<Post> update( @RequestBody PostDto postDto, @PathVariable Long id ){
           Optional<Post> optionalPost = postService.findPostByID(id);
            Post post = optionalPost.orElse(null);
            post.setTitle( postDto.getTitle() );
            post.setDescription( postDto.getDescription() );
            post.setImageUrl( postDto.getImageUrl() );
            return Optional.ofNullable(postService.save(post));
        }
    }



