package com.ssafy.flody.domain.boards.likes;

import com.ssafy.flody.domain.boards.Boards;
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
@Table(name = "b_likes")
@IdClass(BLikesId.class)
public class BLikes {
    @Id
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "use_no")
    private Long useNo;

    @Id
    @ManyToOne(targetEntity = Boards.class)
    @JoinColumn(name = "boa_no")
    private Long boaNo;
}
