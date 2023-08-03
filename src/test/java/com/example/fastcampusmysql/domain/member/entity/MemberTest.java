package com.example.fastcampusmysql.domain.member.entity;

import com.example.fastcampusmysql.util.MemberFixtureFactory;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
class MemberTest {

    @DisplayName("회원은 닉네임을 변경할 수 있다.")
    @Test
    void changeNickname() {
        Member member = MemberFixtureFactory.create();
        String expected = "pnu";

        member.changeNickname(expected);

        Assertions.assertThat(expected).isEqualTo(member.getNickname());
//        LongStream.range(0, 10)
//                .mapToObj(i -> MemberFixtureFactory.create(i))
//                .forEach(member -> {
//                    System.out.println(member.getNickname());
//                });
    }

    @DisplayName("회원은 닉네임은 10자를 초과할 수 없다.")
    @Test
    void testNicknameMaxLength() {
        Member member = MemberFixtureFactory.create();
        String overMaxLengthName = "pnupnupnupnu";

        Assertions.assertThatThrownBy(() -> member.changeNickname(overMaxLengthName))
                .isInstanceOf(IllegalArgumentException.class);
//        LongStream.range(0, 10)
//                .mapToObj(i -> MemberFixtureFactory.create(i))
//                .forEach(member -> {
//                    System.out.println(member.getNickname());
//                });
    }
}