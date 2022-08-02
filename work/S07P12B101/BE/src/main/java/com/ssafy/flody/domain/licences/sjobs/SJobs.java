package com.ssafy.flody.domain.licences.sjobs;

import com.ssafy.flody.domain.licences.departments.Departments;
import com.ssafy.flody.domain.licences.series.Series;
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
@Table(name = "s_jobs")
@IdClass(SJobsId.class)
public class SJobs {
    @Id
    @ManyToOne(targetEntity = Series.class)
    @JoinColumn(name = "ser_no")
    private Long serNo;

    @Id
    @ManyToOne(targetEntity = Departments.class)
    @JoinColumn(name = "dep_no")
    private Long depNo;
}
