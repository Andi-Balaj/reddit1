package com.example.redditclone.mapper;

import com.example.redditclone.dto.SubredditDto;
import com.example.redditclone.model.Post;
import com.example.redditclone.model.Subreddit;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SubredditMapper {
//    @Mapping(target = "numberOfPosts", source = "posts.size()")

    @Mapping(target = "numberOfPosts", source = "java(SubredditMapper.mapPosts(subreddit.getPosts()))")
    SubredditDto mapSubredditToDto(Subreddit subreddit);

    default Integer mapPosts(List<Post> posts){
        return posts.size();
    }

    @InheritInverseConfiguration
    @Mapping(target = "posts", ignore = true)
    Subreddit mapDtoToSubreddit(SubredditDto subredditDto);
}
