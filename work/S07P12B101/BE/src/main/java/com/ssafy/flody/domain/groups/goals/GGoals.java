package com.ssafy.flody.domain.groups.goals;

import com.ssafy.flody.domain.groups.Groups;
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
@Table(name = "g_goals")
public class GGoals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ggNo;

    @NotNull
    @ManyToOne(targetEntity = Groups.class)
    @JoinColumn(name = "gro_no")
    private Long groNo;

    @NotNull
    private String name;

    @NotNull
    private Date registDate;

    @NotNull
    private Date dueDate;
}
