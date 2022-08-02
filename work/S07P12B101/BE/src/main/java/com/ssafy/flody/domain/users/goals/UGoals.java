package com.ssafy.flody.domain.users.goals;

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
@Table(name = "u_goals")
public class UGoals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ugNo;

    @NotNull
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "use_no")
    private Long useNo;

    @NotNull
    private String name;

    @NotNull
    private Date registDate;

    @NotNull
    private Date dueDate;
}
