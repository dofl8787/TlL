package com.ssafy.flody.domain.licences;

import com.ssafy.flody.domain.licences.fields.Fields;
import com.ssafy.flody.domain.licences.mfields.MFields;
import com.ssafy.flody.domain.licences.series.Series;
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
public class Licences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long licNo;

    @NotNull
    @ManyToOne(targetEntity = Fields.class)
    @JoinColumn(name = "fie_no")
    private Long fieNo;

    @NotNull
    @ManyToOne(targetEntity = MFields.class)
    @JoinColumn(name = "mf_no")
    private Long mfNo;

    @NotNull
    @ManyToOne(targetEntity = Series.class)
    @JoinColumn(name = "ser_no")
    private Long serNo;

    @NotNull
    private int jmcd;

    @NotNull
    private String jmfldnm;

    @NotNull
    private String qualgbcd;
}
