package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
        Post post = new Post("FirstPost", "www.9gag.com", 82);
        Post post2 = new Post("SecondPost", "www.9gag.com", 354);
        postRepository.save(post);
        postRepository.save(post2);
    }

    @Override
    public ArrayList<Post> listPosts() {

        return postRepository.findAll();
    }

    @Override
    public Post addPost(String title, String url) {
        Post post = new Post();
        post.setTitle(title);
        post.setUrl(url);

        postRepository.save(post);
        return postRepository.findPostByTitle(title);
    }

    @Override
    public Post upVote(Long id) {


        Integer newScore = postRepository.findPostById(id).getScore() + 1;
        postRepository.findPostById(id).setScore(newScore);
        postRepository.save(postRepository.findPostById(id));

        System.out.println(postRepository.findPostById(id).getScore());

        return postRepository.findPostById(id);
    }

    @Override
    public Post downVote(Long id) {
        Integer newScore = postRepository.findPostById(id).getScore() - 1;
        postRepository.findPostById(id).setScore(newScore);
        postRepository.save(postRepository.findPostById(id));

        System.out.println(postRepository.findPostById(id).getScore());

        return postRepository.findPostById(id);
    }

}
