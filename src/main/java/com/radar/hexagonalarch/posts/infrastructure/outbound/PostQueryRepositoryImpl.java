package com.radar.hexagonalarch.posts.infrastructure.outbound;

import com.radar.hexagonalarch.posts.domain.model.PostQuery;
import com.radar.hexagonalarch.posts.domain.repository.PostQueryRepository;
import com.radar.hexagonalarch.posts.infrastructure.outbound.external.JsonPlaceholderAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostQueryRepositoryImpl implements PostQueryRepository {

    @Autowired
    private JsonPlaceholderAPIClient jsonPlaceholderAPIClient ; // = new JsonPlaceholderAPIClient()

    @Override
    public Optional<PostQuery> findById(int id) {
        return Optional.ofNullable(jsonPlaceholderAPIClient.findPostById(id));
    }

    @Override
    public List<PostQuery> searchBy(Map<String, String> params) {
        return jsonPlaceholderAPIClient.searchByParam(params);
    }

    @Override
    public List<PostQuery> findAllPosts() {
        return jsonPlaceholderAPIClient.getAllPosts();
    }
}
