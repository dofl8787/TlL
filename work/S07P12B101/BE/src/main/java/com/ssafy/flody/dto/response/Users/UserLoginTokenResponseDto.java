package com.ssafy.flody.dto.response.Users;

// 참고 : https://happy-my.tistory.com/28
// 다른 것과 다른 이유 : getToken을 할 곳이 없기 때문

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginTokenResponseDto {
    private String token;
}
