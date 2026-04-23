package com.radar.hexagonalarch.posts.application.find;

import com.radar.hexagonalarch.posts.domain.model.PostQuery;
import com.radar.hexagonalarch.posts.domain.repository.PostQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
//@RequiredArgsConstructor
public class PostFindUseCase {

    @Autowired
    private PostQueryRepository postQueryRepository;

    public List<PostQuery> findAllPosts(){
        return this.postQueryRepository.findAllPosts();
    }
    public PostQuery findById(Integer id){
        return this.postQueryRepository.findById(id).orElseThrow();
    }
    public List<PostQuery> findAllPostsByUserId(Integer userId){
        return this.postQueryRepository.searchBy(Map.of("userId",String.valueOf(userId)));
    }
}
