package com.ssafy.flody.domain.comments.likes;

import com.ssafy.flody.domain.comments.Comments;
import com.ssafy.flody.domain.users.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "c_likes")
@IdClass(CLikesId.class)
public class CLikes {
    @Id
    @ManyToOne(targetEntity = Comments.class)
    @JoinColumn(name = "com_no")
    private Long comNo;

    @Id
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "use_no")
    private Long useNo;
}
