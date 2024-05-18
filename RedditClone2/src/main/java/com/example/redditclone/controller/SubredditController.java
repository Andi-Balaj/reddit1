package com.example.redditclone.controller;

import com.example.redditclone.dto.SubredditDto;
import com.example.redditclone.service.SubredditService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api/subreddit")
@Slf4j
public class SubredditController {
    private SubredditService subredditService;

    public SubredditController(SubredditService subredditService){
        this.subredditService = subredditService;
    }
    @PostMapping(path = "/save")
    public ResponseEntity<SubredditDto> createSubreddit(@RequestBody SubredditDto subredditDto){
          return ResponseEntity.status(HttpStatus.CREATED)
                  .body(subredditService.save(subredditDto));
    }
//    @GetMapping(path = "/all")
    @GetMapping(path = "/all")
    public ResponseEntity<List<SubredditDto>> getAllSubreddits(){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(subredditService.getAll());
    }
}
