package com.jojoldu.book.springboot.config.auth.dto;

import com.jojoldu.book.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

//DTO를 사용하는 이유 : User클래스가 엔티티이기 때문에 다른 엔티티와 관계가 생기면 성능, 부수효과 등이 생기기 때문에 유지보수를 위해 Dto를 사용한다.
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}