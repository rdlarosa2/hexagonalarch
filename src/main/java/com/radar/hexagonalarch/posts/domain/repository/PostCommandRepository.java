package com.radar.hexagonalarch.posts.domain.repository;

import com.radar.hexagonalarch.posts.domain.model.PostCommand;
import com.radar.hexagonalarch.posts.domain.model.PostQuery;

import java.util.Optional;

public interface PostCommandRepository {
    Optional<PostQuery> createPost(PostCommand postCommand);
    Optional<PostQuery> updatePost(PostCommand postCommand);
    void deletePost(int id);
}
