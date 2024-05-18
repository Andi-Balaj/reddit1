package com.example.redditclone.repository;

import com.example.redditclone.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
//    Optional<Subreddit> findBySubredditName(String subredditName);
}
