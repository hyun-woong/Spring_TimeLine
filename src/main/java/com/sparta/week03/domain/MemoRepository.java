package com.sparta.week03.domain;

//Repository 꼭 클래스가 아닌 인터페이스로 만들 것
//인터페이스란? 클래스에서 멤버변수가 없는, 메소드만 있는 친구

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    //메모 리포지토라가, 가져다 쓸 것임(상속), 미리 작성된 여러 코드들(find, save 등등)
    //Memo라는 클래스의 Id는 Long이라는 녀석에 가져다 쓸 것임을 명시

    List<Memo> findAllByOrderByModifiedAtDesc();
    //전부 다 찾아서, 수정 날짜 기준으로 내림차순(최신)정렬을 해달라는 의미
}
