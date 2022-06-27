package com.codeup.backendapi.dto;

public class PostDto {
    private String comments;


    public PostDto(String comments) {
        this.comments = comments;
    }

    public PostDto(){}

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "comments='" + comments + '\'' +
                '}';
    }
}
