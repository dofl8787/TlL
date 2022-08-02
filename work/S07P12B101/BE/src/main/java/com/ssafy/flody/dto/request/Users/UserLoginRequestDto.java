package com.ssafy.flody.dto.request.Users;

//login > response token

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserLoginRequestDto {
    private String id;
    private String password;

    @Builder
    public UserLoginRequestDto(String id, String password){
        this.id = id;
        this.password = password;
    }

    //Entity에 직접 접근이 가능해야하는지 잘 모르겠기에 만들고 주석처리
/*    public Users toEntity(){
        return Users.builder()
                .id(id)
                .password(password)
                .build();
    }*/
}
