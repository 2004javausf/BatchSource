package com.ex.blabboot.services;


import com.ex.blabboot.models.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getById(Integer id);
    int addNewPost(Post p);
}
