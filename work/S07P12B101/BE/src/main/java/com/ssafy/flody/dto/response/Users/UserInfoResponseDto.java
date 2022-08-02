package com.ssafy.flody.dto.response.Users;

import com.ssafy.flody.domain.users.Users;
import lombok.Getter;

@Getter
public class UserInfoResponseDto {
    private Long useNo;
    private String id;
    private String password;
    private String profile;
    private String name;
    private String nickname;
    private String address;
    private String phone;

    public UserInfoResponseDto(Users entity){
        this.useNo = entity.getUseNo();
        this.id = entity.getId();
        this.password = entity.getPassword();
        this.profile = entity.getProfile();
        this.name = entity.getName();
        this.nickname = entity.getNickname();
        this.address = entity.getAddress();
        this.phone = entity.getPhone();
    }
}
