package com.radar.hexagonalarch.posts.infrastructure.inbound.controllers;

import com.radar.hexagonalarch.posts.application.find.PostFindUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private PostFindUseCase postFindUseCase;

    @GetMapping("/{id}/posts")
    public ResponseEntity findAllPosts(@PathVariable Integer id){
        return ResponseEntity.ok( this.postFindUseCase.findAllPostsByUserId(id) );
    }
}
