package com.radar.hexagonalarch.posts.infrastructure.outbound;

import com.radar.hexagonalarch.posts.domain.model.PostCommand;
import com.radar.hexagonalarch.posts.domain.model.PostQuery;
import com.radar.hexagonalarch.posts.domain.repository.PostCommandRepository;
import com.radar.hexagonalarch.posts.infrastructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostCommandRepositoryImpl implements PostCommandRepository {
    private final JsonPlaceholderAPIClient jsonPlaceholderAPIClient = null ;

    @Override
    public Optional<PostQuery> createPost(PostCommand postCommand) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.create(postCommand));
    }

    @Override
    public Optional<PostQuery> updatePost(PostCommand postCommand) {
        //Código a implementar
        return Optional.empty();
    }

    @Override
    public void deletePost(int id) {
        //Código a implementar
    }
}
