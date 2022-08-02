package com.ssafy.flody.domain.users.follows;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class FollowsId implements Serializable {
    private Long follower;
    private Long following;
}
