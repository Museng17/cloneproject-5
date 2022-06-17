package com.hanghae99.cloneproject5.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class CommentResponseDto {

    private String username;
    private String content;
    private String createdAt;
}
