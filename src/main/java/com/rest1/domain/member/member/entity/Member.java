package com.rest1.domain.member.member.entity;

import com.rest1.domain.post.comment.entity.Comment;
import com.rest1.domain.post.post.entity.Post;
import com.rest1.global.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
public class Member extends BaseEntity {
    private String username;
    private String password;
    private String nickname;

    @OneToMany(mappedBy = "author")
    private List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy = "author")
    private List<Comment> comments = new ArrayList<>();

    public Member(String username, String password, String nickname) {

        this.username = username;
        this.password = password;
        this.nickname = nickname;
    }

    public String getName(){
        return this.nickname;
    }
}
