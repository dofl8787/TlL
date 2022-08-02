package com.ssafy.flody.domain.dmessages.likes;

import com.ssafy.flody.domain.dmessages.DMessages;
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
@Table(name = "d_likes")
@IdClass(DLikesId.class)
public class DLikes {

    @Id
    @ManyToOne(targetEntity = DMessages.class)
    @JoinColumn(name = "dm_no")
    private Long dmNo;

    @Id
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "use_no")
    private Long useNo;

}
