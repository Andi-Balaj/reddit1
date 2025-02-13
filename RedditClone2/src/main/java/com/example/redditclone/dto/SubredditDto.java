package com.example.redditclone.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubredditDto {
    private long id;
    @NotBlank(message = "Community name required")
    private String name;
    @NotBlank(message = "Description is required")
    private String description;
    private Integer numberOfPosts;

}
