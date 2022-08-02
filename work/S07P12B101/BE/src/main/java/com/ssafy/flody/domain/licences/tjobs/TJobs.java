package com.ssafy.flody.domain.licences.tjobs;

import com.ssafy.flody.domain.licences.departments.Departments;
import com.ssafy.flody.domain.licences.fields.Fields;
import com.ssafy.flody.domain.licences.mfields.MFields;
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
@Table(name = "t_jobs")
@IdClass(TJobsId.class)
public class TJobs {
    @Id
    @ManyToOne(targetEntity = Fields.class)
    @JoinColumn(name = "fie_no")
    private Long fieNo;

    @Id
    @ManyToOne(targetEntity = MFields.class)
    @JoinColumn(name = "mf_no")
    private Long mfNo;

    @Id
    @ManyToOne(targetEntity = Departments.class)
    @JoinColumn(name = "dep_no")
    private Long depNo;
}
