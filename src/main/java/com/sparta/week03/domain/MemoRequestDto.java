package com.sparta.week03.domain;

import lombok.Getter;

@Getter
public class MemoRequestDto {
    //필요한 정보를 물고 다니는 친구
    //수정 요청이 왔을 때, 누가 작성했는지, 어떤 컨텐츠(내용)을 변경할건지 알아야함
    private String username;
    private String contents;
    //private은 그냥 가져 올 수 없기 때문에, Getter 작성해줌
}
