package com.example.redditclone.service;

import com.example.redditclone.dto.SubredditDto;
//import com.example.redditclone2.mapper.SubredditMapper;
import com.example.redditclone.mapper.SubredditMapper;
import com.example.redditclone.model.Subreddit;
import com.example.redditclone.repository.SubredditRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SubredditService {
    private final SubredditRepository subredditRepository;
    private final SubredditMapper subredditMapper;

    public SubredditService(SubredditRepository subredditRepository, SubredditMapper subredditMapper) {
        this.subredditRepository = subredditRepository;
        this.subredditMapper = subredditMapper;
    }

    public List<SubredditDto> getAll(){
        return subredditRepository.findAll()
                .stream()
                .map(this::mapToDto)
                .toList();
    }

    public SubredditDto save(SubredditDto subredditDto){
//        Subreddit subreddit = subredditRepository.save(mapSubredditDto(subredditDto));
        Subreddit subreddit = subredditRepository.save(subredditMapper.mapDtoToSubreddit(subredditDto));
        return subredditMapper.mapSubredditToDto(subreddit);



//        subredditDto.setId(subreddit.getId());
//        return mapToDto(subreddit);
//        return subredditDto;
    }




    private SubredditDto mapToDto(Subreddit subreddit){
        return SubredditDto.builder()
                .id(subreddit.getId())
                .name(subreddit.getName())
                .description(subreddit.getDescription())
                .numberOfPosts(subreddit.getPosts()!= null ? subreddit.getPosts().size() : 0)
                .build();
    }

    private Subreddit mapSubredditDto(SubredditDto subredditDto){
        return Subreddit.builder()
                .id(subredditDto.getId())
                .name(subredditDto.getName())
                .description(subredditDto.getDescription())
                .build();
    }



//    private Subreddit mapToEntity(SubredditDto subredditDto){
//        return Subreddit.builder()
//                .id(subredditDto.getId())
//                .name(subredditDto.getName())
//                .description(subredditDto.getDescription())
//                .posts(subredditDto.)
//    }




//    public List<SubredditDto> getAllSubreddits(){
//        return subredditRepository.findAll()
//                .stream()
//                .map(SubredditMapper::mapSubredditToDto)
//                .toList();
////                .map(SubredditMapper::mapSubredditToDto)
////                .toList();
//    }
}
