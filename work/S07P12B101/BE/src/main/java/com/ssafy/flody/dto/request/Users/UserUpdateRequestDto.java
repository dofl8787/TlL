package com.ssafy.flody.dto.request.Users;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 정보수정 : id 제외하고 변경 가능
// 추가 기능 : 비밀번호 찾기 및 수정 따로 빼야하지 않을까?
@Getter
@NoArgsConstructor
public class UserUpdateRequestDto {
    private String password;
    private String profile;
    private String nickname;
    private String address;
    private String phone;
    private Boolean admin;

    @Builder
    public UserUpdateRequestDto(
            String password, String profile, String nickname,
            String address, String phone, Boolean admin
    ){
        this.password = password;
        this.profile = profile;
        this.nickname = nickname;
        this.address = address;
        this.phone = phone;
        this.admin = admin;
    }
}
