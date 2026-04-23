package com.radar.hexagonalarch.posts.infrastructure.inbound.controllers;

import com.radar.hexagonalarch.posts.application.find.PostFindUseCase;
import com.radar.hexagonalarch.posts.domain.model.PostQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostFindUseCase postFindUseCase;

    @GetMapping
    public ResponseEntity<List<PostQuery>> findAllPosts(){
        return ResponseEntity.ok(this.postFindUseCase.findAllPosts());
    }
}
