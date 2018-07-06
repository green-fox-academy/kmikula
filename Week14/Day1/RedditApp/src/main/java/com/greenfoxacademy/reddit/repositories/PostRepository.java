package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepository extends CrudRepository<Post,Long> {
    ArrayList<Post>findAll();
    Post findPostByTitle(String title);
    Post findPostById(Long id);
}
