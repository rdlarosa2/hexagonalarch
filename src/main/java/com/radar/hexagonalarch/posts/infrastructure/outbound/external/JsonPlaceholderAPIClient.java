package com.radar.hexagonalarch.posts.infrastructure.outbound.external;

import com.radar.hexagonalarch.posts.domain.model.PostCommand;
import com.radar.hexagonalarch.posts.domain.model.PostQuery;
import lombok.NoArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@FeignClient(name = "typicode", url = "https://jsonplaceholder.typicode.com")
public interface JsonPlaceholderAPIClient {


    @PostMapping
    PostQuery create(PostCommand postCommand);

    @GetMapping("/{id}")
    PostQuery findPostById(@PathVariable Integer id);

    @GetMapping("/posts")
    List<PostQuery> getAllPosts();

    @GetMapping
    List<PostQuery> searchByParam(@RequestParam Map<String, String> params);

}
