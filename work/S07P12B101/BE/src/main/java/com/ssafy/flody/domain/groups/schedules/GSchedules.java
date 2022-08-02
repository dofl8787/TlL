package com.ssafy.flody.domain.groups.schedules;

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
@Table(name = "g_schedules")
public class GSchedules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gsNo;

    @NotNull
    @ManyToOne(targetEntity = Groups.class)
    @JoinColumn(name = "gro_no")
    private Long groNo;

    @NotNull
    private String title;

    private String detail;

    @NotNull
    private Date startDate;

    @NotNull
    private Date endDate;

    @NotNull
    private Boolean done;
}
