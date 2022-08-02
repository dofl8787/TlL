package com.ssafy.flody.domain.boards.reports;

import com.ssafy.flody.domain.boards.Boards;
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
@Table(name = "b_reports")
@IdClass(BReportsId.class)
public class BReports {
    @Id
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "use_no")
    private Long useNo;

    @Id
    @ManyToOne(targetEntity = Boards.class)
    @JoinColumn(name = "boa_no")
    private Long boaNo;

    @NotNull
    private int type;

    private String content;
}
