package com.jojoldu.book.springboot.domain.user;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column
    private String picture;

    //JPA로 데이터베이스를 저장할 떄 Enum 값을 어떤 형태로 저장할지 결정합니다.
    //기본적으로 int로 된 숫자가 저장됩니다.
    //숫자로 저장되면 데이터베이스로 확인할 떄 그 값이 무슨 코드를 의미하는지를 알 수가 없습니다.
    //그래서 문자열(EnumType.STRING)으로 저장될 수 있도록 선언합니다.
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public User(String name, String email, String picture, Role role) {
        this.name = name;
        this.email = email;
        this.picture = picture;
        this.role = role;
    }

    public String getRoleKey(){
        return this.role.getKey();
    }
}