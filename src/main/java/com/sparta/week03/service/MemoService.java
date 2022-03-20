package com.sparta.week03.service;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor // final이 있으면 생성자를 자동으로 넣어줌
@Service // 서비스라는 것을 알려줌
public class MemoService {

    private final MemoRepository memoRepository;
    //메모 서비스의 멤버변수로 리포지토리를 선언
    //아이디 값 등을 찾기 위해선 필수적으로 리포지토리가 필요하기 때문

    @Transactional //해당 정보가 DB에 정말 반영이 되어야한다고 알려줘야함
    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        memo.update(requestDto);
        return memo.getId();
    }
}