package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface PostService {

    ArrayList<Post>listPosts();

    Post addPost(String title, String url);

    Post upVote(Long id);
}
