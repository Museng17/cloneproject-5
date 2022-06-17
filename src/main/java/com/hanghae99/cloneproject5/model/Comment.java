package com.hanghae99.cloneproject5.model;

import com.hanghae99.cloneproject5.dto.CommentRegisterDto;
import com.hanghae99.cloneproject5.util.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Comment extends Timestamp {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column (nullable = false)
    private String content;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Board board;

    public Comment(String content, Board board, Member member) {
        this.content = content;
        this.board = board;
        this.member = member;
    }

    public void update(CommentRegisterDto registerDto) {

        this.content = registerDto.getContent();
    }
}
