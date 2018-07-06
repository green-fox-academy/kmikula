package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.InputData;
import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PostsController {

    final PostService postService;

    @Autowired
    public PostsController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public ArrayList<Post> listPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts = postService.listPosts();
        return posts;
    }

    @PostMapping("/posts")
    public Post addNewPost(@RequestBody InputData inputData) {

        return postService.addPost(inputData.getTitle(), inputData.getUrl());
    }

    @PutMapping("/posts/{id}/upvote")
    public Post upVote(@PathVariable(value = "id") Long id) {

        return postService.upVote(id);
    }

    @PutMapping("/posts/{id}/downvote")
    public Post downVote(@PathVariable(value = "id") Long id) {

        return postService.downVote(id);
    }
}
