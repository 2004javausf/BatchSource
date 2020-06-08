package com.ex.blabboot.web;


import com.ex.blabboot.models.Post;
import com.ex.blabboot.services.PostService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("posts")
public class PostController implements ApplicationContextAware {
    private ApplicationContext context;
    private PostService postService;

    @Autowired
    public void setPostService(PostService postService) {
        this.postService = postService;
    }

//    @RequestMapping(path="post", method= RequestMethod.GET)
    @GetMapping(path="post", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getPostOrPosts(@RequestParam(value = "post_id", required = false) Integer postId,
                                                 HttpServletRequest req) {
        if(postId != null) {
            Post p = postService.getById(postId);
            if(p != null) {
                return new ResponseEntity<>(p, HttpStatus.OK);
            }
        } else {
            List<Post> posts = postService.getAllPosts();
            return new ResponseEntity<>(posts, HttpStatus.OK);
        }
        return new ResponseEntity<>((Object)null, HttpStatus.NOT_FOUND);
    }

    @PostMapping(path="new", consumes={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Object> newPost(@RequestBody Post p) {
        try {
            int id = postService.addNewPost(p);
            p.setId(id);
        } catch(Exception ex) {
            return new ResponseEntity<>((Object)null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(p, HttpStatus.CREATED);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
