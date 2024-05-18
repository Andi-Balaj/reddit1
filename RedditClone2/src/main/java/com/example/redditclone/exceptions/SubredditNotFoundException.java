package com.example.redditclone.exceptions;

public class SubredditNotFoundException extends RuntimeException{
    SubredditNotFoundException(String message){
        super(message);
    }
}
