//package com.example.redditclone2.service;
//
//import com.example.redditclone2.dto.SubredditDto;
////import com.example.redditclone2.mapper.SubredditMapper;
//import com.example.redditclone2.model.Subreddit;
//import com.example.redditclone2.repository.SubredditRepository;
//import jakarta.transaction.Transactional;
//import lombok.AllArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//@Slf4j
//public class SubredditServiceWithoutMapstruct {
//    private final SubredditRepository subredditRepository;
////    private final SubredditMapper subredditMapper;
//
//    public SubredditService(SubredditRepository subredditRepository) {
//        this.subredditRepository = subredditRepository;
////        this.subredditMapper = subredditMapper;
//    }
//
//    public List<SubredditDto> getAll(){
//        return subredditRepository.findAll()
//                .stream()
//                .map(this::mapToDto)
//                .toList();
//    }
//
//    public SubredditDto save(SubredditDto subredditDto){              ----------de retinut
//        Subreddit subreddit = subredditRepository.save(mapSubredditDto(subredditDto));
////        subredditDto.setId(subreddit.getId());
//        return mapToDto(subreddit);
////        return subredditDto;
//    }
//
//    private SubredditDto mapToDto(Subreddit subreddit){                 ---de retinut
//        return SubredditDto.builder()
//                .id(subreddit.getId())
//                .name(subreddit.getName())
//                .description(subreddit.getDescription())
//                .numberOfPosts(subreddit.getPosts()!= null ? subreddit.getPosts().size() : 0)
//                .build();
//    }
//
//    private Subreddit mapSubredditDto(SubredditDto subredditDto){                     ---- de retinut
//        return Subreddit.builder()
//                .id(subredditDto.getId())
//                .name(subredditDto.getName())
//                .description(subredditDto.getDescription())
//                .build();
//    }
//
////    private Subreddit mapToEntity(SubredditDto subredditDto){
////        return Subreddit.builder()
////                .id(subredditDto.getId())
////                .name(subredditDto.getName())
////                .description(subredditDto.getDescription())
////                .posts(subredditDto.)
////    }
//
//
//
//
////    public List<SubredditDto> getAllSubreddits(){
////        return subredditRepository.findAll()
////                .stream()
////                .map(SubredditMapper::mapSubredditToDto)
////                .toList();
//////                .map(SubredditMapper::mapSubredditToDto)
//////                .toList();
////    }
//
//
//}
