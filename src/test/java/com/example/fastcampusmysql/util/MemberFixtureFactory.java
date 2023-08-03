package com.example.fastcampusmysql.util;

import com.example.fastcampusmysql.domain.member.entity.Member;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

//Object Mother: 테스트에 필요한 객체 생성 도와주는 클래스
public class MemberFixtureFactory {
    static public Member create() {
        EasyRandomParameters param = new EasyRandomParameters();
        return new EasyRandom(param).nextObject(Member.class);
    }

    static public Member create(Long seed) {
        EasyRandomParameters param = new EasyRandomParameters().seed(seed);
        return new EasyRandom(param).nextObject(Member.class);
    }
}
