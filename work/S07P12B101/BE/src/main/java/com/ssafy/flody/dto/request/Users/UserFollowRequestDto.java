package com.ssafy.flody.dto.request.Users;

import com.ssafy.flody.domain.users.follows.Follows;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserFollowRequestDto {
    private Long follower;
    private Long following;

    @Builder
    public UserFollowRequestDto(Long follower, Long following){
        this.follower = follower;
        this.following = following;
    }

    public Follows toEntity(){
        return Follows.builder()
                .follower(follower)
                .following(following)
                .build();
    }

}
