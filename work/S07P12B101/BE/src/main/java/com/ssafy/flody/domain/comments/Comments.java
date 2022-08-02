package com.ssafy.flody.domain.comments;

import com.ssafy.flody.domain.boards.Boards;
import com.ssafy.flody.domain.users.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comNo;

    @NotNull
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "use_no")
    private Long useNo;

    @NotNull
    @ManyToOne(targetEntity = Boards.class)
    @JoinColumn(name = "boa_no")
    private Long boaNo;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "fk_comments_upper_comments_comno", referencedColumnName = "com_no")
//    private Comments upper;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parent", cascade = CascadeType.ALL)
//    private List<Comments> upper;

    @NotNull
    private String comment;

    @NotNull
    private Date postDate;

    @NotNull
    private int kids;
}
