package com.ssafy.flody.domain.boards;

import com.ssafy.flody.domain.boards.categories.Categories;
import com.ssafy.flody.domain.boards.coverages.Coverages;
import com.ssafy.flody.domain.users.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Boards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boaNo;

    @NotNull
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "use_no")
    private Long useNo;

    @NotNull
    @ManyToOne(targetEntity = Categories.class)
    @JoinColumn(name = "cat_no")
    private Long catNo;

    @NotNull
    @ManyToOne(targetEntity = Coverages.class)
    @JoinColumn(name = "cov_no")
    private Long covNo;

    private String title;

    private String content;

    private String hashtag;

    @NotNull
    private int likeCnt;

    @NotNull
    private int commentCnt;

    @NotNull
    private Date postDate;
}
