package com.codeup.backendapi.web;
import com.codeup.backendapi.data.Posts;
import com.codeup.backendapi.dto.PostDto;
import com.codeup.backendapi.service.PostService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/reports/posts", headers = "Accept=application/json")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }


    @PostMapping
    public void createPost(@RequestBody PostDto dto, Long id) {
        Posts posts = new Posts();
         postService.addPost(dto, posts, id);

    }

}
