package com.ex.blabboot.services;

import com.ex.blabboot.models.Post;
import com.ex.blabboot.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
//@Scope("prototype")
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    //this is necessary if we want spring to do "setter" injection
    //either "setter" or "constructor" injection should be used
    //to ensure operability outside of spring
    @Autowired
    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    @Transactional(readOnly=true)
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Post getById(Integer id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly=false, propagation= Propagation.REQUIRED)
    public int addNewPost(Post p) {
        return postRepository.save(p).getId();
    }
}
