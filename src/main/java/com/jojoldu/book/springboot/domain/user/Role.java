package com.jojoldu.book.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
//사용자 관리 enum
public enum Role {
    //스프링 시큐리티에서는 권한 코드에 항상 ROLE이 앞에 있어야만 합니다. 그래서 코드별 키 값을 ROLE_GUEST, ROLE_USER 등으로 지정합니다.
    GUEST("ROLE_GUEST","손님"),
    USER("ROLE_USER","일반 사용자");

    private final String key;
    private final String title;
}
