package com.example.fastcampusmysql.domain.follow.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Objects;

//Nickname: 반정규화, Join, Query, 별도 Table
//Join -> 의존성 강하게 생긴다, 아키텍쳐적으로 성능 문제 해결 어려워짐, 리팩토링 어려워짐, 캐시 조회 쿼리 사용 어려워짐
@Getter
public class Follow {
    final private Long id;
    final private Long fromMemberId;
    final private Long toMemberId;
    final private LocalDateTime createdAt;

    @Builder
    public Follow(Long id, Long fromMemberId, Long toMemberId, LocalDateTime createdAt) {
        this.id = id;
        this.fromMemberId = Objects.requireNonNull(fromMemberId);
        this.toMemberId = Objects.requireNonNull(toMemberId);
        this.createdAt = createdAt==null ? LocalDateTime.now() : createdAt;
    }
}
