package com.example.redditclone.repository;

import com.example.redditclone.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
//    List<Post> findPostByTitle(String title);
}
