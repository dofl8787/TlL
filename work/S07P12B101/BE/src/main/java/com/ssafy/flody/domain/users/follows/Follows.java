package com.ssafy.flody.domain.users.follows;

import com.ssafy.flody.domain.users.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(FollowsId.class)
public class Follows {
    @Id
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "follower")
    private Long follower;

    @Id
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "following")
    private Long following;
}
