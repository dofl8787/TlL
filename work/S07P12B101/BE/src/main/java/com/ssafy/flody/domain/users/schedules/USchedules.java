package com.ssafy.flody.domain.users.schedules;

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
@Table(name = "u_schedules")
public class USchedules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usNo;

    @NotNull
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "use_no")
    private Long useNo;

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
